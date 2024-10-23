package com.xworkz.databaseforms.model.repository;

import com.xworkz.databaseforms.dto.*;

import java.util.List;

public interface FormRepo {


//Country............
    public  boolean form(CountryDTO countryDTO);


    List<CountryDTO>  searchRepo(CountrySearchDTO countrySearchDTO);

    //Contact..........

    public boolean contactData(ContactDTO contactDTO);

    List<ContactDTO> searchContact(ContactSearchDTO contactSearchDTO);

//PmForm

    public boolean pmDataSave(PMDTO pmdto);

    List<PMDTO> searchPMData(PMSearchDTO pmSearchDTO);

//contact edit by ..id
    default ContactDTO findById(int id)
    {
        return  null;
    }

    //country id

    default CountryDTO findbyId(int id)
    {
        return  null;
    }


//pm edit data

//    default method
   default PMDTO findByIdPM(int id)
   {
       return null;
   }
}



//List<EventDTO> searchEvent(SearchDTO searchDTO);
