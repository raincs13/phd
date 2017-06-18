package org.jfree.chart;

import org.jfree.data.category.IntervalCategoryDataset;

public class CreateGanttChartParameter4 {
	public String title;
	public String categoryAxisLabel;
	public String dateAxisLabel;
	public IntervalCategoryDataset dataset;

	public CreateGanttChartParameter4(String title, String categoryAxisLabel, String dateAxisLabel,
			IntervalCategoryDataset dataset) {
		this.title = title;
		this.categoryAxisLabel = categoryAxisLabel;
		this.dateAxisLabel = dateAxisLabel;
		this.dataset = dataset;
	}
}