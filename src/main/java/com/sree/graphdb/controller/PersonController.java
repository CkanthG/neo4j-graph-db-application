package com.sree.graphdb.controller;

import com.sree.graphdb.enitity.Person;
import com.sree.graphdb.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.savePerson(person));
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(personService.getAllPersons());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Person> getPerson(@PathVariable String name) {
        return ResponseEntity.ok(personService.getPerson(name));
    }

}
