package com.xworkz.springcontainer.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bottele {

    //init properties,association,
    @Autowired
    private  Water water;

    //@Qualifier("water");
    public Bottele()
    {
        System.out.println("bottle");
    }

}
