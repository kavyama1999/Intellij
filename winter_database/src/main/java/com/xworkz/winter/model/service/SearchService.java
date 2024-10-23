package com.xworkz.winter.model.service;

import com.xworkz.winter.dto.EventDTO;
import com.xworkz.winter.dto.SearchDTO;

import java.util.List;

public interface SearchService {


//    public boolean searchAndValidateEvent(SearchDTO searchDTO);
// to get list EventDTO wen can gor for like this

    List<EventDTO>  searchAndValidate(SearchDTO searchDTO);
}




//public interface SearchService {
//
//    List<CollegeUniformDto> searchAndValidate(SearchDto searchDto);
//}
