package com.xworkz.formvalidation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//@Component
@Configuration
@ComponentScan("com.xworkz.formvalidation")
@EnableWebMvc
//is is used for spring form validation
public class FormValidationPrimaryConfiguration {


public  FormValidationPrimaryConfiguration()
{
    System.out.println("No parameters in FormValidationPrimaryConfiguration................");
}




    @Bean
    public ViewResolver viewResolver()
    {
        System.out.println("Register in viewresolver");
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }



}
