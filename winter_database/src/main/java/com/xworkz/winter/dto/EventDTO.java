package com.xworkz.winter.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;


@Entity
@Table(name="event")
public class EventDTO {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "event_id")
    private  int id;

    @NotNull(message = "Name cannot be null")
    @Size(min=2,max=30,message ="Name should contain only alphabetic characters" )
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Name should contain only alphabetic characters")
    @Column(name = "candidate_name")
    private String name;


//    "^[a-zA-Z ]+$"...it include space

    @NotEmpty(message = "Email cannot be empty")
//   @Email(message = "Enter valid email")
    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
    @Column(name = "candidate_email")
    private String  email;


    @NotNull(message = "Please enter Mobile")
//    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
    @Min(1000000000)
    @Max(9999999999L)
    @Column(name = "event_phone")
    private Long phone;


    @NotEmpty(message = "please Select event")
    @Column(name = "event_type")
    private String event;


    @NotNull(message = "Please enter Event Date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @PastorPresent

    @Column(name = "event_date")
    private LocalDate  date;


//    @NotBlank(message = "Comment cannot be blank")
//    @Size(min=5 ,max = 500, message = "Comment cannot be longer than 500 characters")
//    @Column(name = "event_comment")
//    private String  comment;

    @NotEmpty(message = "please confirm")  //for checkbox no need to store so that's y we can make it as @Transient.
    @Transient
    private String confirm;


    public EventDTO()
    {
        System.out.println("No arguments in EventDTO");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", event='" + event + '\'' +
                ", date=" + date +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
