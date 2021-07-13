package io.github.uuvraj.multiplecaches.models;

import lombok.Data;

/**
 * @author uuvraj
 *
 */
@Data
public class MovieSearchCriteria {

	// Search API fields
	private String title;
	private TYPE type;
	private Integer yearOfRelease;
	private int pageNumber = 1;

	// Find Movie API fields
	private String imdbId;
	private PLOT plot;
}
