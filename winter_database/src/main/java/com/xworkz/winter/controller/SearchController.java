package com.xworkz.winter.controller;


import com.xworkz.winter.dto.EventDTO;
import com.xworkz.winter.dto.SearchDTO;
import com.xworkz.winter.model.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller

@RequestMapping
public class SearchController {

    @Autowired//to inject
    private SearchService searchService;


    public SearchController()
    {
        System.out.println("..Created SearchController...");
    }



    @PostMapping("/searched")

    public String eventDetails(@Valid SearchDTO searchDTO, Model model)
    {
        System.out.println("Data:"+searchDTO);
        System.out.println("...eventDetails method running in SearchController..");
    List<EventDTO> list= this.searchService.searchAndValidate(searchDTO);

    if(!list.isEmpty())
    {
        System.out.println("eventDetails in controller success"+searchDTO);
    }

    else
    {
        System.out.println("eventDetails in controller not success"+searchDTO);
    }


        model.addAttribute("EventName",searchDTO.getEvent());
      //to display list of eventDto
       model.addAttribute("listOfEvents",list);
        return "Search";
    }
}
