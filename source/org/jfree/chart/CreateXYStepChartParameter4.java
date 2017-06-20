package org.jfree.chart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;

public class CreateXYStepChartParameter4 {
	public CreateXYStepChartParameter2 parameterObject2;
	public XYDataset dataset;
	public PlotOrientation orientation;

	public CreateXYStepChartParameter4(CreateXYStepChartParameter2 parameterObject2, XYDataset dataset,
			PlotOrientation orientation) {
		this.parameterObject2 = parameterObject2;
		this.dataset = dataset;
		this.orientation = orientation;
	}
}