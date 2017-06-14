package org.jfree.chart;

public class WriteScaledChartAsPNGParameter {
	public int width;
	public int height;
	public int widthScaleFactor;
	public int heightScaleFactor;

	public WriteScaledChartAsPNGParameter(int width, int height, int widthScaleFactor, int heightScaleFactor) {
		this.width = width;
		this.height = height;
		this.widthScaleFactor = widthScaleFactor;
		this.heightScaleFactor = heightScaleFactor;
	}
}