package io.github.uuvraj.multiplecaches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.uuvraj.multiplecaches.models.MovieDetail;
import io.github.uuvraj.multiplecaches.models.MovieSearchCriteria;
import io.github.uuvraj.multiplecaches.models.SearchMoviesResult;
import io.github.uuvraj.multiplecaches.process.MoviesProcess;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {

	@Autowired
	private MoviesProcess moviesProcess;

	@PostMapping("/retrieve")
	public MovieDetail getMovie(@RequestBody MovieSearchCriteria movieSearchCriteria) {
		return moviesProcess.getMovie(movieSearchCriteria);
	}

	@PostMapping("/search")
	public SearchMoviesResult searchMovies(@RequestBody MovieSearchCriteria movieSearchCriteria) {
		return moviesProcess.searchMovies(movieSearchCriteria);
	}
}
