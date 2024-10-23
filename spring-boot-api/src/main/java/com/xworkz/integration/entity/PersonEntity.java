package com.xworkz.integration.entity;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "person")
public class PersonEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}

//    @ManyToOne
//    @JoinColumn(name = "department_id")  // Assume there is a foreign key 'department_id'
//    private DepartmentEntity department;  // Reference to DepartmentEntity


