package com.xworkz.springcontainer.initializer;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    public Phone()
    {
        System.out.println("No parameter in Phone");
    }
}
