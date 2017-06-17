package org.jfree.chart;

import org.jfree.chart.plot.PlotOrientation;

public class CreateBarChartParameter3 {
	public String title;
	public PlotOrientation orientation;
	public boolean legend;

	public CreateBarChartParameter3(String title, PlotOrientation orientation, boolean legend) {
		this.title = title;
		this.orientation = orientation;
		this.legend = legend;
	}
}