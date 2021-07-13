package io.github.uuvraj.multiplecaches.models;

import java.util.List;

import lombok.Data;

@Data
public class MovieDetail {

	private String title;
	private String imdbId;
	private String releaseYear;
	private String releaseDate;
	private String rated;
	private String runtime;
	private String genre;
	private String director;
	private String writers;
	private String actors;
	private String plot;
	private String languages;
	private String countries;
	private String awards;
	private String posterLink;
	private List<Rating> ratings;
	private String metaScore;
	private String imdbRating;
	private String imdbVotes;
	private TYPE type;
	private String dvdReleaseDate;
	private String boxOfficeRevenue;
	private String productionHouse;
	private String website;
}
