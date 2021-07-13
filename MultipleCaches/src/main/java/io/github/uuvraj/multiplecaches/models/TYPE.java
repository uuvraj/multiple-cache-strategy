package io.github.uuvraj.multiplecaches.models;

public enum TYPE {

	MOVIE("movie"), SERIES("series"), EPISODE("episode");

	String type;

	TYPE(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
	
	public static TYPE lookup(String type) {
		for (TYPE t: TYPE.values()) {
			if (t.type.equalsIgnoreCase(type))
				return t;
		}
		return null;
	}
}
