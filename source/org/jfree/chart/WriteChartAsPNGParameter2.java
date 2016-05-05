package org.jfree.chart;

import java.io.OutputStream;

public class WriteChartAsPNGParameter2 {
	private OutputStream out;
	private boolean encodeAlpha;
	private int compression;

	public WriteChartAsPNGParameter2(OutputStream out, boolean encodeAlpha, int compression) {
		this.out = out;
		this.encodeAlpha = encodeAlpha;
		this.compression = compression;
	}

	public OutputStream getOut() {
		return out;
	}

	public void setOut(OutputStream out) {
		this.out = out;
	}

	public boolean isEncodeAlpha() {
		return encodeAlpha;
	}

	public void setEncodeAlpha(boolean encodeAlpha) {
		this.encodeAlpha = encodeAlpha;
	}

	public int getCompression() {
		return compression;
	}

	public void setCompression(int compression) {
		this.compression = compression;
	}
}