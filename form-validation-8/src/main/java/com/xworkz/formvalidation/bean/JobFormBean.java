package com.xworkz.formvalidation.bean;

import com.xworkz.formvalidation.dto.JobFormDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Component
@RequestMapping("/")
//@EnableWebMvc
public class JobFormBean {




    public JobFormBean()
    {
        System.out.println("no parameters in JobFormBean");
    }

    @PostMapping("/apply")
    public String sample(JobFormDTO jobFormDTO, Model model)
    {
        System.out.println("method");
        System.out.println("data:"+jobFormDTO);
        model.addAttribute("msg", "Application SuccessFull..!:" + jobFormDTO.getFirstName());
        return "Result";
    }
}
