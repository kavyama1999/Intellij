package com.xworkz.imageupload.configuration;


import org.springframework.context.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.imageupload")
//@PropertySource("classpath:application.properties")
@EnableWebMvc
public class ImageConfiguration implements WebMvcConfigurer {


    public ImageConfiguration() {
        System.out.println("Constructor created for SpringConfiguration..");
    }




    //for image
    @Bean
    public CommonsMultipartResolver multipartResolver()
    {
        // CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();

        return new CommonsMultipartResolver();
    }



//    public CommonsMultipartResolver multipartResolver() {
////        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
////        multipartResolver.setMaxUploadSize(2097152); // 2 MB
//        return new CommonsMultipartResolver();
//    }




    @Bean
    public ViewResolver viewResolver() {
        System.out.println("Register  viewResolver in SpringConfiguration");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/"); //mapping..static files
        resolver.setSuffix(".jsp");
        return resolver;
    }




    // js validation to write one ,method

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/js/**").addResourceLocations("/javascript/");
    }


}
