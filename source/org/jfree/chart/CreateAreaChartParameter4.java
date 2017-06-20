package org.jfree.chart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

public class CreateAreaChartParameter4 {
	public CreateAreaChartParameter2 parameterObject2;
	public CategoryDataset dataset;
	public PlotOrientation orientation;

	public CreateAreaChartParameter4(CreateAreaChartParameter2 parameterObject2, CategoryDataset dataset,
			PlotOrientation orientation) {
		this.parameterObject2 = parameterObject2;
		this.dataset = dataset;
		this.orientation = orientation;
	}
}