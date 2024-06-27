package com.xworkz.formvalidation.beans;

import com.xworkz.formvalidation.dto.ComputerPartsDTO;
import com.xworkz.formvalidation.dto.TvRechargeDTO;
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
public class ComputerPartsBean {


    public ComputerPartsBean() {
        System.out.println("ComputerPartsBean..........");
    }

    @PostMapping("/computerparts")
    public String computerParts(@Valid ComputerPartsDTO computerPartsDTO, BindingResult bindingResult, Model model) {
        System.out.println("Data:" + computerPartsDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("ComputerPartsDTO has invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "ComputerParts";
        } else {
            model.addAttribute("msg", "Application SuccessFull..!:" + computerPartsDTO.getBrandName());

        }

        //key..this used for retaining the values in server side page

        model.addAttribute("dto", computerPartsDTO);
        return "ComputerResult";

    }

}
