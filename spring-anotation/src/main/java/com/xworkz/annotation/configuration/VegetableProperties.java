package com.xworkz.annotation.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class VegetableProperties {

    @Value("${host}")
    private String host;

    @Value("${port}")
    private String port;

    @Value("${userName}")
    private String userName;

    @Value("${password}")
    private String password;

    public  VegetableProperties()
    {
        System.out.println("vegatablesPropeties");
    }


        @Bean
        public void vegatablesfields()
        {

            System.out.println("Host:"+host);
            System.out.println("Host:"+port);
            System.out.println("Host:"+userName);
            System.out.println("Host:"+password);
        }



    }

