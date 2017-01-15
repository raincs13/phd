package org.jfree.chart;

import java.awt.geom.Rectangle2D;

import org.jfree.chart.axis.ValueAxis;

public class DrawParameter {
	public Rectangle2D dataArea;
	public ValueAxis horizontalAxis;
	public ValueAxis verticalAxis;

	public DrawParameter(Rectangle2D dataArea, ValueAxis horizontalAxis, ValueAxis verticalAxis) {
		this.dataArea = dataArea;
		this.horizontalAxis = horizontalAxis;
		this.verticalAxis = verticalAxis;
	}
}