package org.jfree.chart;

import java.io.OutputStream;

public class WriteChartAsJPEGParameter5 {
	public OutputStream out;
	public float quality;
	public JFreeChart chart;
	public int width;
	public int height;

	public WriteChartAsJPEGParameter5(OutputStream out, float quality, JFreeChart chart, int width, int height) {
		this.out = out;
		this.quality = quality;
		this.chart = chart;
		this.width = width;
		this.height = height;
	}
}