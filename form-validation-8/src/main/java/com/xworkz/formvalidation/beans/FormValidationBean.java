package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.FormValidationDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

@Component
@RequestMapping("/")
@EnableWebMvc
public class FormValidationBean {




    public FormValidationBean()
    {
        System.out.println("no parametrs");
    }

    @PostMapping("/apply")
    public String sample(FormValidationDTO formValidationDTO)
    {
        System.out.println("method");
        System.out.println("data:"+formValidationDTO);
        return "Result";
    }

}




