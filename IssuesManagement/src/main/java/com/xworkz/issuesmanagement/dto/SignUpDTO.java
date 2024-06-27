package com.xworkz.issuesmanagement.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sign_up")
public class SignUpDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "FirstName cannot be empty")
    @Size(min = 3, max = 30, message = "First Name should contain letters between >2 and <30")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "First Name should contain only alphabetic letters")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "LastName cannot be empty")
    @Size(min = 1, max = 30, message = "LastName should be >1 and <4 letters")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Last Name should contain only alphabetic letters")
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty(message = "Please enter valid email")
    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Please Enter Contact Number")
    @Min(1111111111)
    @Max(9999999999L)
    @Column(name = "contact_number")
    private Long contactNumber;

    @NotNull(message = "Please Enter Alternative Contact Number")
//    @Pattern(regexp = "^[0-9]{10}$", message = "Alternative Contact Number should be 10 digits")
    @Min(1111111111)
    @Max(9999999999L)
    @Column(name = "alternative_number")
    private Long alternateContactNumber;

    @NotEmpty(message = "Please enter Address")
    @Size(min = 5, max = 500, message = "Address should contain between 5 and 500 characters")
    @Column(name = "address")
    private String address;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Column(name = "is_active")
    private boolean isActive;

    @Transient
    //@NotEmpty(message = "Please agree")
    private String agree;






   // @NotEmpty(message = "Password cannot be empty")
   // @Size(min = 8, max = 20, message = "Password should be between 8 and 20 characters")
    @Column(name = "password")
    private String password;


    //for Account locking

    @Column(name = "failed_attempt")
    private int failedAttempt;

    @Column(name = "account_locked")
    private  boolean accountLocked;



    public SignUpDTO() {
        System.out.println("No parameters in SignInDTO..");
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Long getAlternateContactNumber() {
        return alternateContactNumber;
    }

    public void setAlternateContactNumber(Long alternateContactNumber) {
        this.alternateContactNumber = alternateContactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getFailedAttempt() {
        return failedAttempt;
    }

    public void setFailedAttempt(int failedAttempt) {
        this.failedAttempt = failedAttempt;
    }

    public boolean isAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        this.accountLocked = accountLocked;
    }







}

