package org.jfree.chart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.IntervalXYDataset;

public class CreateHistogramParameter4 {
	public CreateHistogramParameter2 parameterObject2;
	public IntervalXYDataset dataset;
	public PlotOrientation orientation;

	public CreateHistogramParameter4(CreateHistogramParameter2 parameterObject2, IntervalXYDataset dataset,
			PlotOrientation orientation) {
		this.parameterObject2 = parameterObject2;
		this.dataset = dataset;
		this.orientation = orientation;
	}
}