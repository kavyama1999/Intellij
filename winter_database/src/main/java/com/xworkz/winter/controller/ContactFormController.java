package com.xworkz.winter.controller;

import com.xworkz.winter.dto.ContactDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping
public class ContactFormController {


    public ContactFormController() {
        System.out.println("Created ContactFormController");
    }


    @PostMapping("/connect")
    public String contactDetails(@Valid ContactDTO contactDTO, BindingResult bindingResult, Model model) {

        System.out.println("created contactDetails method");
        System.out.println("Contact Details:" + contactDTO);

        if(bindingResult.hasErrors()) {
            System.out.println("DTO has invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());

            return "ContactForm";
        }
        else

        {

            model.addAttribute("msg", "Thank you for contacting...!" + contactDTO.getName());

            return "ContactForm"; //response in same page
        }

    }
}