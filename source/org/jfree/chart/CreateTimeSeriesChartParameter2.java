package org.jfree.chart;

public class CreateTimeSeriesChartParameter2 {
	public String title;
	public String timeAxisLabel;
	public boolean legend;
	public boolean urls;

	public CreateTimeSeriesChartParameter2(String title, String timeAxisLabel, boolean legend, boolean urls) {
		this.title = title;
		this.timeAxisLabel = timeAxisLabel;
		this.legend = legend;
		this.urls = urls;
	}
}