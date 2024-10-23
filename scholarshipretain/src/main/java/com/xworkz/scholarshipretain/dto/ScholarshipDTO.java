package com.xworkz.scholarshipretain.dto;

import java.time.LocalDate;

public class ScholarshipDTO {

    //@NotNull(message = "Name cannot be null")
   // @Size(min=3,max=30,message = "Name should be min 3 and max 30")
    private String studentName;

    //@Size(min=3,max=30,message = "Name should be min 3 and max 30")
    private String fatherName;

    private  String  college;

    private  String mobile;

    private LocalDate dateOfBirth;

    private  String gender;

    private  String address;

    private String confirm;

    public ScholarshipDTO()
    {
        System.out.println("no parameters");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        return "ScholarshipDTO{" +
                "studentName='" + studentName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", college='" + college + '\'' +
                ", mobile='" + mobile + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
