package com.xworkz.formvalidation.dto;

public class JobFormDTO {

    private String firstName;

    private String lastName;

    private String email;

    private  String mobile;

    private  String  interviewDate;

    private String gender;

    private String address;

    private String confirmed;

    private String resume;

    private  String confirm;


    public JobFormDTO()
    {
        System.out.println("No parameters .....");
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
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

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        return "SampleDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", interviewDate='" + interviewDate + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", resume='" + resume + '\'' +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
