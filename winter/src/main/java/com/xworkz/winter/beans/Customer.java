package com.xworkz.winter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

@Autowired
//@Qualifier("custNames")

    private String custNames;

@Autowired
    private int salary;

    public  Customer()
    {
        System.out.println("no parameters in customer............");
    }
}
