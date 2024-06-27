package com.xworkz.formvalidation.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeDateDTO {

    private String name;

    private String email;

    private Long phone;

    private LocalDate date;

    private LocalTime time;

    private String confirm;


    public TimeDateDTO()
    {
        System.out.println("No parametrs in TimeDateDTO");
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }


    @Override
    public String toString() {
        return "TimeDateDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", date=" + date +
                ", time=" + time +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
