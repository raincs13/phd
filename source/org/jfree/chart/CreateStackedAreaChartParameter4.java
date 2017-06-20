package org.jfree.chart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

public class CreateStackedAreaChartParameter4 {
	public CreateStackedAreaChartParameter2 parameterObject2;
	public CategoryDataset dataset;
	public PlotOrientation orientation;

	public CreateStackedAreaChartParameter4(CreateStackedAreaChartParameter2 parameterObject2, CategoryDataset dataset,
			PlotOrientation orientation) {
		this.parameterObject2 = parameterObject2;
		this.dataset = dataset;
		this.orientation = orientation;
	}
}