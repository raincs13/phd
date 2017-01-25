package org.jfree.chart;

import org.jfree.data.category.CategoryDataset;

public class CreateStackedBarChartParameter4 {
	public String title;
	public String domainAxisLabel;
	public String rangeAxisLabel;
	public CategoryDataset dataset;

	public CreateStackedBarChartParameter4(String title, String domainAxisLabel, String rangeAxisLabel,
			CategoryDataset dataset) {
		this.title = title;
		this.domainAxisLabel = domainAxisLabel;
		this.rangeAxisLabel = rangeAxisLabel;
		this.dataset = dataset;
	}
}