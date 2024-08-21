package com.sree.graphdb.repository;

import com.sree.graphdb.enitity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface PersonRepository extends Neo4jRepository<Person, String> {
    Optional<Person> findByName(String name);
}
