package com.sree.graphdb.controller;

import com.sree.graphdb.enitity.Movie;
import com.sree.graphdb.enitity.Person;
import com.sree.graphdb.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.saveMovie(movie));
    }

    @GetMapping("/{title}")
    public ResponseEntity<Movie> getMovie(@PathVariable String title) {
        return ResponseEntity.ok(movieService.getMovie(title));
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @PostMapping("/{title}/actors")
    public ResponseEntity<Movie> addActorToMovie(@PathVariable String title, @RequestBody Person actor) {
        return ResponseEntity.ok(movieService.addActorToMovie(title, actor));
    }
}
