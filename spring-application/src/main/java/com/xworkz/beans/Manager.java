package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Autowired
    private Mobile mobile;

    @Autowired
    private  String name;
    @Autowired
    private  String  email;

    public Manager()
    {
        System.out.println("create manager details...................");
    }
}
