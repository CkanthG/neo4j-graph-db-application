package com.sree.graphdb.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Set;

@Node
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

    @Id
    private String title;
    private String genre;

    @Relationship(type = "ACTED_IN")
    private Set<Person> actors;
}
