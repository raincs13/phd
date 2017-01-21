package org.jfree.chart;

import java.io.OutputStream;

public class WriteChartAsPNGParameter4 {
	public OutputStream out;
	public JFreeChart chart;
	public int width;
	public int height;

	public WriteChartAsPNGParameter4(OutputStream out, JFreeChart chart, int width, int height) {
		this.out = out;
		this.chart = chart;
		this.width = width;
		this.height = height;
	}
}