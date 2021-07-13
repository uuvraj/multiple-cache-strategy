package io.github.uuvraj.multiplecaches.vo.omdb;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MovieDetail {

	@JsonProperty("Title")
	private String title;
	@JsonProperty("imdbID")
	private String imdbId;
	@JsonProperty("Year")
	private String releaseYear;
	@JsonProperty("Released")
	private String releaseDate;
	@JsonProperty("Rated")
	private String rated;
	@JsonProperty("Runtime")
	private String runtime;
	@JsonProperty("Genre")
	private String genre;
	@JsonProperty("Director")
	private String director;
	@JsonProperty("Writer")
	private String writers;
	@JsonProperty("Actors")
	private String actors;
	@JsonProperty("Plot")
	private String plot;
	@JsonProperty("Language")
	private String languages;
	@JsonProperty("Country")
	private String countries;
	@JsonProperty("Awards")
	private String awards;
	@JsonProperty("Poster")
	private String posterLink;
	@JsonProperty("Ratings")
	private List<Rating> ratings;
	@JsonProperty("Metascore")
	private String metaScore;
	@JsonProperty("imdbRating")
	private String imdbRating;
	@JsonProperty("imdbVotes")
	private String imdbVotes;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("DVD")
	private String dvdReleaseDate;
	@JsonProperty("BoxOffice")
	private String boxOfficeRevenue;
	@JsonProperty("Production")
	private String productionHouse;
	@JsonProperty("Website")
	private String website;
}
