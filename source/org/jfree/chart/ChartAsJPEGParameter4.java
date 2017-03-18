package org.jfree.chart;

import java.io.File;

public class ChartAsJPEGParameter4 {
	public File file;
	public JFreeChart chart;
	public int width;
	public int height;
	public ChartRenderingInfo info;

	public ChartAsJPEGParameter4(File file, JFreeChart chart, int width, int height, ChartRenderingInfo info) {
		this.file = file;
		this.chart = chart;
		this.width = width;
		this.height = height;
		this.info = info;
	}
}