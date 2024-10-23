package com.xworkz.springmvcdatabase.model.service;

import com.xworkz.springmvcdatabase.dto.PMDTO;
import com.xworkz.springmvcdatabase.dto.PMSearchDTO;
import com.xworkz.springmvcdatabase.model.repository.PMRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PMServiceImpl implements PMService {

    @Autowired
    private PMRepo pmRepo;

    public PMServiceImpl()
    {
        System.out.println("Constructor  created for PMServiceImpl..");
    }

    //save data to database
    @Override
    public boolean pmServiceSave(PMDTO pmdto) {

        System.out.println("pmServiceSave method in PMServiceImpl");

        boolean data=this.pmRepo.pmDataSave(pmdto);
        if(data)
        {
            System.out.println("PMRepo successful in PMServiceImpl in:"+pmdto);
        }

        else
        {
            System.out.println("PMRepo is not successful in PMServiceImpl:"+pmdto);
        }

        return true;
    }

    //Search PM data
    @Override
    public List<PMDTO> searchPMDetails(PMSearchDTO pmSearchDTO) {

        System.out.println("searchPMDetails method in PMServiceImpl");


        List<PMDTO> data=this.pmRepo.searchPMData(pmSearchDTO);
        if(!data.isEmpty())
        {
            System.out.println("Searched resulted PM data in PMServiceImpl :"+pmSearchDTO);
            return  data;
        }

        else
        {
            System.out.println("Searched resulted PM data is not in PMServiceImpl :"+pmSearchDTO);
        }

        return Collections.emptyList();
    }

    //edit PM data by using id

    @Override
    public PMDTO findByIdPm(int id)
    {
        System.out.println("Running findByIdPm method in PMServiceImpl");
        PMDTO pmdto=this.pmRepo.findByIdPM(id);
        if(pmdto!=null)
        {
            System.out.println("PM data search result PMServiceImpl");
            return pmdto;
        }

        else
        {
            System.out.println("PM Data search is not in FormServiceImpl");
        }
        return PMService.super.findByIdPm(id);
    }


    //PM delete data by id



    @Override
    public PMDTO pmDeleteData(int id) {
        System.out.println("pmDeleteData method running in PMServiceImpl");
        PMDTO pmdto = this.pmRepo.deleteById(id);
        if (pmdto != null) {
            System.out.println("Pm data deleted successfully");
        } else {
            System.out.println("PM data not deleted successfully.");
        }
        return pmdto;
    }

}


