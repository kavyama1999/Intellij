package com.xworkz.summer.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.summer")
//@PropertySource("classpath:application.properties")
public class SummerPrimaryConfiguration {


    public  SummerPrimaryConfiguration()
    {
        System.out.println("SummerPrimaryConfiguration......");
    }

    //this is for
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
