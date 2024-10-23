package com.xworkz.integration.entity;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
@Entity
@Table(name = "department")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


    private String employeeName;

    private String departmentName;

    private Long salary;

    private String gender;



}
