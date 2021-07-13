package io.github.uuvraj.multiplecaches.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import io.github.uuvraj.multiplecaches.models.MovieDetail;
import io.github.uuvraj.multiplecaches.models.SearchMoviesResult;

@Mapper(componentModel = "spring")
public interface OmdbMapper {

	@Mappings({
		@Mapping(target = "type",
		         expression = "java( io.github.uuvraj.multiplecaches.models.TYPE.lookup(movieDetail.getType()) )")
	})
	MovieDetail mapOmdbMovieDetailToMovieDetail(io.github.uuvraj.multiplecaches.vo.omdb.MovieDetail movieDetail);

	io.github.uuvraj.multiplecaches.vo.omdb.MovieDetail mapMovieDetailToOmdbMovieDetail(MovieDetail movieDetail);

	SearchMoviesResult mapOmdbSearchMovieResultToSearchMovieResult(
			io.github.uuvraj.multiplecaches.vo.omdb.SearchMoviesResult movieResult);

	io.github.uuvraj.multiplecaches.vo.omdb.SearchMoviesResult mapSearchMovieResultToOmdbSearchMovieResult(
			SearchMoviesResult movieResult);
	
}
