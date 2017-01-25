package org.jfree.chart;

import org.jfree.data.xy.IntervalXYDataset;

public class CreateXYBarChartParameter5 {
	public String title;
	public String xAxisLabel;
	public boolean dateAxis;
	public String yAxisLabel;
	public IntervalXYDataset dataset;

	public CreateXYBarChartParameter5(String title, String xAxisLabel, boolean dateAxis, String yAxisLabel,
			IntervalXYDataset dataset) {
		this.title = title;
		this.xAxisLabel = xAxisLabel;
		this.dateAxis = dateAxis;
		this.yAxisLabel = yAxisLabel;
		this.dataset = dataset;
	}
}