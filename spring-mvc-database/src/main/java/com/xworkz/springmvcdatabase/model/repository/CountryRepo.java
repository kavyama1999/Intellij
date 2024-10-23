package com.xworkz.springmvcdatabase.model.repository;

import com.xworkz.springmvcdatabase.dto.CountryDTO;
import com.xworkz.springmvcdatabase.dto.CountrySearchDTO;

import java.util.List;

public interface CountryRepo {

    //abstract method..save
    public boolean countryDataSave(CountryDTO countryDTO);

    //search
    List<CountryDTO> countrySearch(CountrySearchDTO countrySearchDTO);

    //by using id edit..

    default CountryDTO findById(int id) {
        return null;
    }


    //country data delete by id

    default boolean countryDeleteById(int id)
    {
        return true;
    }



}
