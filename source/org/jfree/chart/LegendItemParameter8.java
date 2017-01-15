package org.jfree.chart;

import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;

public class LegendItemParameter8 {
	public String label;
	public String description;
	public String toolTipText;
	public String urlText;
	public Shape shape;
	public Paint fillPaint;
	public Stroke outlineStroke;
	public Paint outlinePaint;

	public LegendItemParameter8(String label, String description, String toolTipText, String urlText, Shape shape,
			Paint fillPaint, Stroke outlineStroke, Paint outlinePaint) {
		this.label = label;
		this.description = description;
		this.toolTipText = toolTipText;
		this.urlText = urlText;
		this.shape = shape;
		this.fillPaint = fillPaint;
		this.outlineStroke = outlineStroke;
		this.outlinePaint = outlinePaint;
	}
}