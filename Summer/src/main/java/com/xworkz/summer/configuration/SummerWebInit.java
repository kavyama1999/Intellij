package com.xworkz.summer.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SummerWebInit extends AbstractAnnotationConfigDispatcherServletInitializer  implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SummerPrimaryConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};

        // return new String[]{"/click", "/go", "/contact"};

    }

      //it is used for diffrentiate between static and dynamic resources
    @Override
    public  void configureDefaultServletHandling(DefaultServletHandlerConfigurer configure)
    {
        WebMvcConfigurer.super.configureDefaultServletHandling(configure);
        configure.enable();




    }
}
