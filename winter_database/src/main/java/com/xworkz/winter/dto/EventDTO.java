package com.xworkz.winter.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class EventDTO {

    @NotNull(message = "Name connot be null")
    @Size(min=2,max=30,message ="Name should contain only alphabetic characters" )
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name should contain only alphabetic characters")
    private String name;


    @NotEmpty(message = "Email cannot be empty")
//   @Email(message = "Enter valid email")
    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
    private String  email;


    @NotNull(message = "Please enter Mobile")
//    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
    @Min(1000000000)
    @Max(9999999999L)
    private Long phone;


    @NotEmpty(message = "please Select event")
    private String event;


    @NotNull(message = "Please enter dateOfBirth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate  date;


    @NotEmpty(message = "please comment")
    private String  comment;

    @NotEmpty(message = "please confirm")
    private String confirm;


    public EventDTO()
    {
        System.out.println("No arguments in EventDTO");
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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", event='" + event + '\'' +
                ", date=" + date +
                ", comment='" + comment + '\'' +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
