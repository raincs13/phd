package org.jfree.chart;

import org.jfree.chart.imagemap.ToolTipTagFragmentGenerator;
import org.jfree.chart.imagemap.URLTagFragmentGenerator;

public class GetImageMapParameter4 {
	public String name;
	public ChartRenderingInfo info;
	public ToolTipTagFragmentGenerator toolTipTagFragmentGenerator;
	public URLTagFragmentGenerator urlTagFragmentGenerator;

	public GetImageMapParameter4(String name, ChartRenderingInfo info,
			ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, URLTagFragmentGenerator urlTagFragmentGenerator) {
		this.name = name;
		this.info = info;
		this.toolTipTagFragmentGenerator = toolTipTagFragmentGenerator;
		this.urlTagFragmentGenerator = urlTagFragmentGenerator;
	}
}