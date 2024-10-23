package com.xworkz.springcontainer.initializer;

import com.xworkz.springcontainer.configure.SpringPrimaryConfigure;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{


    public SpringWebInit()
    {
        System.out.println("Running in Application context");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running in getRootConfigClasses");

        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringPrimaryConfigure.class};

    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
