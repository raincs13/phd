package org.jfree.chart;

public class CreateBufferedImageParameter {
	private double drawWidth;
	private double drawHeight;

	public CreateBufferedImageParameter(double drawWidth, double drawHeight) {
		this.drawWidth = drawWidth;
		this.drawHeight = drawHeight;
	}

	public double getDrawWidth() {
		return drawWidth;
	}

	public void setDrawWidth(double drawWidth) {
		this.drawWidth = drawWidth;
	}

	public double getDrawHeight() {
		return drawHeight;
	}

	public void setDrawHeight(double drawHeight) {
		this.drawHeight = drawHeight;
	}
}