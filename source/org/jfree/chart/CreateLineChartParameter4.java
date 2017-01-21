package org.jfree.chart;

import org.jfree.data.category.CategoryDataset;

public class CreateLineChartParameter4 {
	public String title;
	public String categoryAxisLabel;
	public String valueAxisLabel;
	public CategoryDataset dataset;

	public CreateLineChartParameter4(String title, String categoryAxisLabel, String valueAxisLabel,
			CategoryDataset dataset) {
		this.title = title;
		this.categoryAxisLabel = categoryAxisLabel;
		this.valueAxisLabel = valueAxisLabel;
		this.dataset = dataset;
	}
}