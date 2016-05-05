package org.jfree.chart;

public class WriteChartAsJPEGParameter1 {
	private int width;
	private int height;
	private ChartRenderingInfo info;

	public WriteChartAsJPEGParameter1(int width, int height, ChartRenderingInfo info) {
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