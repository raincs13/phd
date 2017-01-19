package org.jfree.chart;

import java.io.File;

public class SaveChartAsPNGParameter4 {
	public File file;
	public JFreeChart chart;
	public int width;
	public int height;

	public SaveChartAsPNGParameter4(File file, JFreeChart chart, int width, int height) {
		this.file = file;
		this.chart = chart;
		this.width = width;
		this.height = height;
	}
}