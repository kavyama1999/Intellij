package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.EventDTO;
import com.xworkz.formvalidation.dto.FeedBackDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

@Component
@RequestMapping("/")
//it is compulsory to get next page
@EnableWebMvc
public class FeedBackFormBean {



    public FeedBackFormBean()
    {
        System.out.println("FeedBackFormBean....");
    }


    @PostMapping("/feedback")
    public String feedBack(@Valid FeedBackDTO feedBackDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("feedBack.....");
        if(bindingResult.hasErrors())
        {
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
        model.addAttribute("errors",bindingResult.getAllErrors());
        return "FeedBackForm";
        }

        else
        {

            model.addAttribute("msg","Feedback Successfull:"+feedBackDTO.getName());
            return "FeedBackResult";

        }
//        return "FeedBackResult";
    }
}




//public String  eventForm(@Valid EventDTO eventDTO, BindingResult bindingResult, Model model)
//{
//    System.out.println("Data:"+eventDTO);
//    if(bindingResult.hasErrors())
    ///{
//        System.out.println("EventDTO has invalid data");
//        bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
//        model.addAttribute("errors",bindingResult.getAllErrors());
//        return  "EventRegistrationForm";
//    }
//    else {
//
//        model.addAttribute("msg","EventRegistration Successfull...:"+eventDTO.getName());
//
//        return "EventResult";
//
////            model.addAttribute("msg","EventRegistration Successfull...:"+eventDTO.getName());
//
//    }
//
//}
//}