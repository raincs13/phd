package org.jfree.chart;

import org.jfree.data.xy.XYDataset;

public class CreateTimeSeriesChartParameter4 {
	public String title;
	public String timeAxisLabel;
	public String valueAxisLabel;
	public XYDataset dataset;

	public CreateTimeSeriesChartParameter4(String title, String timeAxisLabel, String valueAxisLabel,
			XYDataset dataset) {
		this.title = title;
		this.timeAxisLabel = timeAxisLabel;
		this.valueAxisLabel = valueAxisLabel;
		this.dataset = dataset;
	}
}