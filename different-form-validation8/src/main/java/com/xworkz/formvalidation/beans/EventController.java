package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.EventDTO;
import com.xworkz.formvalidation.model.repository.EventRepository;
import com.xworkz.formvalidation.model.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

//@Component
@Controller
@RequestMapping("/")
@EnableWebMvc
public class EventController {

    @Autowired
    private EventService eventService;//inject..loosely coupled bcz it not depending any object or cls..

    public EventController()

    {
        System.out.println("EventController........");

    }

@PostMapping("/event")
    public String  eventForm(@Valid EventDTO eventDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("Data:"+eventDTO);
        if(bindingResult.hasErrors())
        {
            System.out.println("EventDTO has invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
       return  "EventRegistrationForm";
        }

        else {
           boolean data= eventService.eventRegister(eventDTO);

if(data)
{
    System.out.println("save successfully in controller:"+eventDTO);
}
else
{
    System.out.println("not saved successfully in controller:"+eventDTO);

}

            model.addAttribute("msg","EventRegistration Successfull...:"+eventDTO.getName());

            return "EventResult";

        // model.addAttribute("msg","EventRegistration Successfull...:"+eventDTO.getName());

        }

    }
}