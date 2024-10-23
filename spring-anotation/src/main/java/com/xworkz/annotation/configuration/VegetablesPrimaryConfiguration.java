package com.xworkz.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//for scan
@ComponentScan("com.xworkz.annotation")//package
@PropertySource("classpath:application.properties")

public class VegetablesPrimaryConfiguration {

    public VegetablesPrimaryConfiguration()
    {
        System.out.println("no parameter in VegetablesPrimaryConfiguration");
    }

    @Bean
    public String name()
    {
        System.out.println("Hotel name");
        return "Udupi";
    }

    @Bean
    public String location()
    {
        System.out.println("Hotel location");
        return  "BTM";
    }

    @Bean
    public  String foodName()
    {
        System.out.println("foofname in food");
        return  "MasalaDosa";
    }

    @Bean
    public int price()
    {
        System.out.println("food price");
        return 100;
    }
}
