package com.xworkz.issuesmanagement.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.issuesmanagement.dto.SignInDTO;
import com.xworkz.issuesmanagement.model.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class SignInController {


    @Autowired
    private SignInService signInService;

    public SignInController() {
        System.out.println("No parameters Constructor created for SignInController");
    }


    //for post mapping we use (post method)..(for get mapping we use get method)
    @PostMapping("sign-in")  //we can use '/' or not no issues

    public String signInform(@Valid SignInDTO signInDTO, BindingResult bindingResult, Model model) {
        System.out.println("SignIn Data:" + signInDTO);

        if (bindingResult.hasErrors()) {
            System.out.println("SignInDTO has invalid data:" + signInDTO);
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors()); //to shows error for all data
            model.addAttribute("signInDTO", signInDTO); //key can be anything but it should match with jsp file.for retaining the values in page


            return "SignInForm";

        } else {
            boolean dataValid = this.signInService.saveAndValidate(signInDTO);
            if (dataValid)
            {
                System.out.println("SignInService registration successful in SignInController :" + signInDTO);
            }
            else
            {
                System.out.println("SignInService registration not successful in SignInController : " + signInDTO);
            }

            model.addAttribute("msg", "SignIn successful : " + signInDTO.getFirstName());


        }
        return "SignInForm";

    }

}
