package io.github.uuvraj.multiplecaches.models;

import java.util.List;

import lombok.Data;

@Data
public class SearchMoviesResult {

	private int totalResults;
	private List<MovieDetail> searchResults;
}
