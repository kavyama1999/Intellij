package com.xworkz.formvalidation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
//@Component
@ComponentScan("com.xworkz.formvalidation")
@EnableWebMvc
public class JobFormPrimaryConfiguration  implements WebMvcConfigurer {


    public JobFormPrimaryConfiguration()
    {
        System.out.println("JobFormPrimaryConfiguration.............");
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

    //js validation
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/js/**").addResourceLocations("/JavaScript/");
    }

}
