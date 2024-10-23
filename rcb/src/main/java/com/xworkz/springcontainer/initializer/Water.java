package com.xworkz.springcontainer.initializer;

import org.springframework.stereotype.Component;

@Component
public class Water {

    private  String water;

    public Water()
    {
        System.out.println("water");
    }
}
