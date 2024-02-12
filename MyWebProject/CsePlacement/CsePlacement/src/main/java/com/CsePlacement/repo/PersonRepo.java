package com.CsePlacement.repo;

import com.CsePlacement.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
