package com.xworkz.summer.beans;

import com.xworkz.summer.dto.ContactDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class ContactBean {


    public ContactBean()
    {
        System.out.println("..No parameters....Contact...");
    }

    @PostMapping("/contact")
    public String contact(ContactDTO contactDTO, Model model)
    {
        System.out.println("Contact...");
        //System.out.println("Contact Registration Data");
        System.out.println("Contact Registration Data:"+contactDTO);
        model.addAttribute("name","Thanks for Contact..!:"+contactDTO.getName());
        return "Contact";
    }



}
