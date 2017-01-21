package org.jfree.chart;

import java.awt.image.BufferedImage;

public class EncodeAsPNGParameter3 {
	public BufferedImage image;
	public boolean encodeAlpha;
	public int compression;

	public EncodeAsPNGParameter3(BufferedImage image, boolean encodeAlpha, int compression) {
		this.image = image;
		this.encodeAlpha = encodeAlpha;
		this.compression = compression;
	}
}