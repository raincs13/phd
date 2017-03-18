package org.jfree.chart;

public class SaveChartAsPNGParameter {
	public JFreeChart chart;
	public int width;
	public int height;
	public ChartRenderingInfo info;
	public boolean encodeAlpha;
	public int compression;

	public SaveChartAsPNGParameter(JFreeChart chart, int width, int height, ChartRenderingInfo info,
			boolean encodeAlpha, int compression) {
		this.chart = chart;
		this.width = width;
		this.height = height;
		this.info = info;
		this.encodeAlpha = encodeAlpha;
		this.compression = compression;
	}
}