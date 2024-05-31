package com.xworkz.springformvalidation.beans;

import com.xworkz.springformvalidation.dto.ScholarshipDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")// / it process the request and response ,helper components dispatcher servlet admin
public class ScholarShipFormBean {

    public ScholarShipFormBean() {
        System.out.println("ScholarShipFormBean............");
    }

    //adimn/appy

    @PostMapping("/apply")
    public String scholar(@Valid ScholarshipDTO scholarshipDTO, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            System.err.println("Dto has invalid data");
            bindingResult.getAllErrors()
                    .forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("dto", scholarshipDTO);
            return "ScholarshipApplicationForm";
        } else {
            model.addAttribute("studentName", "Application SuccessFull..!:" + scholarshipDTO.getStudentName());
        }
        System.out.println("Running scholar method");
        return "Result";
    }


}






