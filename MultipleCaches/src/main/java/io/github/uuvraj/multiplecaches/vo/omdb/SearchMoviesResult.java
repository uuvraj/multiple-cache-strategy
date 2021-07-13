package io.github.uuvraj.multiplecaches.vo.omdb;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SearchMoviesResult {

	@JsonProperty("Search")
	private List<MovieDetail> searchResults;
	@JsonProperty("totalResults")
	private int totalResults;
}
