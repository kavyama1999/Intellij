package com.xworkz.formvalidation.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FeedBackDTO {


    @NotNull(message = "Name cannot be null ")
    @Size(min = 2, max = 30, message = "Name should contain only alphabetic characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name should contain only alphabetic characters")
    private String name;


    @NotEmpty(message = "Email cannot be empty")
//   @Email(message = "Enter valid email")
    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
    private String email;


    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
    private String phone;

    @NotNull(message = "Please enter ratings")
    private String rating;

    @NotNull(message = "Please give me feedback ")
    private String feedback;

    @NotEmpty(message = "please subscribe")
    private String subscribe;

    public FeedBackDTO() {
        System.out.println("No parameters in FeedBackDTO");
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public String toString() {
        return "FeedBackDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", rating='" + rating + '\'' +
                ", feedback='" + feedback + '\'' +
                ", subscribe='" + subscribe + '\'' +
                '}';
    }
}
