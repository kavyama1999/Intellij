package com.xworkz.integration.service;


import com.xworkz.integration.dto.PersonDepartmentDTO;
import com.xworkz.integration.entity.DepartmentEntity;
import com.xworkz.integration.entity.PersonEntity;
import com.xworkz.integration.repository.DepartmentRepository;
import com.xworkz.integration.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonDepartmentServiceImpl implements PersonDepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    PersonRepository personRepository;

    @Override
    public PersonDepartmentDTO getPersonAndDepartmentData(Integer departmentId, Integer personId) {

        DepartmentEntity departmentEntity=departmentRepository.findDepartmentById(departmentId);
        PersonEntity personEntity=personRepository.findPersonById(personId);

        PersonDepartmentDTO personDepartmentDTO=new PersonDepartmentDTO();
        personDepartmentDTO.setDepartmentId(departmentEntity.getId());
        personDepartmentDTO.setDepartmentName(departmentEntity.getDepartmentName());
        personDepartmentDTO.setDepartmentGender(departmentEntity.getGender());
        personDepartmentDTO.setEmployeeName(departmentEntity.getEmployeeName());
        personDepartmentDTO.setSalary(departmentEntity.getSalary());


        personDepartmentDTO.setPersonId(personEntity.getId());
        personDepartmentDTO.setPersonName(personEntity.getName());
        personDepartmentDTO.setPersonAge(personEntity.getAge());
        personDepartmentDTO.setPersonGender(personEntity.getGender());
        log.info("PersonData: {}",personDepartmentDTO);

        return personDepartmentDTO;
    }
}


