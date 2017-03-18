package org.jfree.chart;

public class ChartAsJPEGParameter5 {
	public float quality;
	public JFreeChart chart;
	public int width;
	public int height;
	public ChartRenderingInfo info;

	public ChartAsJPEGParameter5(float quality, JFreeChart chart, int width, int height, ChartRenderingInfo info) {
		this.quality = quality;
		this.chart = chart;
		this.width = width;
		this.height = height;
		this.info = info;
	}
}