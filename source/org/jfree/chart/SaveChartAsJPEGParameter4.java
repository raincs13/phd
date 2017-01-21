package org.jfree.chart;

import java.io.File;

public class SaveChartAsJPEGParameter4 {
	public File file;
	public JFreeChart chart;
	public int width;
	public int height;

	public SaveChartAsJPEGParameter4(File file, JFreeChart chart, int width, int height) {
		this.file = file;
		this.chart = chart;
		this.width = width;
		this.height = height;
	}
}