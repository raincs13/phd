package org.jfree.chart;

public class ChartPanelParameter2 {
	private boolean properties;
	private boolean copy;
	private boolean save;
	private boolean print;
	private boolean zoom;

	public ChartPanelParameter2(boolean properties, boolean copy, boolean save, boolean print, boolean zoom) {
		this.properties = properties;
		this.copy = copy;
		this.save = save;
		this.print = print;
		this.zoom = zoom;
	}

	public boolean isProperties() {
		return properties;
	}

	public void setProperties(boolean properties) {
		this.properties = properties;
	}

	public boolean isCopy() {
		return copy;
	}

	public void setCopy(boolean copy) {
		this.copy = copy;
	}

	public boolean isSave() {
		return save;
	}

	public void setSave(boolean save) {
		this.save = save;
	}

	public boolean isPrint() {
		return print;
	}

	public void setPrint(boolean print) {
		this.print = print;
	}

	public boolean isZoom() {
		return zoom;
	}

	public void setZoom(boolean zoom) {
		this.zoom = zoom;
	}
}