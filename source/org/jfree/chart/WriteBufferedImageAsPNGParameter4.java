package org.jfree.chart;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

public class WriteBufferedImageAsPNGParameter4 {
	public OutputStream out;
	public BufferedImage image;
	public boolean encodeAlpha;
	public int compression;

	public WriteBufferedImageAsPNGParameter4(OutputStream out, BufferedImage image, boolean encodeAlpha,
			int compression) {
		this.out = out;
		this.image = image;
		this.encodeAlpha = encodeAlpha;
		this.compression = compression;
	}
}