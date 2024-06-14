//package com.xworkz.winter.dto;
//
//import org.hibernate.validator.constraints.NotEmpty;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;
//
//public class dto package com.xworkz.formvalidation.dto;
//
//import org.hibernate.validator.constraints.NotEmpty;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;
//import java.time.LocalDate;
//
//public class EventDTO1 {
//
//    @NotNull(message = "Name cannot be null ")
//    @Size(min=2,max=30,message = "Name should contain only alphabetic characters")
//    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name should contain only alphabetic characters")
//    private String name;
//
//
//    @NotEmpty(message = "Email cannot be empty")
////   @Email(message = "Enter valid email")
//    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
//    private String email;
//
//
//    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
//    private  String phone;
//
//    private String event;
//
//    @NotNull(message = "Please enter date")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private String date;
//
//    @NotEmpty(message = "please Comment")
//    private String comment;
//
//    @NotEmpty(message = "please confirm")
//    private   String   confirm;
//
//    public EventDTO()
//    {
//        System.out.println("No Parameters in EventDTO");
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getEvent() {
//        return event;
//    }
//
//    public void setEvent(String event) {
//        this.event = event;
//    }
//
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public String getConfirm() {
//        return confirm;
//    }
//
//    public void setConfirm(String confirm) {
//        this.confirm = confirm;
//    }
//
//    @Override
//    public String toString() {
//        return "EventDTO{" +
//                "name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                ", event='" + event + '\'' +
//                ", date='" + date + '\'' +
//                ", comment='" + comment + '\'' +
//                ", confirm='" + confirm + '\'' +
//                '}';
//    }
//}
//{
//}
