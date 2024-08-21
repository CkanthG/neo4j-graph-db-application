package com.sree.graphdb.service;

import com.sree.graphdb.enitity.Person;
import com.sree.graphdb.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;


    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPerson(String name) {
        return personRepository.findByName(name).orElseThrow(
                () -> new RuntimeException("No person found with name : " + name)
        );
    }

}
