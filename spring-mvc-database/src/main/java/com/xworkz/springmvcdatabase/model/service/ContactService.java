package com.xworkz.springmvcdatabase.model.service;

import com.xworkz.springmvcdatabase.dto.ContactDTO;
import com.xworkz.springmvcdatabase.dto.ContactSearchDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {


    public  boolean contactSaveService(ContactDTO contactDTO);


    //search contact

    List<ContactDTO> contactSearch(ContactSearchDTO contactSearchDTO);

    //contact edit by id
    default  ContactDTO findByIdService(int id)

    {
        return null;
    }

    //delete contact by id

    public  boolean deleteContactById(int id);

    //image upload
}
