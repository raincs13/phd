package org.jfree.chart;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class DrawParameter3 {
	public Graphics2D g2;
	public Rectangle2D area;
	public ChartRenderingInfo info;

	public DrawParameter3(Graphics2D g2, Rectangle2D area, ChartRenderingInfo info) {
		this.g2 = g2;
		this.area = area;
		this.info = info;
	}
}