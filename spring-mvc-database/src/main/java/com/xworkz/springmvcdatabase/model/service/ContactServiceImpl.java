package com.xworkz.springmvcdatabase.model.service;

import com.xworkz.springmvcdatabase.dto.ContactDTO;
import com.xworkz.springmvcdatabase.dto.ContactSearchDTO;
import com.xworkz.springmvcdatabase.model.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{


    @Autowired
    private ContactRepo contactRepo;

    public ContactServiceImpl()
    {
        System.out.println("Constructor created for ContactServiceImpl");
    }

    @Override
    public boolean contactSaveService(ContactDTO contactDTO) {

        System.out.println("ContactService method running in ContactServiceImpl");
     boolean data=this.contactRepo.contactSave(contactDTO);
     if(data)
     {
         System.out.println("ContactRepo  successful in ContactServiceImpl:"+contactDTO);
     return  data;
     }

     else
     {
         System.out.println("ContactRepo not successful in ContactServiceImpl:"+contactDTO);
     }
        return true;
    }

    @Override
    public List<ContactDTO> contactSearch(ContactSearchDTO contactSearchDTO) {
        System.out.println("contactSearch method running in ContactServiceImpl");
        List<ContactDTO> list=this.contactRepo.searchContact(contactSearchDTO);
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

    //contact edit by id
    @Override
    public ContactDTO findByIdService(int id) {

        System.out.println("running findById method in FormServiceImpl...");
        ContactDTO contactDTOService=this.contactRepo.findById(id);
        if(contactDTOService!=null)
        {
            System.out.println("searched result in service");
            return contactDTOService;
        }
        else
        {
            System.out.println("not searched result in service");
        }
        return ContactService.super.findByIdService(id);
    }



    //contact delete by id
    @Override
    public boolean deleteContactById(int id) {
        System.out.println("deleteContactById method running in ContactServiceImpl..");

      boolean deleted=  this.contactRepo.contactDelete(id);
      if(deleted)
      {
          System.out.println("Contact data deleted successfully");
      }
      else {
          System.out.println("Contact data not deleted successfully ");
      }
        return deleted;
    }
}
