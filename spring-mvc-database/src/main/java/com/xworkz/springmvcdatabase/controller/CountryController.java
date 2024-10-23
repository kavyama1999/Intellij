package com.xworkz.springmvcdatabase.controller;

import com.xworkz.springmvcdatabase.dto.CountryDTO;
import com.xworkz.springmvcdatabase.dto.CountrySearchDTO;
import com.xworkz.springmvcdatabase.model.service.CountryService;
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
@RequestMapping
public class CountryController {

    @Autowired    //to give response of a
    private CountryService countryService;

    public CountryController() {
        System.out.println("Constructor created for CountryController.....");
    }

    //country
    @PostMapping("/country")
    public String countryForm(@Valid CountryDTO countryDTO, BindingResult bindingResult, Model model) {
        System.out.println("Country Data:" + countryDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("CountryDTO has invalid data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("countryDTO",countryDTO);


            return "CountryForm";

        } else {
            boolean dataValidate = this.countryService.countrySaveData(countryDTO);
            if (dataValidate) {
                System.out.println("CountryService registration successful in CountryController:.." + countryDTO);
            } else {
                System.out.println("CountryService registration not successful in CountryController:...." + countryDTO);
            }

            model.addAttribute("msg", "Country data application successfull:" + countryDTO.getCountryName());
        }

        //key this is used for retaining the values in server side page
        // model.addAttribute("dto",countryDTO);
        return "CountryResult";
        //return CountryForm ..response in same page
    }


    //search country
    @PostMapping("/CountrySearched")
    public String countrySearchDetails(@Valid CountrySearchDTO countrySearchDTO, Model model) {
        System.out.println("Country Data:" + countrySearchDTO);
        System.out.println("..countrySearchDetails method running CountryController..(countrySearch).");

        List<CountryDTO> list = this.countryService.searchCountryData(countrySearchDTO);

        if (!list.isEmpty()) {
            System.out.println("countrySearchDetails method succcess in CountryController..:" + countrySearchDTO);
        } else {
            System.out.println("countrySearchDetails method not success:" + countrySearchDTO);
        }

        model.addAttribute("CountryName", countrySearchDTO.getCountryName());

        //        //to display list of CountryDTO

//        model.addAttribute("listOfCountries", list);
        model.addAttribute("listOfCountries", list);

        return "CountrySearch";

    }


//country edit

    //to edit..using particular  id .for country form
    @GetMapping("/country-edit")
    public String onEditCountry(@RequestParam int id, Model model) {
        System.out.println("Running on edit in Country controller");
        CountryDTO countryDTO = this.countryService.findByIdC(id);
        if (countryDTO != null) {
            System.out.println("country search success in CountryController:" + countryDTO);
            model.addAttribute("countryDTO", countryDTO);//retaining the values //pass the reference of
        } else {
            System.out.println("country search is not success in CountryController");
        }

        return "CountryForm"; //return main controller page
    }

    //delete country data by id

    @GetMapping("/country-delete")

    public String deleteCountryData(@RequestParam int id, Model model) {
        System.out.println("deleteCountryData method running in CountryController..");
        boolean deleteCountryData = this.countryService.deleteCountryData(id);
        if (deleteCountryData) {
            System.out.println("Country data deleted successfully:" + deleteCountryData);
//            model.addAttribute("message", "  Country data with  " + id + " deleted successfully: "+deleteCountryData); //it delete with show true
                        model.addAttribute("message", "  Country data with  " + id + " deleted successfully: ");
//            model.addAttribute("message", "Contact with id " + id + " successfully deleted:"+deletedContactDto);

        } else {
            System.out.println("Country data not deleted successfully:" + deleteCountryData);
           // model.addAttribute("message", "Country data with id " + id + "deleted successfully");

        }

        return "CountryResult";


    }
}