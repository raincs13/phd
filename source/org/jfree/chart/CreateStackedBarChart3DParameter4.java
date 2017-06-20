package org.jfree.chart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

public class CreateStackedBarChart3DParameter4 {
	public String title;
	public CategoryDataset dataset;
	public PlotOrientation orientation;
	public boolean legend;

	public CreateStackedBarChart3DParameter4(String title, CategoryDataset dataset, PlotOrientation orientation,
			boolean legend) {
		this.title = title;
		this.dataset = dataset;
		this.orientation = orientation;
		this.legend = legend;
	}
}