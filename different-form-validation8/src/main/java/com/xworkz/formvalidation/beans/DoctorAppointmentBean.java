package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.DoctorDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class DoctorAppointmentBean {



    public DoctorAppointmentBean()
    {
        System.out.println("DoctorAppointmentBean..Bean...");
    }


    //method
    @PostMapping("/doctor")
    public String doctorAppointment(@Valid DoctorDTO doctorDTO, Model model)
    {
        System.out.println("creating DoctorAppointment method...");
        model.addAttribute("msg","Appointment sucessfull:..."+doctorDTO.getName());
        //return "DoctorAppointmentForm";
        return "DoctorResult";

    }
}
