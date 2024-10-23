package com.xworkz.integration.repository;

import com.xworkz.integration.entity.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {
    @Query("SELECT p FROM PersonEntity p WHERE p.id = :personId")
    PersonEntity findPersonById(Integer personId);
}
