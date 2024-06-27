package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.JobFormDTO;
import com.xworkz.formvalidation.model.service.JobFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

//@Component
@Controller
@RequestMapping("/")
@EnableWebMvc
public class JobFormController {

    @Autowired
    private JobFormService jobFormService;
    public JobFormController() {
        System.out.println("No parameters in JobFormBean ");
    }

    @RequestMapping("/apply")

    public String jobForm(@Valid JobFormDTO jobFormDTO, BindingResult bindingResult, Model model) {
        System.out.println("Data:" + jobFormDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("DTO has Invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "JobApplicationForm";

        } else {

            boolean data=jobFormService.jobRegister(jobFormDTO);
            if(data)
            {
                System.out.println("Data saved successfully in JobFormController:"+jobFormDTO);
            }

            else {
                System.out.println("Data not saved Successfully in JobFormController:"+jobFormDTO);
            }
            model.addAttribute("msg", "Application SuccessFull..!:" + jobFormDTO.getFirstName());

        }

        //key..this used for retaining the values in server side page

        model.addAttribute("dto",jobFormDTO );
        return "Result";

    }
}
