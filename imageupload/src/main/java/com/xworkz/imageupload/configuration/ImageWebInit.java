package com.xworkz.imageupload.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class ImageWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    public ImageWebInit() {
        System.out.println("Constructor created for ImageWebInit");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ImageConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("/tmp", 2097152, 4194304, 0));
    }

}




//        }
//@Override
//protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//    registration.setMultipartConfig(new MultipartConfigElement("/tmp", 2097152, 4194304, 0));
