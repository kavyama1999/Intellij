package com.xworkz.springmvcdatabase.model.service;

import com.xworkz.springmvcdatabase.dto.ContactDTO;
import com.xworkz.springmvcdatabase.dto.PMDTO;
import com.xworkz.springmvcdatabase.dto.PMSearchDTO;

import java.util.List;

public interface PMService {

    //save
    public boolean pmServiceSave(PMDTO pmdto);

    //search PM name
    List<PMDTO> searchPMDetails(PMSearchDTO pmSearchDTO);


    //pm data id

    default PMDTO findByIdPm(int id)
    {
        return null;
    }

    //PM data delete by Id

    default PMDTO pmDeleteData(int id)
    {
        return  null;
    }



}
