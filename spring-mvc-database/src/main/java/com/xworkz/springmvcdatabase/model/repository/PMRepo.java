package com.xworkz.springmvcdatabase.model.repository;

import com.xworkz.springmvcdatabase.dto.PMDTO;
import com.xworkz.springmvcdatabase.dto.PMSearchDTO;

import java.util.List;

public interface PMRepo {


    //PmForm

    public boolean pmDataSave(PMDTO pmdto);

    //PM search
    List<PMDTO> searchPMData(PMSearchDTO pmSearchDTO);

    //pm edit data

    //  default method
    default PMDTO findByIdPM(int id)
    {
        return null;
    }

    //delete for PM data


    default  PMDTO deleteById(int id)
    {
        return  null;
    }
}
