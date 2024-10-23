package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {


@Autowired
    private  Camera camera;

@Autowired
    private String brand;
@Autowired
//@Qualifier("cost")
    private  int cost;

    public Mobile()
    {
        System.out.println("create mobile details................");
    }

}
