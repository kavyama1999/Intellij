package com.xworkz.winter.controller;

import com.xworkz.winter.dto.EventDTO;
import com.xworkz.winter.model.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

@Controller
//@Component

@RequestMapping()
//@EnableWebMvc

public class EventFormController {

    @Autowired
    private EventService eventService;


    public EventFormController() {
        System.out.println("Created EventFormController...");
    }


    @PostMapping("/search")
    public String eventForm(@Valid EventDTO eventDTO, BindingResult bindingResult, Model model) {
        System.out.println("Data"+ eventDTO);

        if (bindingResult.hasErrors()) {
            System.out.println("DTO has invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());

            return "EventRegistrationForm";

        } else {

            boolean validate=this.eventService.function(eventDTO);
            if(validate)
            {
                System.out.println("EventService registration successful in Controller:"+eventDTO);
            }
            else {
                System.out.println("EventService registration  not successful in Controller:"+eventDTO);

            }

            model.addAttribute("msg", "Application Successfully:" + eventDTO.getName());
           // return "EventResult";


        }
        return "EventResult";

    }


}


