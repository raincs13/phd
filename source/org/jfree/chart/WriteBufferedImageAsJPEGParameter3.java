package org.jfree.chart;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

public class WriteBufferedImageAsJPEGParameter3 {
	public OutputStream out;
	public float quality;
	public BufferedImage image;

	public WriteBufferedImageAsJPEGParameter3(OutputStream out, float quality, BufferedImage image) {
		this.out = out;
		this.quality = quality;
		this.image = image;
	}
}