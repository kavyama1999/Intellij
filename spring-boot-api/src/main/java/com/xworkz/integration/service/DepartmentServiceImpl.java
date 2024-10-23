package com.xworkz.integration.service;


import com.xworkz.integration.dto.DepartmentDTO;
import com.xworkz.integration.entity.DepartmentEntity;
import com.xworkz.integration.entity.PersonEntity;
import com.xworkz.integration.repository.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;

    @Override
    public DepartmentEntity saveDepartment(DepartmentDTO departmentDTO) {

        // log.info("DepartmentDTO values: {}", departmentDTO);
        DepartmentEntity departmentEntity = new DepartmentEntity();
        log.info("DepartmentDTO values: {}", departmentEntity);

        departmentEntity.setEmployeeName(departmentDTO.getEmployeeName());
        departmentEntity.setDepartmentName(departmentDTO.getDepartmentName());
        departmentEntity.setGender(departmentDTO.getGender());
        departmentEntity.setSalary(departmentDTO.getSalary());
        departmentRepo.save(departmentEntity);
        return departmentEntity;
    }

    @Override
    public List<DepartmentEntity> getDepartmentData() {

        return departmentRepo.findAll();
    }

    @Override
    public Optional<DepartmentEntity> getDepartmentById(int id) {


        return departmentRepo.findById(id);
    }

//    @Override
//    public boolean deleteDepartmentDataById(int id) {
//        Optional<DepartmentEntity> departmentEntity = departmentRepo.findById(id);
//
//        if (departmentEntity.isPresent()) {
//            departmentRepo.deleteById(id);
//            log.info("deleted data {}", departmentEntity);
//            return true;
//        } else {
//            return false;
//        }
//    }


    @Override
    public List<DepartmentEntity> deleteDepartmentDataById(int id) {
        Optional<DepartmentEntity> departmentEntity = departmentRepo.findById(id);

        if (departmentEntity.isPresent()) {
            departmentRepo.deleteById(id);
            log.info("deleted data {}", departmentEntity);

        } else {
            log.info("Data is not present");
        }
        return getDepartmentData();

    }


//    @Override
//    public DepartmentEntity updateDepartment(DepartmentEntity departmentEntity) {
//
//        return  departmentRepo.save(departmentEntity);
//       // return updateDepartment;
//    }


    @Override
    public DepartmentEntity updateDepartment(DepartmentEntity departmentEntity) {
        // Fetch the existing department by ID
        DepartmentEntity existingDepartment = departmentRepo.findById(departmentEntity.getId()).orElse(null);

        // Check if the department exists
        if (existingDepartment != null) {
            // Update the existing department with new values
            existingDepartment.setDepartmentName(departmentEntity.getDepartmentName());
            existingDepartment.setEmployeeName(departmentEntity.getEmployeeName());
            existingDepartment.setGender(departmentEntity.getGender());
            existingDepartment.setSalary(departmentEntity.getSalary());

            // Save the updated department entity
            departmentRepo.save(existingDepartment);

            return existingDepartment;
        }

        return null;
    }

    @Override
    public DepartmentDTO getDeptDataById(int id) {

        DepartmentEntity departmentEntity = departmentRepo.getById(id);

        log.info("Data is present..");
        log.info("Get Data {}", departmentEntity);
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setId(departmentEntity.getId());
        departmentDTO.setDepartmentName(departmentEntity.getDepartmentName());
        departmentDTO.setSalary(departmentEntity.getSalary());
        return departmentDTO;
    }
}


//@Override
//public Optional<DepartmentEntity> deleteDepartmentDataById(int id) {
//    Optional<DepartmentEntity> departmentEntity = departmentRepo.findById(id);
//
//    if (departmentEntity.isPresent()) {
//        departmentRepo.deleteById(id);
//        log.info("Deleted data {}", departmentEntity);
//    } else {
//        log.info("Data is not present");
//    }
//    return departmentEntity;
//}


//@Override
//public PersonEntity updateProduct(PersonEntity personEntity) {
//    PersonEntity existingPerson = personRepo.findById(personEntity.getId()).orElse(null);
//    existingPerson.setName(personEntity.getName());
//    existingPerson.setAge(personEntity.getAge());
//    existingPerson.setGender(personEntity.getGender());
//    return personRepo.save(existingPerson);