package com.xworkz.integration.dto;



import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PersonDTO {

    private Integer id;
    private  String name;
    private Integer age;
    private String gender;
}
