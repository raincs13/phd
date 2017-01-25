package org.jfree.chart;

import org.jfree.data.xy.XYDataset;

public class CreateScatterPlotParameter4 {
	public String title;
	public String xAxisLabel;
	public String yAxisLabel;
	public XYDataset dataset;

	public CreateScatterPlotParameter4(String title, String xAxisLabel, String yAxisLabel, XYDataset dataset) {
		this.title = title;
		this.xAxisLabel = xAxisLabel;
		this.yAxisLabel = yAxisLabel;
		this.dataset = dataset;
	}
}