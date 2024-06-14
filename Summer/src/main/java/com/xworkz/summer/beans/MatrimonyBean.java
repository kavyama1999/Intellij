package com.xworkz.summer.beans;


import com.xworkz.summer.dto.MatrimonyDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class MatrimonyBean {

    public MatrimonyBean() {
        System.out.println("no parametr MatrinomyForm");
    }


    @PostMapping("/go")
    public String matrinomy(MatrimonyDTO matrimonyDTO, Model model) {
        System.out.println("matrimony...");
        System.out.println("Matrimony Register Data:"+matrimonyDTO);
   //model.addAttribute("message", "Register");
        model.addAttribute("message", "Registration successful!:"+matrimonyDTO.getName()); // or any other message you want to display

        return "MatrimonyRegisterForm";

    }
}



//    model.addAttribute("attributeName", "attributeValue"); // Specify the attribute name and value
//@PostMapping("/go")
//public String matrinomy(MatrimonyDTO matrimonyDTO, Model model) {
//    System.out.println("matrimony...");
//    System.out.println("Matrimony Register Data:" + matrimonyDTO);
//    model.addAttribute("attributeName", "attributeValue"); // Specify the attribute name and value
//    return "MatrimonyRegisterForm.jsp";
//}
//
//
//@PostMapping("/go")
//public String matrinomy(MatrimonyDTO matrimonyDTO, Model model) {
//    System.out.println("matrimony...");
//    System.out.println("Matrimony Register Data:" + matrimonyDTO);
//    model.addAttribute("message", "fjjfhhfgh");
//    return "MatrimonyRegisterForm.jsp";
//}
