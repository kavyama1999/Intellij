package com.xworkz.winter.model.service;

import com.xworkz.winter.dto.EventDTO;
import com.xworkz.winter.dto.SearchDTO;
import com.xworkz.winter.model.repo.SearchRepo;
import com.xworkz.winter.model.repo.SearchRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService{

//interface..repo

   @Autowired //give me the reference of repo cls to service..inject
   private SearchRepo searchRepo;



    public SearchServiceImpl()
    {
        System.out.println("..created  SearchServiceImpl....");
    }


    @Override
    public List<EventDTO> searchAndValidate(SearchDTO searchDTO) {
        System.out.println("Running searchAndValidate method in SearchServiceImpl");

 List<EventDTO>   list= this.searchRepo.searchEvent(searchDTO);

 if(!list.isEmpty())//if data is their return list...if not return empty list
 {
     System.out.println("Searched resulted in dtos"+searchDTO);
     return  list;
 }

 else
 {
     System.out.println("Searched resulted is empty list in serviceImpl"+searchDTO);
 }
        return Collections.emptyList();
    }
}
