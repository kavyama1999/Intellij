package com.xworkz.formvalidation.beans;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.formvalidation.dto.ContactDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@RequestMapping("/")
@EnableWebMvc
public class ContactFormBean {




public ContactFormBean()
{
    System.out.println("ContactFormBean..........");
}

@RequestMapping("/conatct")
public String contactForm(ContactDTO contactDTO, Model model)
{
    System.out.println("Creating ContactForm().....");
    System.out.println("Data:"+contactDTO);
    model.addAttribute("msg","Contacting sucessfully") ;
    return "ContactResult";
}





}


