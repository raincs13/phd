package org.jfree.chart;

import org.jfree.data.category.CategoryDataset;

public class CreateBarChartParameter {
	private String title;
	private String categoryAxisLabel;
	private String valueAxisLabel;
	private CategoryDataset dataset;

	public CreateBarChartParameter(String title, String categoryAxisLabel, String valueAxisLabel,
			CategoryDataset dataset) {
		this.title = title;
		this.categoryAxisLabel = categoryAxisLabel;
		this.valueAxisLabel = valueAxisLabel;
		this.dataset = dataset;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategoryAxisLabel() {
		return categoryAxisLabel;
	}

	public void setCategoryAxisLabel(String categoryAxisLabel) {
		this.categoryAxisLabel = categoryAxisLabel;
	}

	public String getValueAxisLabel() {
		return valueAxisLabel;
	}

	public void setValueAxisLabel(String valueAxisLabel) {
		this.valueAxisLabel = valueAxisLabel;
	}

	public CategoryDataset getDataset() {
		return dataset;
	}

	public void setDataset(CategoryDataset dataset) {
		this.dataset = dataset;
	}
}