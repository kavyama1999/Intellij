package com.xworkz.springmvcdatabase.model.service;

import com.xworkz.springmvcdatabase.dto.CountryDTO;
import com.xworkz.springmvcdatabase.dto.CountrySearchDTO;

import java.util.List;

public interface CountryService {

    //save data
    public boolean countrySaveData(CountryDTO countryDTO);

    //search data
    List<CountryDTO> searchCountryData(CountrySearchDTO countrySearchDTO);

    //edit data

    default CountryDTO findByIdC(int id) //not force to handle
    {
        return null;
    }

    //delete country by id

    public boolean deleteCountryData(int id);

}