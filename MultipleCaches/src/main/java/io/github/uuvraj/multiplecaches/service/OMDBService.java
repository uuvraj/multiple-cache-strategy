package io.github.uuvraj.multiplecaches.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.uuvraj.multiplecaches.vo.omdb.MovieDetail;
import io.github.uuvraj.multiplecaches.vo.omdb.SearchMoviesResult;

@FeignClient(name = "omdb", url = "${omdb.hostname}")
public interface OMDBService {

	@RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	MovieDetail getMovie(@SpringQueryMap Map<String, String> searchQueries);

	@RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	SearchMoviesResult searchMovies(@SpringQueryMap Map<String, String> searchQueries);
}
