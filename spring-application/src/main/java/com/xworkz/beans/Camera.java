package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Camera {

@Autowired
    private int pixel;

@Autowired
    private  String brand;


    public Camera()
    {
        System.out.println("create camera details..................");
    }

}
