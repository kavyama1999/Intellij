package com.xworkz.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Food {



    @Autowired
    private String foodName;

    @Autowired
    private  int price;


    public Food()
    {
        System.out.println("Food...........");
    }
}
