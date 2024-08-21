package com.sree.graphdb.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    @Id
    private String id;
    private String name;
    private int age;
    private String nationality;

}
