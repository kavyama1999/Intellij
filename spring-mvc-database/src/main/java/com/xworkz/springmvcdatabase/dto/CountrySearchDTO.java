package com.xworkz.springmvcdatabase.dto;

public class CountrySearchDTO {


    private String countryName;


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    @Override
    public String toString() {
        return "CountrySearchDTO{" +
                "countryName='" + countryName + '\'' +
                '}';
    }

}
