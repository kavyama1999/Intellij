package com.xworkz.databaseforms.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="country_data")
public class CountryDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotEmpty(message = "CountryName cannot be empty")
    @Column(name="country_name")
    private String countryName;


    @Max(9999999999L)
    @Min(1)
    @NotNull(message = "Please enter population number")
    private Long population;

@NotEmpty(message = "CapitaCity cannot be empty ")
@Column(name = "capital_city")
    private String capitalCity;

//@NotEmpty(message = "NoOfStates cannot be empty") //for string
@NotNull(message = "NoOfStates cannot be Null")
@Column(name = "No_Of_States")
private Integer noOfStates;

//@NotEmpty(message = "Please confirm")
@Transient //it will not match
private String confirm;

    public CountryDTO() {
        System.out.println("No parameters in CountryDTO. ");
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public Long getPopulation()
    {
        return population;
    }

    public void setPopulation(Long population)
    {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public Integer getNoOfStates() {
        return noOfStates;
    }

    public void setNoOfStates(Integer noOfStates) {
        this.noOfStates = noOfStates;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }


    @Override
    public String toString() {
        return "CountryDTO{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                ", capitalCity='" + capitalCity + '\'' +
                ", noOfStates=" + noOfStates +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
