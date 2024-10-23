package com.xworkz.integration.controller;

import com.xworkz.integration.dto.PersonDepartmentDTO;
import com.xworkz.integration.service.PersonDepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PersonAndDepartmentController {


    @Autowired
    PersonDepartmentService personDepartmentService;

    @GetMapping("/getCombineData")
    public PersonDepartmentDTO getCombineData(@RequestParam Integer departmentId, @RequestParam Integer personId) {
        log.info("Combined Data successfully");
        return personDepartmentService.getPersonAndDepartmentData(departmentId, personId);
    }


}

//@RequestParam Integer departmentId, @RequestParam Integer personId
//GET /api/getCombinedData?departmentId=1&personId=1
