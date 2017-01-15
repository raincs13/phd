package org.jfree.chart;

public class PolarChartPanelParameter {
	public JFreeChart chart;
	public boolean useBuffer;

	public PolarChartPanelParameter(JFreeChart chart, boolean useBuffer) {
		this.chart = chart;
		this.useBuffer = useBuffer;
	}
}