package org.jfree.chart;

import java.awt.Paint;
import java.awt.Shape;
import java.text.AttributedString;

public class LegendItemParameter6 {
	public AttributedString label;
	public String description;
	public String toolTipText;
	public String urlText;
	public Shape shape;
	public Paint fillPaint;

	public LegendItemParameter6(AttributedString label, String description, String toolTipText, String urlText,
			Shape shape, Paint fillPaint) {
		this.label = label;
		this.description = description;
		this.toolTipText = toolTipText;
		this.urlText = urlText;
		this.shape = shape;
		this.fillPaint = fillPaint;
	}
}