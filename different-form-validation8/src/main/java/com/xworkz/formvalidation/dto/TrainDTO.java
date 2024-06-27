package com.xworkz.formvalidation.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TrainDTO {

    @NotNull(message = "Fname cannot be null")
    @Size(min = 2, max = 30, message = "Name should contain only alphabetic characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name should contain only alphabetic characters")
    private String fName;


    @NotNull(message = "Fname cannot be null")
    @Size(min = 1, max = 3, message = "Name should contain only alphabetic characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name should contain only alphabetic characters")
    private String lName;

    @Pattern(regexp = "\\d{10}",message = "phone_no must be 10 digits")
    private  String phone;

    @Pattern(regexp = "\\d{8}",message = "Train_no must be 8 digits")
    private String train;

    @NotEmpty(message = "please select sleeper mode")
    private String sleeper;

    @NotNull(message = "Station Name cannot be null")
    @Size(min = 2, max = 30, message = "Station Name should contain only alphabetic characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Station Name should contain only alphabetic characters")
    private String stationName;

    @NotNull(message = "Please enter date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datOfJourney;

    @NotNull(message = "Please enter Confirm")
    private String confirm;

    public TrainDTO()
    {
        System.out.println("No parameters in TrainDTO");
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getSleeper() {
        return sleeper;
    }

    public void setSleeper(String sleeper) {
        this.sleeper = sleeper;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public LocalDate getDatOfJourney() {
        return datOfJourney;
    }

    public void setDatOfJourney(LocalDate datOfJourney) {
        this.datOfJourney = datOfJourney;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        return "TrainDTO{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phone='" + phone + '\'' +
                ", train='" + train + '\'' +
                ", sleeper='" + sleeper + '\'' +
                ", stationName='" + stationName + '\'' +
                ", datOfJourney=" + datOfJourney +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
