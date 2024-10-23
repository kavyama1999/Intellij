//package com.xworkz.imageupload.dto;
//
//import org.hibernate.validator.constraints.NotEmpty;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.persistence.*;
//import javax.validation.constraints.*;
//
//
//@Entity
//@Table(name = "contact_data")
//public class ImageDTO {
//
//
//
//
//
//
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Integer id;  //to avoid dataType error we can change datatype as Non-primitive
//
////for string we can use @NotEmpty
//
////    create table contact_data(id int  primary key auto_increment,contact_name varchar(50),email varchar(50),mobile bigint,comments varchar(500));
//
//        @NotEmpty(message = "Name cannot be empty")
//        @Size(min = 2, max = 30, message = "Name should contain only alphabetic letters")
//        @Pattern(regexp = "^[a-zA-Z ]+$", message = "Name should contain only alphabetic letters")
//        @Column(name = "contact_name")
//        private String name;
//
//
//
//
//
//
//        @NotEmpty(message = "Please provide comments")
//        @Size(min = 2, max = 300, message = "Comments should contain between 2 and 300 characters")
//        @Pattern(regexp = "^[a-zA-Z ]+$", message = "Comments should contain only alphabetic letters and spaces")
//        private String comments;
//
//
//  private MultipartFile  imageFile;
//
//
//
//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//
//
//        public String getComments() {
//            return comments;
//        }
//
//        public void setComments(String comments) {
//            this.comments = comments;
//        }
//
//
//    public MultipartFile getImageFile() {
//        return imageFile;
//    }
//
//    public void setImageFile(MultipartFile imageFile) {
//        this.imageFile = imageFile;
//    }
//
//
//    @Override
//    public String toString() {
//        return "ImageDTO{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", comments='" + comments + '\'' +
//                ", imageFile=" + imageFile +
//                '}';
//    }
//}
