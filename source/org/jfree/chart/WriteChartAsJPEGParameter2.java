package org.jfree.chart;

import java.io.OutputStream;

public class WriteChartAsJPEGParameter2 {
	private OutputStream out;
	private float quality;

	public WriteChartAsJPEGParameter2(OutputStream out, float quality) {
		this.out = out;
		this.quality = quality;
	}

	public OutputStream getOut() {
		return out;
	}

	public void setOut(OutputStream out) {
		this.out = out;
	}

	public float getQuality() {
		return quality;
	}

	public void setQuality(float quality) {
		this.quality = quality;
	}
}