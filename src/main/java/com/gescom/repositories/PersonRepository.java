package com.gescom.repositories;

import com.gescom.entities.Person;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PersonRepository extends JpaRepository<Person, Long> {
}
