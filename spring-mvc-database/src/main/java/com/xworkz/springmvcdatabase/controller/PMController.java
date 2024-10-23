package com.xworkz.springmvcdatabase.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.springmvcdatabase.dto.PMDTO;
import com.xworkz.springmvcdatabase.dto.PMSearchDTO;
import com.xworkz.springmvcdatabase.model.service.PMService;
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
public class PMController {

    @Autowired
    private PMService pmService;

    public PMController() {
        System.out.println("Constructor created for PMController..");
    }

    //Save data to database for PM data
    @PostMapping("/pm")
    public String PmForm(@Valid PMDTO pmdto, BindingResult bindingResult, Model model) {
        System.out.println("PM Data:" + pmdto);
        System.out.println("PmForm method FormsController..");
        if (bindingResult.hasErrors()) {
            System.out.println("PMDTO has invalid Data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("pmdto",pmdto);

            return "PMForm";
        } else {

            boolean pmData = this.pmService.pmServiceSave(pmdto);
            if (pmData) {
                System.out.println("PMService data saved successfully in PMController(pmServiceSave),,:" + pmData);
            } else {
                System.out.println("PMService data not saved successfully in PMController(pmServiceSave)..:" + pmData);
            }

            model.addAttribute("msg", "PM Data registration Successful:" + pmdto.getName());
        }

        return "PMResult";
    }

//     bindingResult.getAllErrors()
//             .forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
//                model.addAttribute("errors", bindingResult.getAllErrors());
//                model.addAttribute("dto", scholarshipDTO);
    //PM ..search

    @PostMapping("/pmdatasearch")
    public String getPMData(PMSearchDTO pmSearchDTO, Model model) {
        System.out.println("getPMData method in PMController");
        System.out.println("Pm data:" + pmSearchDTO);

        List<PMDTO> Pmlist = pmService.searchPMDetails(pmSearchDTO);


        if (!Pmlist.isEmpty()) {
            System.out.println("PmDataSearch success in PMController:" + pmSearchDTO);
        } else {
            System.out.println("PmDataSearch not success in PMController:" + pmSearchDTO);
        }

        model.addAttribute("PMName", pmSearchDTO.getName());
        model.addAttribute("listOfPmDetails", Pmlist);

        return "PMSearch";
    }


    //PM data edit
    @GetMapping("/pm-edit")  //by default anchor tag its get(method)
    public String pmDataOnEdit(@RequestParam int id, Model model) {
        System.out.println("Running pmDataOnEdit in PMController");
        PMDTO pmdtoList = pmService.findByIdPm(id);

        if (pmdtoList != null) {
            System.out.println("PM data search success in PM controller:" + pmdtoList);
            model.addAttribute("pmdto", pmdtoList);  //this one match to for PmForm to retain values
        } else {
            System.out.println("PM data search is not success in PMController");
        }

        return "PMForm"; //return main controller form

    }


//PM delete data By id

    @GetMapping("/pm-delete")
    public String pmDataOnDelete(@RequestParam int id, Model model) {
        System.out.println("Running pmDataOnDelete method in PMController..");
        PMDTO pmdto = this.pmService.pmDeleteData(id);
        if (pmdto != null) {
            System.out.println("Pm data deleted successfully: " + pmdto);
            //model.addAttribute("message", "PM data deleted  successfully: " ,+ id +, + pmdto.getName());
            model.addAttribute("message", "PM data deleted successfully: " + id + ", " + pmdto.getName());

            model.addAttribute("pmdto", pmdto);
        } else {
            System.out.println("Pm data not deleted successfully.");
            model.addAttribute("message", "PM data not deleted successfully.");
        }
        return "PMResult";
    }

}





