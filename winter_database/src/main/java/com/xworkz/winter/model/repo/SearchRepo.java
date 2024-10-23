package com.xworkz.winter.model.repo;

import com.xworkz.winter.dto.EventDTO;
import com.xworkz.winter.dto.SearchDTO;

import java.util.List;

public interface SearchRepo {


//  public   boolean  searchEvent(SearchDTO searchDTO);


   List<EventDTO> searchEvent(SearchDTO searchDTO);

}


//public interface SearchRepo {
//
//    List<CollegeUniformDto> search(SearchDto searchDto);
//}
