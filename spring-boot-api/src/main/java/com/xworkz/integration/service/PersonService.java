package com.xworkz.integration.service;


import com.xworkz.integration.dto.PersonDTO;
import com.xworkz.integration.entity.PersonEntity;

import java.util.List;

public interface PersonService {


    public PersonEntity save(PersonDTO personDTO);

//    PersonEntity save(PersonDTO personDTO);


    public List<PersonEntity> getAllEPersons();


//    public List<PersonDTO> saveAllPersons(List<PersonDTO> personDTOS);

    PersonDTO getById(int id);


    List<PersonEntity> deleteByID(int id);

    public PersonEntity updateProduct(PersonEntity personEntity);
}