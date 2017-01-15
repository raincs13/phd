package org.jfree.chart;

public class CreatePopupMenuParameter {
	public boolean properties;
	public boolean save;
	public boolean print;
	public boolean zoom;

	public CreatePopupMenuParameter(boolean properties, boolean save, boolean print, boolean zoom) {
		this.properties = properties;
		this.save = save;
		this.print = print;
		this.zoom = zoom;
	}
}