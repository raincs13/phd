package org.jfree.chart;

import java.awt.geom.Rectangle2D;

import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.Size2D;

public class CreateAlignedRectangle2DParameter3 {
	public Size2D dimensions;
	public Rectangle2D frame;
	public HorizontalAlignment hAlign;

	public CreateAlignedRectangle2DParameter3(Size2D dimensions, Rectangle2D frame, HorizontalAlignment hAlign) {
		this.dimensions = dimensions;
		this.frame = frame;
		this.hAlign = hAlign;
	}
}