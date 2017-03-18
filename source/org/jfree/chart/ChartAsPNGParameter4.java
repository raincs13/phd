package org.jfree.chart;

public class ChartAsPNGParameter4 {
	public JFreeChart chart;
	public int width;
	public int height;
	public ChartRenderingInfo info;

	public ChartAsPNGParameter4(JFreeChart chart, int width, int height, ChartRenderingInfo info) {
		this.chart = chart;
		this.width = width;
		this.height = height;
		this.info = info;
	}
}