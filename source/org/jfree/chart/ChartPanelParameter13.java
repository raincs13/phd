package org.jfree.chart;

public class ChartPanelParameter13 {
	public JFreeChart chart;
	public int width;
	public int height;
	public int minimumDrawWidth;
	public int minimumDrawHeight;
	public int maximumDrawWidth;
	public int maximumDrawHeight;
	public boolean useBuffer;
	public boolean properties;
	public boolean save;
	public boolean print;
	public boolean zoom;
	public boolean tooltips;

	public ChartPanelParameter13(JFreeChart chart, int width, int height, int minimumDrawWidth, int minimumDrawHeight,
			int maximumDrawWidth, int maximumDrawHeight, boolean useBuffer, boolean properties, boolean save,
			boolean print, boolean zoom, boolean tooltips) {
		this.chart = chart;
		this.width = width;
		this.height = height;
		this.minimumDrawWidth = minimumDrawWidth;
		this.minimumDrawHeight = minimumDrawHeight;
		this.maximumDrawWidth = maximumDrawWidth;
		this.maximumDrawHeight = maximumDrawHeight;
		this.useBuffer = useBuffer;
		this.properties = properties;
		this.save = save;
		this.print = print;
		this.zoom = zoom;
		this.tooltips = tooltips;
	}
}