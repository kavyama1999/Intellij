package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beans")//meta information send to spring contanier
public class CameraPrimaryConfiguration {

    @Bean   //manually register data in bean

    public  String brand()
    {
        System.out.println(" camera brand in  bean");
        return  "Sony";
    }

    @Bean
    public int pixel()
         //   public int camera()
    {
        System.out.println("camera pixel in bean");
        return  200;
    }

    @Bean
    public String mobileBrand()
    {
        System.out.println("mobileBrand in bean");
        return "Samsung";
    }

    @Bean
    public int cost()
    {
        System.out.println("mobile cost in bean");
        return  2000;
    }

    @Bean
    public  String name()
    {
        System.out.println("manager name in bean");
        return "smithan";
    }

    @Bean
    public String email()
    {
        System.out.println(" manger email in bean");
        return "smith@gmail.com";
    }


}
