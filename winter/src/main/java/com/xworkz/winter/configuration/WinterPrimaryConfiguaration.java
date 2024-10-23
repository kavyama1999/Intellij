package com.xworkz.winter.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.winter")
//@PropertySource("classpath:application.properties")
public class WinterPrimaryConfiguaration {


    @Bean
    public  int shopId()
    {
        System.out.println("shopId in shop");
        return  20;
    }

    @Bean
    public  int salary()
    {
        System.out.println("salary in customer");
        return  3000;
    }

    @Bean

    public String custName()
    {
        System.out.println("custName in customer");
        return  "Naveen";
    }
    @Bean
    public String shopOwnerName()
    {
        System.out.println("shopOwnerName in Shop");
        return "Ramesh";
    }

    public  WinterPrimaryConfiguaration()
    {
        System.out.println("...WinterPrimaryConfiguaration");
    }




}

