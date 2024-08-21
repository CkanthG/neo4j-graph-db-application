package com.sree.graphdb.repository;

import com.sree.graphdb.enitity.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, String> {
}
