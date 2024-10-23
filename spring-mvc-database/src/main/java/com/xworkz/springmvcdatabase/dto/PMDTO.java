package com.xworkz.springmvcdatabase.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Table(name = "pm_details")
public class PMDTO {

    public PMDTO()
    {
        System.out.println("No Parameters in PMDTO.. ");
    }




//    create table pm_details(id int primary key auto_increment,pm_name varchar(30),
//    pm_country_name varchar(30), date_Of_Birth date,alive varchar(30));
//

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @NotEmpty(message = "Name cannot be empty")
        @Size(min=2,max=30,message = "Name should contain only alphabetic letters")
        @Pattern(regexp = "^[a-zA-Z ]+$",message = "Name should contain only alphabetic letters")
        @Column(name = "pm_name")
        private String name;

        @NotEmpty(message = "please enter country")
        @Column(name = " pm_country_name")
        private String  country;

        @NotNull(message = "Please enter dateOfBirth")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(name = "date_Of_Birth")
        private LocalDate dob;


        @NotEmpty(message = "Please select alive")
        private String alive;


        //@NotEmpty(message = "Please confirm")
        @Transient
        private String confirm;




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

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public LocalDate getDob() {
            return dob;
        }

        public void setDob(LocalDate dob) {
            this.dob = dob;
        }

        public String getAlive() {
            return alive;
        }

        public void setAlive(String alive) {
            this.alive = alive;
        }

        public String getConfirm() {
            return confirm;
        }

        public void setConfirm(String confirm) {
            this.confirm = confirm;
        }


        @Override
        public String toString() {
            return "PMDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    ", dob=" + dob +
                    ", alive='" + alive + '\'' +
                    ", confirm='" + confirm + '\'' +
                    '}';
        }

    }
