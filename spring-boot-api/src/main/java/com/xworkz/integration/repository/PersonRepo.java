package com.xworkz.integration.repository;

import com.xworkz.integration.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends  JpaRepository<PersonEntity,Integer>
{

}

//public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
