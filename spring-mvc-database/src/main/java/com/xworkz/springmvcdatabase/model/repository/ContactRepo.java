package com.xworkz.springmvcdatabase.model.repository;


import com.xworkz.springmvcdatabase.dto.ContactDTO;
import com.xworkz.springmvcdatabase.dto.ContactSearchDTO;

import java.util.List;

public interface ContactRepo {

    public boolean contactSave(ContactDTO contactDTO);

    //search

    List<ContactDTO> searchContact(ContactSearchDTO contactSearchDTO);

    //contact edit by ..id

    default ContactDTO findById(int id)
    {
        return  null;
    }


    public boolean contactDelete(int id);

    //image uplod
}
