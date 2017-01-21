package org.jfree.chart;

import java.io.OutputStream;

public class WriteChartAsPNGParameter5 {
	public OutputStream out;
	public JFreeChart chart;
	public int width;
	public int height;
	public ChartRenderingInfo info;

	public WriteChartAsPNGParameter5(OutputStream out, JFreeChart chart, int width, int height,
			ChartRenderingInfo info) {
		this.out = out;
		this.chart = chart;
		this.width = width;
		this.height = height;
		this.info = info;
	}
}