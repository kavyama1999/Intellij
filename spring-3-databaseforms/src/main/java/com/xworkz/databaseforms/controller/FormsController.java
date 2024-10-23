package com.xworkz.databaseforms.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.databaseforms.dto.*;
import com.xworkz.databaseforms.model.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.io.PrintStream;
import java.util.List;

@Controller
////@Component
@RequestMapping
public class FormsController {


    @Autowired
    private FormService formService;


    public FormsController() {
        System.out.println("Constructor created for FormsController.....");
    }

//country
    @PostMapping("/country")
    public String countryForm(@Valid CountryDTO countryDTO, BindingResult bindingResult, Model model) {
        System.out.println("Country Data:" + countryDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("CountryDTO has invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());

            return "CountryForm";

        } else
        {
            boolean dataValidate = this.formService.formService(countryDTO);
            if (dataValidate)
            {
                System.out.println("FormService registration successfull in FormsController:.." + countryDTO);
            } else
            {
                System.out.println("FormService registration not successfull in FormsController:...." + countryDTO);
            }

            model.addAttribute("msg", "Country data application successfull:" + countryDTO.getCountryName());
        }
//here only save data
        //key this is used for retaining the values in server side page
        // model.addAttribute("dto",countryDTO);
        return "CountryResult";
    }


    @PostMapping("/CountrySearched")
    public String countrySearchDetails(@Valid CountrySearchDTO countrySearchDTO, Model model) {
        System.out.println("Country Data:" + countrySearchDTO);
        System.out.println("..countrySearchDetails method running FormsController..(countrySearch).");

        List<CountryDTO> list = this.formService.formSearchService(countrySearchDTO);

        if (!list.isEmpty()) {
            System.out.println("countrySearchDetails method succcess in FormsController..:" + countrySearchDTO);
        } else {
            System.out.println("countrySearchDetails method not success:" + countrySearchDTO);
        }

        model.addAttribute("CountryName", countrySearchDTO.getCountryName());

        //        //to display list of CountryDTO

        model.addAttribute("listOfCountries", list);

        return "CountrySearch";

    }


//----------------Contact

    @PostMapping("/contact")
    public String contactForm(@Valid ContactDTO contactDTO, BindingResult bindingResult, Model model) {
        System.out.println("Contact Data:" + contactDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("ContactDTO has invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());

            return "ContactForm";

        } else {

            boolean dataSave = this.formService.contactServiceSave(contactDTO);
            if (dataSave) {
                System.out.println("formService data saved successfully in FormsController..:" + contactDTO);
            } else {
                System.out.println("formService data is not saved successfully in FormsController..:"+contactDTO);
            }
            model.addAttribute("msg", "Contact data application successfully Regusterd:" + contactDTO.getName());


        }

        // model.addAttribute("dto",countryDTO);
        return "ContactResult";


    }

//Contact Search

    @PostMapping("/contactSearch")
    public String searchedContactDetails(ContactSearchDTO contactSearchDTO, Model model) {
        System.out.println("Contact Data:" + contactSearchDTO);
        System.out.println("searchedContactDetails method in FormsController..");

        List<ContactDTO> list = formService.contactSearch(contactSearchDTO);
        if (!list.isEmpty()) {
            System.out.println("ContactSearch success in FormsController:" + contactSearchDTO);
        } else {
            System.out.println("ContactSearch is not success in FormsController:" + contactSearchDTO);
        }
        model.addAttribute("ContactName", contactSearchDTO.getName());
        model.addAttribute("listOfContactNames",list);
        return "ContactSearch";
    }


    //PMForm
@PostMapping("/pm")
    public String PmForm( @Valid PMDTO pmdto,BindingResult bindingResult,Model model)
    {
        System.out.println("PM Data:"+pmdto);
        System.out.println("PmForm method FormsController..");
        if(bindingResult.hasErrors())
        {
            System.out.println("PMDTO has invalid Data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
       model.addAttribute("errors",bindingResult.getAllErrors());
       return "PMForm";
        }

        else
        {

        boolean pmData=this.formService.pmServiceSave(pmdto);
        if(pmData)
        {
            System.out.println("FormService data saved successfully in FormService(pmServiceSave),,:"+pmData);
        }
        else
        {
            System.out.println("FormService dsta not saved successfully in FormService(pmServiceSave)..:"+pmData);
        }

        model.addAttribute("msg","PM Data registration Successfull:"+pmdto.getName());

        }

        return "PMResult";
    }

    //PM ..search

    @PostMapping("/pmdatasearch")
   public  String getPMData(PMSearchDTO pmSearchDTO ,Model model)
   {
       System.out.println("getPMData method in FormsController");
       System.out.println("Pm data:"+pmSearchDTO);

List<PMDTO> Pmlist=formService.searchPMDetails(pmSearchDTO);


       if(!Pmlist.isEmpty())
       {
           System.out.println("PmDataSearch success in FormsController:"+pmSearchDTO);
       }
       else
       {
           System.out.println("PmDataSearch not success in FormsController:"+pmSearchDTO);
       }

       model.addAttribute("PMName",pmSearchDTO.getName());
       model.addAttribute("listOfPmDetails",Pmlist);
       return "PMSearch";
   }




   //to edit...particular id. for contact form

    @GetMapping("/contact-edit")
    public String onEdit(@RequestParam int id,Model model)   //("id_no") we can
    {
        System.out.println("Running on edit in Contact Controller");
       ContactDTO contactDTO= formService.findByIdService(id);
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


    //to edit..using particular  id .for country form
    @GetMapping("/country-edit")
    public String onEditCountry(@RequestParam int id,Model model)
    {
        System.out.println("Running on edit in Country controller");
     CountryDTO countryDTO=this.formService.findById(id);
     if(countryDTO!=null)
     {
         System.out.println("country search success in CountryController:"+countryDTO);
         model.addAttribute("countryDTO",countryDTO);//retaining the values //pass the reference of
     }
     else
     {
         System.out.println("country search is not success in CountryController");
     }

        return  "CountryForm"; //return main controller page
    }



    //PM data edit
    @GetMapping("/pm-edit")  //by default anchor tag its get
    public String pmDataOnEdit(@RequestParam int id,Model model)
    {
        System.out.println("Running pmDataOnEdit in FormController");
       PMDTO pmdtoList= formService.findByIdPm(id);

       if (pmdtoList!=null)
       {
           System.out.println("PM data search success in PM controller:"+pmdtoList);
           model.addAttribute("pmdto",pmdtoList);  //this one match to for PmForm to retain values
       }
       else
       {
           System.out.println("PM data search is not success in PMController");
       }

        return "PMForm"; //return main controller form
    }


//delete PM data by id

@GetMapping("/pm-delete")
    public String deletePMData(@RequestParam int id,Model model)
    {
        System.out.println("deletePMData method running in FormsController");

        return "PMResult";
    }



}




