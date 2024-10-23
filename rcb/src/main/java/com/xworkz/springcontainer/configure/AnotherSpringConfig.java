package com.xworkz.springcontainer.configure;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(

        {

        }
)
public class AnotherSpringConfig {

    public  AnotherSpringConfig()
    {
        System.out.println("No parametr AnotherSpringConfig");
    }
}
