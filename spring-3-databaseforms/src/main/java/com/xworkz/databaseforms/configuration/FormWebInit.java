package com.xworkz.databaseforms.configuration;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class FormWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    public FormWebInit() {
        System.out.println("Constructor created for FormWebInit..");
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[]{FormConfiguration.class};
    }


    //it handles static files
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }

}


