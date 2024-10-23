package com.xworkz.databaseforms.dto;

public class CountrySearchDTO {


    private String  countryName;


    public CountrySearchDTO()
    {
        System.out.println("No parameters in CountrySearchDTO...");
    }

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
