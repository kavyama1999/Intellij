package com.xworkz.integration.service;


import com.xworkz.integration.dto.PersonDTO;
import com.xworkz.integration.entity.PersonEntity;
import com.xworkz.integration.repository.PersonRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepo personRepo;

    @Override
    public PersonEntity save(PersonDTO personDTO) {
     PersonEntity personEntity = new PersonEntity();
//        //BeanUtils.copyProperties(personDTO, personEntity);
       // PersonDTO savePerson=new PersonDTO(personDTO);
        personEntity.setName(personDTO.getName());
        personEntity.setAge(personDTO.getAge());
        personEntity.setGender(personDTO.getGender());
        personRepo.save(personEntity);
        return personEntity;
    }

    @Override
    public List<PersonEntity> getAllEPersons() {

        return personRepo.findAll();

//        return Collections.emptyList();
    }

    @Override
    public PersonDTO getById(int id) {
        PersonEntity personEntity = personRepo.getById(id);
        System.out.println("personEntity" + personEntity.getId());
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(personEntity.getId());
        // BeanUtils.copyProperties(personEntity, personDTO);
        personDTO.setName(personEntity.getName());
        personDTO.setAge(personEntity.getAge());
        personDTO.setGender(personEntity.getGender());
        return personDTO;
    }


    @Override
    public List<PersonEntity> deleteByID(int id) {

        PersonDTO personDTO = getById(id);
        if (personDTO.getId() != null) {
            personRepo.deleteById(id);

        }
        return getAllEPersons();
    }

    @Override
    public PersonEntity updateProduct(PersonEntity personEntity) {
        PersonEntity existingPerson = personRepo.findById(personEntity.getId()).orElse(null);
        existingPerson.setName(personEntity.getName());
        existingPerson.setAge(personEntity.getAge());
        existingPerson.setGender(personEntity.getGender());
        return personRepo.save(existingPerson);
    }


}








