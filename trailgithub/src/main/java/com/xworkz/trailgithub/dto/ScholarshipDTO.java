package com.xworkz.trailgithub.dto;

import java.time.LocalDate;

public class ScholarshipDTO {


    private String studentName;

    private String fatherName;

    private  String  college;

    private  String mobile;

    private LocalDate dateOfBirth;

    private  String gender;

    private  String address;


    public ScholarshipDTO()
    {
        System.out.println("no parameters in ScholarshipDTO");
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

    public LocalDate getdateOfBirth() {
        return dateOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dateOfBirth = dataOfBirth;
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
                '}';
    }

}


