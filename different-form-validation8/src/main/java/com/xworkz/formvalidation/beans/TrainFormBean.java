package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.TrainDTO;
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
public class TrainFormBean {


    public TrainFormBean() {
        System.out.println("TrainFormBean.......");
    }


    @PostMapping("/train")
    public String trainForm(@Valid TrainDTO trainDTO, BindingResult bindingResult, Model model) {
        System.out.println("Data:" + trainDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("DTO has Invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "TrainTicketReservationForm";

        } else {
            model.addAttribute("msg", "Application SuccessFull..!:" + trainDTO.getfName());

        }

        //key..this used for retaining the values in server side page

        model.addAttribute("dto",trainDTO );
        return "TrainResult";

    }
}
//        System.out.println("Data:"+trainDTO);
//        model.addAttribute("msg","Reservation Successfull:"+trainDTO.getfName());
//        return "TrainResult";


