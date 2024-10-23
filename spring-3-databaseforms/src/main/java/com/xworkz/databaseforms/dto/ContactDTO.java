package com.xworkz.databaseforms.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "contact_data")
public class ContactDTO {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;  //to avoid dataType error we can change datatype as Non-primitive

//for string we can use @NotEmpty

//    create table contact_data(id int  primary key auto_increment,contact_name varchar(50),email varchar(50),mobile bigint,comments varchar(500));

@NotEmpty(message = "Name cannot be empty")
@Size(min=2,max=30,message = "Name should contain only alphabetic letters")
@Pattern(regexp = "^[a-zA-Z ]+$",message = "Name should contain only alphabetic letters")
@Column(name = "contact_name")
private String name;

@NotEmpty(message = "Email cannot be empty")
@Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
private String email;


@NotNull(message = "Please enter mobile number")
@Min(1000000000)
//@Min(1)
@Max(9999999999L)
private Long mobile;

    @NotEmpty(message = "Please provide comments")
    @Size(min = 2, max = 300, message = "Comments should contain between 2 and 300 characters")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Comments should contain only alphabetic letters and spaces")
    private String comments;



    //@NotEmpty(message = "Please confirm")
    @Transient //its not identify by the table
    private String confirm;

    //allows you to submit binary data and multiple data types in single request;
    //you can use these requests for file uploads and transferring a file with a JSON object
   // private MultipartFile imageFile;

//@NotEmpty(message = "Please confirm")
//@Transient //its not identify by the table
//private String confirm;




public ContactDTO()
{
    System.out.println("No parameters ContactDTO..");
}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

//    public MultipartFile getImageFile() {
//        return imageFile;
//    }
//
//    public void setImageFile(MultipartFile imageFile) {
//        this.imageFile = imageFile;
//    }


    @Override
    public String toString() {
        return "ContactDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", comments='" + comments + '\'' +
                ", confirm='" + confirm + '\'' +
               // ", imageFile=" + imageFile +
                '}';
    }
}

