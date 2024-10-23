package com.xworkz.trailgithub.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan("com.xworkz.trailgithub")
public class TrailGithubPrimaryConfiguration {

    public TrailGithubPrimaryConfiguration()
    {
        System.out.println("TrailGithubPrimaryConfiguration......configuration class");
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








//@Component
//@ComponentScan("com.xworkz.springformvalidation")
//public class SpringFormPrimaryConfiguration {
//
//    public SpringFormPrimaryConfiguration()
//    {
//        System.out.println("SpringFormPrimaryConfiguration..................");
//    }
//
//
//    @Bean
//    public ViewResolver viewResolver()
//    {
//        System.out.println("Register in viewresolver");
//        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
//        resolver.setPrefix("/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
