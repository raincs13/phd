package org.jfree.chart;

public class ChartTransferableParameter {
	public JFreeChart chart;
	public int width;
	public int height;

	public ChartTransferableParameter(JFreeChart chart, int width, int height) {
		this.chart = chart;
		this.width = width;
		this.height = height;
	}
}