package com.xworkz.formvalidation.beans;

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
public class TvRechargeBean {

    public TvRechargeBean()
    {
        System.out.println("no Parameters In TvRechargeBean");
    }


    @PostMapping("/tv")
    public String tv(@Valid TvRechargeDTO tvRechargeDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("Data:"+tvRechargeDTO);
        if(bindingResult.hasErrors())
        {
            System.out.println("creating tv method");
            System.out.println("TvRechargeDTO has Invalid data");
    bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
model.addAttribute("errors",bindingResult.getAllErrors());
 return "TvRechargeForm";
        }
        model.addAttribute("msg","Thank You for Recharging:"+tvRechargeDTO.getCustomerName());

        return "TvResult";

    }
}
