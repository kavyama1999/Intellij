package com.xworkz.integration.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
public class DepartmentDTO {

    private Integer id;
    private String employeeName;
    private String departmentName;
    private Long salary;
    private String gender;


}
