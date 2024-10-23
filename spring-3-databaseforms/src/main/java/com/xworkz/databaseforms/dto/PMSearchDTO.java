package com.xworkz.databaseforms.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class PMSearchDTO {




    private String name;


    public PMSearchDTO()
    {
        System.out.println("No parameters in PMSearchDTO..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PMSearchDTO{" +
                "name='" + name + '\'' +
                '}';
    }

}
