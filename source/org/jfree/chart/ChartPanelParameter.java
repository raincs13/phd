package org.jfree.chart;

public class ChartPanelParameter {
	public JFreeChart chart;
	public boolean useBuffer;

	public ChartPanelParameter(JFreeChart chart, boolean useBuffer) {
		this.chart = chart;
		this.useBuffer = useBuffer;
	}
}