package org.jfree.chart;

public class CreatePolarChartParameter {
	private String title;
	private boolean legend;

	public CreatePolarChartParameter(String title, boolean legend) {
		this.title = title;
		this.legend = legend;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isLegend() {
		return legend;
	}

	public void setLegend(boolean legend) {
		this.legend = legend;
	}
}