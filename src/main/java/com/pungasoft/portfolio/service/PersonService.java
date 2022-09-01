package com.pungasoft.portfolio.service;

import com.pungasoft.portfolio.exception.PersonNotFoundException;
import com.pungasoft.portfolio.model.entity.Person;
import com.pungasoft.portfolio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person getById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            return person.get();
        } else {
            throw new PersonNotFoundException();
        }
    }

    public Person save(Person p) {
        return personRepository.save(p);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}