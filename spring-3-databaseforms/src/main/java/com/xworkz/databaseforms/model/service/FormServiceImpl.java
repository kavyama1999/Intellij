package com.xworkz.databaseforms.model.service;

import com.xworkz.databaseforms.dto.*;
import com.xworkz.databaseforms.model.repository.FormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FormServiceImpl implements FormService{

    @Autowired
    private FormRepo formRepo;


    public FormServiceImpl()
    {
        System.out.println("Constructor Created for FormServiceImpl.");
    }

    @Override
    public boolean formService(CountryDTO countryDTO)
    {
        System.out.println("Country Data:"+countryDTO);
     boolean data=this.formRepo.form(countryDTO);
        if(data)
        {
            System.out.println("FormRepo is successfully in  FormService:"+countryDTO);
        }

        else
        {
            System.out.println("FormRepo is not successfully in FormService:"+countryDTO);
        }

        return true;
    }

    //country
    @Override
    public List<CountryDTO> formSearchService(CountrySearchDTO countrySearchDTO) {


        System.out.println("formSearchService method running in FormServiceImpl");


     List<CountryDTO> list= this.formRepo.searchRepo(countrySearchDTO);
     if(!list.isEmpty())    //if data is their return list...if not return empty list

     {

         System.out.println("SearchCountry resulted in Dtos:"+countrySearchDTO);
         return  list;
     }

   else
     {
         System.out.println("SearchCountry is empty list in FormServiceImpl:"+countrySearchDTO);
     }

        return Collections.emptyList();
    }

    @Override
    public boolean contactServiceSave(ContactDTO contactDTO) {

        System.out.println("contactService method in FormServiceImpl..........");
      boolean data=this.formRepo.contactData(contactDTO);
      if(data)
      {
          System.out.println("FormRepo succefull in FormServiceImpl..(contact):"+contactDTO);
      }
      else
      {
          System.out.println("FormRepo is not successfull in FormServiceImpl..(contact):"+contactDTO);
      }
        return true;
    }

    //contact search
    @Override
    public List<ContactDTO> contactSearch(ContactSearchDTO contactSearchDTO) {

        System.out.println("contactSearch method in FormServiceImpl...");

       List<ContactDTO> list=this.formRepo.searchContact(contactSearchDTO);
       if(!list.isEmpty())
       {
           System.out.println("Searched resulted contact in searchContact dtos:"+contactSearchDTO);
      return  list;
       }

       else
       {
           System.out.println("Searched resulted contact is empty list in FormServiceImpl:"+contactSearchDTO);
       }
       return Collections.emptyList();
    }

    //PM data save
    @Override
    public boolean pmServiceSave(PMDTO pmdto) {

        System.out.println("pmServiceSave method in FormServiceImpl");

       boolean data=this.formRepo.pmDataSave(pmdto);
       if(data)
       {
           System.out.println("FormRepo successfull in FormServiceImpl in:"+pmdto);
       }

       else
       {
           System.out.println("FormRepo is not successfull in FormServiceImpl:"+pmdto);
       }

        return true;
    }
// PM data search by id
    @Override
    public List<PMDTO> searchPMDetails(PMSearchDTO pmSearchDTO) {
        System.out.println("searchPMDetails method in FormServiceImpl");


      List<PMDTO> data=this.formRepo.searchPMData(pmSearchDTO);
      if(!data.isEmpty())
      {
          System.out.println("Searched resulted PM data in FormServiceImpl :"+pmSearchDTO);
          return  data;
      }

      else
      {
          System.out.println("Searched resulted PM data is not in FormServiceImpl :"+pmSearchDTO);
      }
        return Collections.emptyList();
    }


    //contact edit by id
    @Override
    public ContactDTO findByIdService(int id) {

        System.out.println("running findById method in FormServiceImpl...");
      ContactDTO contactDTOService=this.formRepo.findById(id);
      if(contactDTOService!=null)
      {
          System.out.println("searched result in service");
          return contactDTOService;
      }
      else
      {
          System.out.println("not searched result in service");
      }
        return FormService.super.findByIdService(id);
    }

    //country id

//    get one id to d=from all data

    @Override
    public CountryDTO findById(int id) {
        System.out.println("Running findById method in FormServiceImpl");
     CountryDTO countryDTO=this.formRepo.findbyId(id);

     if(countryDTO!=null)
     {
         System.out.println("country search result in FormServiceImpl");
         return  countryDTO;

     }
     else
     {
         System.out.println("Country search is not in FormServiceImpl");
     }
        return FormService.super.findById(id);
    }


    //pm data edit by id


    @Override
    public PMDTO findByIdPm(int id)
    {
        System.out.println("Running findByIdPm method in FormServiceImpl");
      PMDTO pmdto=this.formRepo.findByIdPM(id);
      if(pmdto!=null)
      {
          System.out.println("PM data search result FormServiceImpl");
          return pmdto;
      }

      else
      {
          System.out.println("PM Data search is not in FormServiceImpl");
      }
        return FormService.super.findByIdPm(id);
    }
}

