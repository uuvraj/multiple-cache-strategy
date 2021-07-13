package io.github.uuvraj.multiplecaches.vo.omdb;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Rating {

	@JsonProperty("Source")
	private String source;
	@JsonProperty("Value")
	private String value;
}
