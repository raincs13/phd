package org.jfree.chart;

import java.io.PrintWriter;

public class WriteImageMapParameter4 {
	public PrintWriter writer;
	public String name;
	public ChartRenderingInfo info;
	public boolean useOverLibForToolTips;

	public WriteImageMapParameter4(PrintWriter writer, String name, ChartRenderingInfo info,
			boolean useOverLibForToolTips) {
		this.writer = writer;
		this.name = name;
		this.info = info;
		this.useOverLibForToolTips = useOverLibForToolTips;
	}
}