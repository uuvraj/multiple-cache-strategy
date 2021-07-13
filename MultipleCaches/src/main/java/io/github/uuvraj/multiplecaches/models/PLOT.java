package io.github.uuvraj.multiplecaches.models;

public enum PLOT {

	SHORT("short"), FULL("full");

	String plot;

	PLOT(String plot) {
		this.plot = plot;
	}

	public String getPlot() {
		return this.plot;
	}
}
