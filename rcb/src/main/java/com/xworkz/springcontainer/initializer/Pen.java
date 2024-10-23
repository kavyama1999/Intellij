package com.xworkz.springcontainer.initializer;

import org.springframework.stereotype.Component;

@Component
public class Pen {

    public Pen()
    {
        System.out.println("No parametr in Pen");
    }
}
