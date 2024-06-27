package com.xworkz.formvalidation.dto;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class JobFormDTO {

    @NotNull(message="FirstName cannot be null")
    @Size(min=2,max=30,message = "FirstName should contain only alphabetic characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "StudentName should contain only alphabetic characters")
    private String firstName;



    @Size(min=1,max=2,message = " Lat Name should be min 1 and max 2")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last Name should contain only alphabetic characters")
    private String lastName;


    @NotEmpty(message = "Email cannot be empty")
//   @Email(message = "Enter valid email")
    //@Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
    @Pattern(regexp = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$",message = "Enter valid  Email")
    private String email;

    @NotNull(message = "Please enter Mobile")
//    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
    @Min(1000000000)
    @Max(9999999999L)
    private  Long mobile;

    @NotNull(message = "Please enter dateOfBirth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate interviewDate;

    @NotNull(message = "gender cannot be null")
    private String gender;

    @NotNull(message = "address cannot be null")
    @Size(min=3,max=300,message = " please enter address")
    private String address;

    @NotEmpty(message = "please confirmed")
    private String confirmed;

    @NotEmpty(message = "please confirm")
    private  String confirm;


    public JobFormDTO()
    {
        System.out.println("No parameters In JobFormDTO");
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public LocalDate getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDate interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        return "JobFormDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", interviewDate=" + interviewDate +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}


//<script src="/different-form-validation8/js/jobform.js"></script>
