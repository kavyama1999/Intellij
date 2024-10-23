package com.xworkz.springmvcdatabase.model.service;

import com.xworkz.springmvcdatabase.dto.CountryDTO;
import com.xworkz.springmvcdatabase.dto.CountrySearchDTO;
import com.xworkz.springmvcdatabase.model.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepo countryRepo;

    public CountryServiceImpl() {
        System.out.println("Constructor created for CountryServiceImpl");
    }

    @Override
    public boolean countrySaveData(CountryDTO countryDTO) {

        System.out.println("countrySaveData method in CountryServiceImpl..");

        boolean data = this.countryRepo.countryDataSave(countryDTO);
        if (data) {
            System.out.println("CountryRepo successful in CountryServiceImpl:" + countryDTO);
        } else {
            System.out.println("CountryRepo not successful CountryServiceImpl:" + countryDTO);
        }

        return true;
    }


    @Override
    public List<CountryDTO> searchCountryData(CountrySearchDTO countrySearchDTO) {

        System.out.println("searchCountryData method running CountryServiceImpl");
        List<CountryDTO> data = this.countryRepo.countrySearch(countrySearchDTO);
        if (!data.isEmpty()) {
            System.out.println("Search Country Resulted data in Dtos:" + countrySearchDTO); //not empty
            return data;
        } else {
            System.out.println("SearchCountry is empty list in FormServiceImp"); //if empty
        }
        return Collections.emptyList();
    }

    //edit

    @Override
    public CountryDTO findByIdC(int id) {
        System.out.println("findByIdC method running CountryServiceImpl");
        CountryDTO countryDTO = this.countryRepo.findById(id);
        if (countryDTO != null) {
            System.out.println("searched result in CountryServiceImpl");
            return countryDTO;
        } else {
            System.out.println("Searched result not in CountryServiceImpl");

            return CountryService.super.findByIdC(id);
        }

    }


    //delete ..country data by id
    @Override
    public boolean deleteCountryData(int id) {

        boolean data = this.countryRepo.countryDeleteById(id);
        if (data) {
            System.out.println("country data delete successfully:" + data);
        } else {
            System.out.println("Country data not delete successfully:" + data);

        }
        return data;
    }
}
