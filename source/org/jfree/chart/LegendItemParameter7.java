package org.jfree.chart;

import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;

public class LegendItemParameter7 {
	public String label;
	public String description;
	public String toolTipText;
	public String urlText;
	public Shape line;
	public Stroke lineStroke;
	public Paint linePaint;

	public LegendItemParameter7(String label, String description, String toolTipText, String urlText, Shape line,
			Stroke lineStroke, Paint linePaint) {
		this.label = label;
		this.description = description;
		this.toolTipText = toolTipText;
		this.urlText = urlText;
		this.line = line;
		this.lineStroke = lineStroke;
		this.linePaint = linePaint;
	}
}