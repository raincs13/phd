package org.jfree.chart;

public class WriteChartAsPNGParameter {
	private int width;
	private int height;
	private ChartRenderingInfo info;

	public WriteChartAsPNGParameter(int width, int height, ChartRenderingInfo info) {
		this.width = width;
		this.height = height;
		this.info = info;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ChartRenderingInfo getInfo() {
		return info;
	}

	public void setInfo(ChartRenderingInfo info) {
		this.info = info;
	}
}