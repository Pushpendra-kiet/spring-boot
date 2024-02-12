package com.CsePlacement.service;

import com.CsePlacement.beans.Person;

import java.util.List;

public interface PersonService {

    Person addPerson(Person person);
    List<Person> getAllPerson();

    Person getPersonById(long id);

}
