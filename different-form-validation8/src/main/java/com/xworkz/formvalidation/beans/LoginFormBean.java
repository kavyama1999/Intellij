package com.xworkz.formvalidation.beans;


import com.xworkz.formvalidation.dto.LoginDTO;
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
public class LoginFormBean {


    public LoginFormBean()
    {
        System.out.println("LoginFormBean..........");
    }

    @PostMapping("/log")
    public String login(@Valid LoginDTO loginDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("Data:" + loginDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("DTO has Invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "LoginForm";

        } else {
            model.addAttribute("msg", "Application SuccessFull..!:" + loginDTO.getUserName());

        }

        //key..this used for retaining the values in server side page

        model.addAttribute("dto",loginDTO );
        return "LoginResult";

    }
}
