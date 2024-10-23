package com.xworkz.integration.dto;


import lombok.*;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Slf4j
@ToString
public class PersonDepartmentDTO {


    // Fields from PersonEntity
    private Integer personId;
    private String personName;
    private Integer personAge;
    private String personGender;

    // Fields from DepartmentEntity
    private Integer departmentId;
    private String employeeName;
    private String departmentName;
    private Long salary;
    private String departmentGender;
}
