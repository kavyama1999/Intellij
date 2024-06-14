package com.xworkz.summer.dto;

public class MatrimonyDTO {

    //set attribute used to send the data into jsp
    private String name;//the valuse of input same as property values..like these variables

    private int age;

    private  String gender;

    private String martialStatus;

    private  String religion;

    private String job;

    private  String qualification;

    private  String lookingFor;


    public MatrimonyDTO()
    {
        System.out.println("no parameters in MatrimonyDTO ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    @Override
    public String toString() {
        return "MatrimonyDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", martialStatus='" + martialStatus + '\'' +
                ", religion='" + religion + '\'' +
                ", job='" + job + '\'' +
                ", qualification='" + qualification + '\'' +
                ", lookingFor='" + lookingFor + '\'' +
                '}';
    }
}
