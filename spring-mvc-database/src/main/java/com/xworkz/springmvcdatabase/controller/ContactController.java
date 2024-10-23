package com.xworkz.springmvcdatabase.controller;


import com.xworkz.springmvcdatabase.dto.ContactDTO;
import com.xworkz.springmvcdatabase.dto.ContactSearchDTO;
import com.xworkz.springmvcdatabase.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class ContactController {

    @Autowired
    private ContactService contactService;

    public ContactController() {
        System.out.println("Constructor created for ContactController");

    }

    @PostMapping("/contact")

    public String countryForm(@Valid ContactDTO contactDTO, BindingResult bindingResult, Model model) {
        System.out.println("Contact Data:" + contactDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("ContactDTO had invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("contactDTO",contactDTO);//this retaining values form form page

            return "ContactForm";
        } else {

            boolean dataValid = this.contactService.contactSaveService(contactDTO);
            if (dataValid) {
                System.out.println("ContactService registration successful in ContactController:"+contactDTO);
            } else {
                System.out.println("ContactService registration not successful in ContactController: "+contactDTO);
            }
            model.addAttribute("msg", "Contact registration successful : "  +  contactDTO.getName());

        }


        return "ContactResult";


    }

    //search contact data


    @PostMapping("/contactSearch")
    public String searchedContactDetails(ContactSearchDTO contactSearchDTO, Model model) {
        System.out.println("Contact Data:" + contactSearchDTO);
        System.out.println("searchedContactDetails method in FormsController..");

        List<ContactDTO> list = contactService.contactSearch(contactSearchDTO);
        if (!list.isEmpty()) {
            System.out.println("ContactSearch success in FormsController:" + contactSearchDTO);
        } else {
            System.out.println("ContactSearch is not success in FormsController:" + contactSearchDTO);
        }
        model.addAttribute("ContactName", contactSearchDTO.getName());
        model.addAttribute("listOfContactNames",list);
        return "ContactSearch";
    }


    //to edit...particular id. for contact form

    @GetMapping("/contact-edit")
    public String onEdit(@RequestParam int id, Model model)   //("id_no") we can
    {
        System.out.println("Running on edit in Contact Controller");
        ContactDTO contactDTO= contactService.findByIdService(id);
        if(contactDTO!=null)
        {
            System.out.println("search in controller success:"+contactDTO);
            model.addAttribute("contactDTO",contactDTO);
        }
        else
        {
            System.out.println("search in controller not success");
        }
        return "ContactForm"; //return main controller page

    }

//delete Contact data by using Id
@GetMapping("/contact-delete")
public String onDeletePMData(@RequestParam int id,Model model)
{
    System.out.println("onDeletePMData method running in ContactController..");
   boolean deletedContactDto= this.contactService.deleteContactById(id);
   if(deletedContactDto)
   {
       System.out.println("Contact Data successfully deleted:"+deletedContactDto);
       model.addAttribute("message", "Contact with id " + id + " successfully deleted:");
       model.addAttribute("contactDTO",deletedContactDto);

//       model.addAttribute("message", String.format("Contact with id %s successfully deleted", id));

   }
   else
   {
       System.out.println("Contact data not successfully deleted:"+deletedContactDto);
       model.addAttribute("message","Contact with id not deleted" + id + "success");
   }
    return "ContactResult"; //Response page
}




}


