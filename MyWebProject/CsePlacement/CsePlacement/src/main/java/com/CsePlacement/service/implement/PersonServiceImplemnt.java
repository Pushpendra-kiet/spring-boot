package com.CsePlacement.service.implement;

import com.CsePlacement.beans.Person;
import com.CsePlacement.repo.PersonRepo;
import com.CsePlacement.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplemnt implements PersonService {

   PersonRepo personRepo;

    public PersonServiceImplemnt(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public Person addPerson(Person person) {
        return this.personRepo.save(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return this.personRepo.findAll();
    }

    @Override
    public Person getPersonById(long id) {
        return this.personRepo.findById(id).orElseThrow(()->new RuntimeException());
    }
}
