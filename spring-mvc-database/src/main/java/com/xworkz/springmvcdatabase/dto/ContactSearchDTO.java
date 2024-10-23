package com.xworkz.springmvcdatabase.dto;

public class ContactSearchDTO {


    private String name;


    public ContactSearchDTO()
    {
        System.out.println("No parameters in ContactSearchDTO..");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContactSearchDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
