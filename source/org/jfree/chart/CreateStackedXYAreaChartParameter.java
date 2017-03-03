package org.jfree.chart;

import org.jfree.data.xy.TableXYDataset;

public class CreateStackedXYAreaChartParameter {
	public String title;
	public String xAxisLabel;
	public String yAxisLabel;
	public TableXYDataset dataset;

	public CreateStackedXYAreaChartParameter(String title, String xAxisLabel, String yAxisLabel,
			TableXYDataset dataset) {
		this.title = title;
		this.xAxisLabel = xAxisLabel;
		this.yAxisLabel = yAxisLabel;
		this.dataset = dataset;
	}
}