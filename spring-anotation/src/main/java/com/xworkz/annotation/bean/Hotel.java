package com.xworkz.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sun.security.mscapi.CPublicKey;

@Component
public class Hotel {//hotel depends food

   // @Autowired
    private  Food food;

   @Autowired
   @Qualifier("name")
    private String hotelname;

    @Autowired
    private String location;


    public Hotel() {
        System.out.println("Hotel.....................");
    }

    //constructor dependency injection
    @Autowired
        public Hotel(Food food)    //multiple parameters iddaga @Autowired
        {
            this.food=food;
            System.out.println("constructor dependency injection");
        }

        //setter dependency injection
//@Autowired
//    public  void setName(String hname)
//    {
//        System.out.println("setter dependency injection");
//            this.hname=hname;
//    }

    }

