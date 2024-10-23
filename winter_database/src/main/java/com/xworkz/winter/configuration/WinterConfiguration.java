package com.xworkz.winter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz.winter")
@PropertySource("classpath:application.properties")
@EnableWebMvc

public class WinterConfiguration implements  WebMvcConfigurer{


    public  WinterConfiguration()
    {
        System.out.println("Created WinterConfiguration");
    }


    @Bean
    public ViewResolver viewResolver()
    {
        System.out.println("Register  viewresolver in WinterConfiguration");
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    //js validation to write one ,method

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        WebMvcConfigurer.super.addResourceHandlers(registry);
    registry.addResourceHandler("/js/**").addResourceLocations("/javascript/");
    }
}
