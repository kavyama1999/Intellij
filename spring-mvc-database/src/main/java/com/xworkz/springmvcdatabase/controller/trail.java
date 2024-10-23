//package com.xworkz.springmvcdatabase.controller;
//
//import com.xworkz.springmvcdatabase.dto.ContactDTO;
//import com.xworkz.springmvcdatabase.dto.ContactSearchDTO;
//import com.xworkz.springmvcdatabase.model.service.ContactService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.validation.Valid;
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//@Controller
//@RequestMapping("/")
//public class ContactController {
//
//    @Autowired
//    private ContactService contactService;
//
//    public ContactController() {
//        System.out.println("Constructor created for ContactController");
//    }
//
//    @PostMapping("/contact")
//    public String contactForm(@Valid ContactDTO contactDTO, BindingResult bindingResult, Model model,
//                              @RequestParam("file") MultipartFile file) {
//        System.out.println("Contact Data:" + contactDTO);
//        if (bindingResult.hasErrors()) {
//            System.out.println("ContactDTO had invalid data");
//            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
//            model.addAttribute("errors", bindingResult.getAllErrors());
//            return "ContactForm";
//        } else {
//            if (!file.isEmpty()) {
//                try {
//                    String uploadDirectory = "path/to/upload/directory";
//                    String fileName = file.getOriginalFilename();
//                    File destinationFile = new File(uploadDirectory + File.separator + fileName);
//                    file.transferTo(destinationFile);
//                    contactDTO.setFilePath(destinationFile.getAbsolutePath());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    model.addAttribute("msg", "File upload failed");
//                    return "ContactForm";
//                }
//            }
//
//            boolean dataValid = this.contactService.contactSaveService(contactDTO);
//            if (dataValid) {
//                System.out.println("ContactService registration successful in ContactController:" + contactDTO);
//            } else {
//                System.out.println("ContactService registration not successful in ContactController: " + contactDTO);
//            }
//            model.addAttribute("msg", "Contact registration successful : " + contactDTO.getName());
//        }
//
//        return "ContactResult";
//    }
//
//    // other methods...
//}
