package org.jfree.chart;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

public class WriteBufferedImageAsJPEGParameter2 {
	public OutputStream out;
	public BufferedImage image;

	public WriteBufferedImageAsJPEGParameter2(OutputStream out, BufferedImage image) {
		this.out = out;
		this.image = image;
	}
}