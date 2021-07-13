package io.github.uuvraj.multiplecaches.process;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.uuvraj.multiplecaches.mapper.OmdbMapper;
import io.github.uuvraj.multiplecaches.models.MovieDetail;
import io.github.uuvraj.multiplecaches.models.MovieSearchCriteria;
import io.github.uuvraj.multiplecaches.models.SearchMoviesResult;
import io.github.uuvraj.multiplecaches.service.OMDBService;

@Component
public class MoviesProcess {

	@Autowired
	private OMDBService omdbService;
	@Autowired
	private OmdbMapper mapper;

	public MovieDetail getMovie(MovieSearchCriteria movieSearchCriteria) {
		io.github.uuvraj.multiplecaches.vo.omdb.MovieDetail movieDetail = omdbService
				.getMovie(createQueryMap(movieSearchCriteria, Boolean.FALSE));
		return mapper.mapOmdbMovieDetailToMovieDetail(movieDetail);
	}

	public SearchMoviesResult searchMovies(MovieSearchCriteria movieSearchCriteria) {
		io.github.uuvraj.multiplecaches.vo.omdb.SearchMoviesResult searchMovies = omdbService
				.searchMovies(createQueryMap(movieSearchCriteria, Boolean.TRUE));
		return mapper.mapOmdbSearchMovieResultToSearchMovieResult(searchMovies);
	}

	private Map<String, String> createQueryMap(MovieSearchCriteria movieSearchCriteria, boolean isSearch) {
		Map<String, String> queryMap = new HashMap<>();
		if (!isSearch) {
			queryMap.put("i", movieSearchCriteria.getImdbId());
			queryMap.put("t", movieSearchCriteria.getTitle());
			queryMap.put("plot", movieSearchCriteria.getPlot().getPlot());
		} else {
			queryMap.put("s", movieSearchCriteria.getTitle());
			if (movieSearchCriteria.getPageNumber() == 0)
				movieSearchCriteria.setPageNumber(1);
			queryMap.put("page", String.valueOf(movieSearchCriteria.getPageNumber()));
		}
		queryMap.put("type", movieSearchCriteria.getType().getType());
		if (movieSearchCriteria.getYearOfRelease() != null)
			queryMap.put("y", String.valueOf(movieSearchCriteria.getYearOfRelease().intValue()));
		queryMap.put("r", "json");
		return queryMap;
	}

}
