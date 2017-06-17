/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2013, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.]
 *
 * ----------------------
 * ChartTransferable.java
 * ----------------------
 * (C) Copyright 2009-2013, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-Apr-2009 : Version 1, with inspiration from patch 1460845 (DG);
 * 05-May-2009 : Match the scaling options provided by the ChartPanel
 *               class (DG);
 *
 */

package org.jfree.chart;

import java.awt.Graphics2D;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * A class used to represent a chart on the clipboard.
 *
 * @since 1.0.13
 */
public class ChartTransferable implements Transferable {

    /** The data flavor. */
    final DataFlavor imageFlavor = new DataFlavor(
            "image/x-java-image; class=java.awt.Image", "Image");    
    
    /** The chart. */
    private JFreeChart chart;

    /** The width of the chart on the clipboard. */
    private int width;

    /** The height of the chart on the clipboard. */
    private int height;

    /**
     * The smallest width at which the chart will be drawn (if necessary, the
     * chart will then be scaled down to fit the requested width).
     *
     * @since 1.0.14
     */
    private int minDrawWidth;

    /**
     * The smallest height at which the chart will be drawn (if necessary, the
     * chart will then be scaled down to fit the requested height).
     *
     * @since 1.0.14
     */
    private int minDrawHeight;

    /**
     * The largest width at which the chart will be drawn (if necessary, the 
     * chart will then be scaled up to fit the requested width). 
     * 
     * @since 1.0.14
     */
    private int maxDrawWidth;

    /**
     * The largest height at which the chart will be drawn (if necessary, the
     * chart will then be scaled up to fit the requested height).
     *
     * @since 1.0.14
     */
    private int maxDrawHeight;

    /**
     * Creates a new chart selection.
     *
     * @param chart  the chart.
     * @param width  the chart width.
     * @param height  the chart height.
     */
    public ChartTransferable(JFreeChart chart, int width, int height) {
        this(chart, width, height, true);
    }

    /**
     * Creates a new chart selection.
     *
     * @param chart  the chart.
     * @param width  the chart width.
     * @param height  the chart height.
     * @param cloneData  clone the dataset(s)?
     */
    public ChartTransferable(JFreeChart chart, int width, int height,
            boolean cloneData) {
        this(chart, width, height, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE,
                true);
    }

    /**
     * Creates a new chart selection.  The minimum and maximum drawing
     * dimensions are used to match the scaling behaviour in the
     * {@link ChartPanel} class.
     *
     * @param chart  the chart.
     * @param width  the chart width.
     * @param height  the chart height.
     * @param minDrawW  the minimum drawing width.
     * @param minDrawH  the minimum drawing height.
     * @param maxDrawW  the maximum drawing width.
     * @param maxDrawH  the maximum drawing height.
     * @param cloneData  clone the dataset(s)?
     *
     * @since 1.0.14
     */
    public ChartTransferable(JFreeChart chart, int width, int height,
            int minDrawW, int minDrawH, int maxDrawW, int maxDrawH,
            boolean cloneData) {

        // we clone the chart because presumably there can be some delay
        // between putting this instance on the system clipboard and
        // actually having the getTransferData() method called...
        try {
            this.chart = (JFreeChart) chart.clone();
        }
        catch (CloneNotSupportedException e) {
            this.chart = chart;
        }
        // FIXME: we've cloned the chart, but the dataset(s) aren't cloned
        // and we should do that
        this.width = width;
        this.height = height;
        this.minDrawWidth = minDrawW;
        this.minDrawHeight = minDrawH;
        this.maxDrawWidth = maxDrawW;
        this.maxDrawHeight = maxDrawH;
    }

    /**
     * Returns the data flavors supported.
     * 
     * @return The data flavors supported.
     */
    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[] {this.imageFlavor};
    }

    /**
     * Returns <code>true</code> if the specified flavor is supported.
     *
     * @param flavor  the flavor.
     *
     * @return A boolean.
     */
    @Override
    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return this.imageFlavor.equals(flavor);
    }

    /**
     * Returns the content for the requested flavor, if it is supported.
     *
     * @param flavor  the requested flavor.
     *
     * @return The content.
     *
     * @throws java.awt.datatransfer.UnsupportedFlavorException
     * @throws java.io.IOException
     */
    @Override
    public Object getTransferData(DataFlavor flavor)
            throws UnsupportedFlavorException, IOException {
        
        if (this.imageFlavor.equals(flavor)) {
            return createBufferedImage(this.chart, new CreateBufferedImageParameter(this.width, this.height), this.minDrawWidth,
                    this.minDrawHeight, this.maxDrawWidth, this.maxDrawHeight);
        }
        else {
            throw new UnsupportedFlavorException(flavor);
        }
    }

    /**
     * A utility method that creates an image of a chart, with scaling.
     *
     * @param chart  the chart.
     * @param parameterObject TODO
     * @param minDrawW  the minimum width for chart drawing.
     * @param minDrawH  the minimum height for chart drawing.
     * @param maxDrawW  the maximum width for chart drawing.
     * @param maxDrawH  the maximum height for chart drawing.
     * @return  A chart image.
     *
     * @since 1.0.14
     */
    private BufferedImage createBufferedImage(JFreeChart chart, CreateBufferedImageParameter parameterObject, int minDrawW,
            int minDrawH, int maxDrawW, int maxDrawH) {

        BufferedImage image = new BufferedImage(parameterObject.w, parameterObject.h,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();

        boolean scale = scale(parameterObject.w, parameterObject.h, minDrawW, minDrawH, maxDrawW, maxDrawH);
		double drawWidth = parameterObject.w;
        double drawHeight = parameterObject.h;
        double scaleX = 1.0;
        double scaleY = 1.0;
        if (drawWidth < minDrawW) {
            scaleX = drawWidth / minDrawW;
            drawWidth = minDrawW;
        }
        else if (drawWidth > maxDrawW) {
            scaleX = drawWidth / maxDrawW;
            drawWidth = maxDrawW;
        }
        scaleY = scaleY(minDrawH, maxDrawH, drawHeight, scaleY);
		if (drawHeight < minDrawH) {
            drawHeight = minDrawH;
        }
        else if (drawHeight > maxDrawH) {
            drawHeight = maxDrawH;
        }

        chart(chart, g2, drawWidth, drawHeight);
		if (scale) {
            AffineTransform st = AffineTransform.getScaleInstance(scaleX,
                    scaleY);
            g2.transform(st);
        }
        g2.dispose();
        return image;

    }

	private boolean scale(int w, int h, int minDrawW, int minDrawH, int maxDrawW, int maxDrawH) {
		boolean scale = false;
		double drawWidth = w;
		double drawHeight = h;
		if (drawWidth < minDrawW) {
			scale = true;
		} else if (drawWidth > maxDrawW) {
			scale = true;
		}
		if (drawHeight < minDrawH) {
			scale = true;
		} else if (drawHeight > maxDrawH) {
			scale = true;
		}
		return scale;
	}

	private double scaleY(int minDrawH, int maxDrawH, double drawHeight, double scaleY) {
		if (drawHeight < minDrawH) {
			scaleY = drawHeight / minDrawH;
		} else if (drawHeight > maxDrawH) {
			scaleY = drawHeight / maxDrawH;
		}
		return scaleY;
	}

	private void chart(JFreeChart chart, Graphics2D g2, double drawWidth, double drawHeight) {
		Rectangle2D chartArea = new Rectangle2D.Double(0.0, 0.0, drawWidth, drawHeight);
		chart.draw(g2, chartArea, null, null);
	}

}
