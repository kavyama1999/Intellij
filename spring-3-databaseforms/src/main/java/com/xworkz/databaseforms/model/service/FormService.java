package com.xworkz.databaseforms.model.service;

import com.xworkz.databaseforms.dto.*;

import java.util.List;

public interface FormService {

//
    public boolean formService(CountryDTO countryDTO);

    //
    List<CountryDTO> formSearchService(CountrySearchDTO countrySearchDTO);


    //Contact......................

    public boolean contactServiceSave(ContactDTO contactDTO);

    List<ContactDTO> contactSearch(ContactSearchDTO contactSearchDTO);


//PM form

    //save
    public boolean pmServiceSave(PMDTO pmdto);

    //search PM name
    List<PMDTO> searchPMDetails(PMSearchDTO pmSearchDTO);


    //contact id
    default  ContactDTO findByIdService(int id)

    {
        return null;
    }


    //country id

    default CountryDTO findById(int id)
    {
        return  null;
    }

    //pm data id

    default PMDTO findByIdPm    (int id)
    {
        return null;
    }




}



//List<EventDTO> searchEvent(SearchDTO searchDTO);
