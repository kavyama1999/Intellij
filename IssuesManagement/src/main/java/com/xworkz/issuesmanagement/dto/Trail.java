////package com.xworkz.springmvcdatabase.controller;
////
////
////import com.xworkz.springmvcdatabase.dto.ContactDTO;
////import com.xworkz.springmvcdatabase.dto.ContactSearchDTO;
////import com.xworkz.springmvcdatabase.model.service.ContactService;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Controller;
////import org.springframework.ui.Model;
////import org.springframework.validation.BindingResult;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestParam;
////
////import javax.validation.Valid;
////import java.util.List;
////
////@Controller
////@RequestMapping("/")
////public class ContactController {
////
////    @Autowired
////    private ContactService contactService;
////
////    public ContactController() {
////        System.out.println("Constructor created for ContactController");
////
////    }
////
////    @PostMapping("/contact")
////
////    public String countryForm(@Valid ContactDTO contactDTO, BindingResult bindingResult, Model model) {
////        System.out.println("Contact Data:" + contactDTO);
////        if (bindingResult.hasErrors()) {
////            System.out.println("ContactDTO had invalid data");
////            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
////            model.addAttribute("errors", bindingResult.getAllErrors());
////            model.addAttribute("contactDTO",contactDTO);//this retaining values form form page
////
////            return "ContactForm";
////        } else {
////
////            boolean dataValid = this.contactService.contactSaveService(contactDTO);
////            if (dataValid) {
////                System.out.println("ContactService registration successful in ContactController:"+contactDTO);
////            } else {
////                System.out.println("ContactService registration not successful in ContactController: "+contactDTO);
////            }
////            model.addAttribute("msg", "Contact registration successful : "  +  contactDTO.getName());
////
////        }
////
////
////        return "ContactResult";
////
////
////    }
////
////    //search contact data
////
////
////    @PostMapping("/contactSearch")
////    public String searchedContactDetails(ContactSearchDTO contactSearchDTO, Model model) {
////        System.out.println("Contact Data:" + contactSearchDTO);
////        System.out.println("searchedContactDetails method in FormsController..");
////
////        List<ContactDTO> list = contactService.contactSearch(contactSearchDTO);
////        if (!list.isEmpty()) {
////            System.out.println("ContactSearch success in FormsController:" + contactSearchDTO);
////        } else {
////            System.out.println("ContactSearch is not success in FormsController:" + contactSearchDTO);
////        }
////        model.addAttribute("ContactName", contactSearchDTO.getName());
////        model.addAttribute("listOfContactNames",list);
////        return "ContactSearch";
////    }
////
////
////    //to edit...particular id. for contact form
////
////    @GetMapping("/contact-edit")
////    public String onEdit(@RequestParam int id, Model model)   //("id_no") we can
////    {
////        System.out.println("Running on edit in Contact Controller");
////        ContactDTO contactDTO= contactService.findByIdService(id);
////        if(contactDTO!=null)
////        {
////            System.out.println("search in controller success:"+contactDTO);
////            model.addAttribute("contactDTO",contactDTO);
////        }
////        else
////        {
////            System.out.println("search in controller not success");
////        }
////        return "ContactForm"; //return main controller page
////
////    }
////
////    //delete Contact data by using Id
////    @GetMapping("/contact-delete")
////    public String onDeletePMData(@RequestParam int id,Model model)
////    {
////        System.out.println("onDeletePMData method running in ContactController..");
////        boolean deletedContactDto= this.contactService.deleteContactById(id);
////        if(deletedContactDto)
////        {
////            System.out.println("Contact Data successfully deleted:"+deletedContactDto);
////            model.addAttribute("message", "Contact with id " + id + " successfully deleted:");
////            model.addAttribute("contactDTO",deletedContactDto);
////
//////       model.addAttribute("message", String.format("Contact with id %s successfully deleted", id));
////
////        }
////        else
////        {
////            System.out.println("Contact data not successfully deleted:"+deletedContactDto);
////            model.addAttribute("message","Contact with id not deleted" + id + "success");
////        }
////        return "ContactResult"; //Response page
////    }
////
////
////
////
////}
////
//
//
//package com.xworkz.springmvcdatabase.dto;
//
//import org.hibernate.validator.constraints.NotEmpty;
//
//import javax.persistence.*;
//import javax.validation.constraints.*;
//
//
//@Entity
//@Table(name = "contact_data")
//public class ContactDTO {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;  //to avoid dataType error we can change datatype as Non-primitive
//
////for string we can use @NotEmpty
//
////    create table contact_data(id int  primary key auto_increment,contact_name varchar(50),email varchar(50),mobile bigint,comments varchar(500));
//
//    @NotEmpty(message = "Name cannot be empty")
//    @Size(min = 2, max = 30, message = "Name should contain only alphabetic letters")
//    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Name should contain only alphabetic letters")
//    @Column(name = "contact_name")
//    private String name;
//
//    @NotEmpty(message = "Email cannot be empty")
//    @Pattern(regexp = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Enter valid email")
//    private String email;
//
//
//    @NotNull(message = "Please enter mobile number")
//    @Min(1000000000)
////@Min(1)
//    @Max(9999999999L)
//    private Long mobile;
//
//    @NotEmpty(message = "Please provide comments")
//    @Size(min = 2, max = 300, message = "Comments should contain between 2 and 300 characters")
//    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Comments should contain only alphabetic letters and spaces")
//    private String comments;
//
//    //@NotEmpty(message = "Please confirm")
//    @Transient //its not identify by the table
//    private String confirm;

//
