package org.jfree.chart;

import org.jfree.data.category.IntervalCategoryDataset;

public class CreateGanttChartParameter {
	private String title;
	private String categoryAxisLabel;
	private String dateAxisLabel;
	private IntervalCategoryDataset dataset;

	public CreateGanttChartParameter(String title, String categoryAxisLabel, String dateAxisLabel,
			IntervalCategoryDataset dataset) {
		this.title = title;
		this.categoryAxisLabel = categoryAxisLabel;
		this.dateAxisLabel = dateAxisLabel;
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

	public String getDateAxisLabel() {
		return dateAxisLabel;
	}

	public void setDateAxisLabel(String dateAxisLabel) {
		this.dateAxisLabel = dateAxisLabel;
	}

	public IntervalCategoryDataset getDataset() {
		return dataset;
	}

	public void setDataset(IntervalCategoryDataset dataset) {
		this.dataset = dataset;
	}
}