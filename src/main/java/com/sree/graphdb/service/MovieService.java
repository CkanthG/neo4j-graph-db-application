package com.sree.graphdb.service;

import com.sree.graphdb.enitity.Movie;
import com.sree.graphdb.enitity.Person;
import com.sree.graphdb.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovie(String title) {
        return movieRepository.findById(title).orElseThrow(
                () -> new RuntimeException("Movie not found with title : " + title)
        );
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addActorToMovie(String title, Person actor) {
        Movie movie = movieRepository.findById(title).orElseThrow(
                () -> new RuntimeException("Movie not found with title : " + title)
        );
        movie.setActors(Set.of(actor));
        return movieRepository.save(movie);
    }

}
