package com.xworkz.formvalidation.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.beans.Transient;

public class LoginDTO {

    @NotNull(message = "UserName cannot be null")
    @Size(min=2,max=30,message = "Name should contain only alphabetic characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name should contain only alphabetic characters")
    private String userName;

    @NotEmpty(message = "Email cannot be empty")
//   @Email(message = "Enter valid email")
    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
    private  String email;


    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
    private String phone;

//    @Pattern(regexp = "\\d{6}", message = "Password must  be exact 6 digits")

    private  String password;

//    @Transient(message "")
@NotEmpty(message = "Confirm password cannot be empty")

private String cmfPassword;

@NotEmpty(message = "please select")
private String remember;


public LoginDTO()
{
    System.out.println("No Parameters in LoginDTO");
}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCmfPassword() {
        return cmfPassword;
    }

    public void setCmfPassword(String cmfPassword) {
        this.cmfPassword = cmfPassword;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", cmfPassword='" + cmfPassword + '\'' +
                ", remember='" + remember + '\'' +
                '}';
    }
}
