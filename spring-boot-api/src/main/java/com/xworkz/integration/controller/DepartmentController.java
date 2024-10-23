package com.xworkz.integration.controller;

import com.xworkz.integration.dto.DepartmentDTO;
import com.xworkz.integration.entity.DepartmentEntity;
import com.xworkz.integration.entity.PersonEntity;
import com.xworkz.integration.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;


    @PostMapping("/saveDepartmentData")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentDTO departmentDTO) {
        log.info("Department data saved successfully");
        System.out.println("data :" + departmentDTO);
        return departmentService.saveDepartment(departmentDTO);

    }


    @GetMapping("/getDepartmentInfo")
    public List<DepartmentEntity> getDepartmentData() {
        return departmentService.getDepartmentData();
    }


    @GetMapping("getDepartmentById")
    public Optional<DepartmentEntity> getDepartmentById(@RequestParam int id) {


        return departmentService.getDepartmentById(id);
    }


//    @DeleteMapping("/deleteDataById")
//    public boolean deleteDepartmentById(@RequestParam int id) {
//        log.info("Deleted data successfully");
//        boolean data = departmentService.deleteDepartmentDataById(id);
//        if (data) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    @DeleteMapping("/deleteDataById")
    public List<DepartmentEntity> deleteDepartmentById(@RequestParam int id) {
        log.info("Deleted data successfully");
        List<DepartmentEntity> data = departmentService.deleteDepartmentDataById(id);
        return data;
        // return getDepartmentData();
    }


    @PutMapping("/updateDepartment")
    public DepartmentEntity updateDepartmentData(@RequestBody DepartmentEntity departmentEntity) {
        log.info("Updated successfully");
        return departmentService.updateDepartment(departmentEntity);
    }


    @GetMapping("/get")
    public DepartmentDTO getDeptById(@RequestParam int id) {
        log.info("Data get successfully");
        return departmentService.getDeptDataById(id);
    }

}












//    @DeleteMapping("/deleteDepartmentData")
//    public List<DepartmentEntity> deleteDepartmentDataById(@RequestParam int id) {
//        boolean isDeleted = departmentService.deleteDepartmentDataById(id);
//        if (isDeleted) {
//            return ("Department data deleted successfully");
//              //      DepartmentEntity.ok("Department data deleted successfully");
//        } else {
//           // return DepartmentEntity.status(HttpStatus.NOT_FOUND).body("Department data not found for ID: " + id);
//        }
//    }
