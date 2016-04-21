package org.jfree.chart;

import org.jfree.data.xy.XYZDataset;

public class CreateBubbleChartParameter {
	private String title;
	private String xAxisLabel;
	private String yAxisLabel;
	private XYZDataset dataset;

	public CreateBubbleChartParameter(String title, String xAxisLabel, String yAxisLabel, XYZDataset dataset) {
		this.title = title;
		this.xAxisLabel = xAxisLabel;
		this.yAxisLabel = yAxisLabel;
		this.dataset = dataset;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getxAxisLabel() {
		return xAxisLabel;
	}

	public void setxAxisLabel(String xAxisLabel) {
		this.xAxisLabel = xAxisLabel;
	}

	public String getyAxisLabel() {
		return yAxisLabel;
	}

	public void setyAxisLabel(String yAxisLabel) {
		this.yAxisLabel = yAxisLabel;
	}

	public XYZDataset getDataset() {
		return dataset;
	}

	public void setDataset(XYZDataset dataset) {
		this.dataset = dataset;
	}
}