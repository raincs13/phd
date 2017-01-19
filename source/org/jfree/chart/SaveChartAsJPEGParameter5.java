package org.jfree.chart;

import java.io.File;

public class SaveChartAsJPEGParameter5 {
	public File file;
	public float quality;
	public JFreeChart chart;
	public int width;
	public int height;

	public SaveChartAsJPEGParameter5(File file, float quality, JFreeChart chart, int width, int height) {
		this.file = file;
		this.quality = quality;
		this.chart = chart;
		this.width = width;
		this.height = height;
	}
}