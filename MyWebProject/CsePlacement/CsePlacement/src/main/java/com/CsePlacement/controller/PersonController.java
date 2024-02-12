package com.CsePlacement.controller;

import com.CsePlacement.beans.Person;
import com.CsePlacement.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")


public class PersonController {
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person addPerson(@RequestBody Person person)
    {
        return this.personService.addPerson(person);
    }

    @GetMapping
    public List<Person> showAll()
    {
            return this.personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public  Person getOne(@PathVariable long id)
    {
        return this.personService.getPersonById(id);
    }

}
