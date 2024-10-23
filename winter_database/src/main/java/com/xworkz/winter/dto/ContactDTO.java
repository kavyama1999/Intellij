package com.xworkz.winter.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.security.SecureRandom;

public class ContactDTO {


    public ContactDTO()
    {
        System.out.println("No parameters in ContactDTO");
    }


    @NotNull(message = "name cannot be null")
    @Size(min=2,max=30,message = "Name should contain alphabetic characters only")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name should contain only alphabetic characters")
    private String name;

    @NotEmpty(message = "Email cannot be empty")
//   @Email(message = "Enter valid email")
    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
    private String email;


    @NotNull(message = "Please enter Mobile Number")
//    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
    @Min(1000000000)
    @Max(9999999999L)
    private Long phone;


    @NotEmpty(message = "name cannot be null")
    @Size(min=2,max=500,message = "Name should contain alphabetic characters only")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Message should contain only alphabetic characters")
    private String subject;

//   .. \\s..include space


    @NotBlank(message = "Message cannot be blank")
    @Size(min=5 ,max = 500, message = "Message cannot be longer than 500 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Message should contain only alphabetic characters")

//    @Column(name = "event_comment")
    private String message;

    @NotEmpty(message = "please Select contactMethod")
    private String contactMethod;


    @NotEmpty(message = "please confirm")  //for checkbox no need to store so that's y we can make it as @Transient.
    private String confirm;


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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }


    @Override
    public String toString() {
        return "ContactDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", contactMethod='" + contactMethod + '\'' +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}

