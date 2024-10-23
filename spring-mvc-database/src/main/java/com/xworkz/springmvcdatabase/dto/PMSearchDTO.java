package com.xworkz.springmvcdatabase.dto;

public class PMSearchDTO {


    private String  name;

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
