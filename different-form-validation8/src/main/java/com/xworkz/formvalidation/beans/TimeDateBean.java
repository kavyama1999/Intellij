package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.TimeDateDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@RequestMapping("/")
@EnableWebMvc
public class TimeDateBean {

    public TimeDateBean()
    {
        System.out.println("TimeDateBean......");
    }


    @PostMapping("/display")
    public String timeDate(TimeDateDTO timeDateDTO, Model model)
    {
        System.out.println("data:"+timeDateDTO);
        return "TimeDateResult";
    }
}
