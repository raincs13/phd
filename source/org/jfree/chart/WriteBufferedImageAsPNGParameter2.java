package org.jfree.chart;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

public class WriteBufferedImageAsPNGParameter2 {
	public OutputStream out;
	public BufferedImage image;

	public WriteBufferedImageAsPNGParameter2(OutputStream out, BufferedImage image) {
		this.out = out;
		this.image = image;
	}
}