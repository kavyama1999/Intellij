package com.xworkz.integration.service;

import com.xworkz.integration.dto.DepartmentDTO;
import com.xworkz.integration.entity.DepartmentEntity;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {


    DepartmentEntity saveDepartment(DepartmentDTO departmentDTO);

    List<DepartmentEntity> getDepartmentData();

    Optional<DepartmentEntity> getDepartmentById(int id);


    List<DepartmentEntity> deleteDepartmentDataById(int id);

    DepartmentEntity updateDepartment(DepartmentEntity departmentEntity);


    DepartmentDTO getDeptDataById(int id);
}
