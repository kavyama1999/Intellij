package com.xworkz.formvalidation.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DoctorDTO {

    private String name;
    private String email;
    private Long phone;
    private String preferredDoctor;
    @NotNull(message = "Date is required")
//    @PastOrPresent(message = "The date must be in the past or present")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    //@NotNull(message = "Time is required")
    // Custom validation can be added here if needed
    //@Time // Assume @Time is a custom annotation if you have created one    private LocalTime time;
    private String confirm;

    public DoctorDTO() {
        System.out.println("No parameters in DoctorDTO");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getPreferredDoctor() {
        return preferredDoctor;
    }

    public void setPreferredDoctor(String preferredDoctor) {
        this.preferredDoctor = preferredDoctor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

//    public LocalTime getTime() {
//        return time;
//    }

//    public void setTime(LocalTime time) {
//        this.time = time;
//    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        return "DoctorDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", preferredDoctor='" + preferredDoctor + '\'' +
                ", date=" + (date != null ? date.format(dateFormatter) : "null") +
               // ", time=" + (time != null ? time.format(timeFormatter) : "null") +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
