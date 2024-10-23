package com.xworkz.integration.service;

import com.xworkz.integration.dto.PersonDepartmentDTO;

public interface PersonDepartmentService {


PersonDepartmentDTO getPersonAndDepartmentData(Integer departmentId, Integer personId);

}

//public DepartmentPersonDTO getCombinedData(Integer departmentId, Integer personId) {
