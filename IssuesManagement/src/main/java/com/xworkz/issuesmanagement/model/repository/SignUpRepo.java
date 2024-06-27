package com.xworkz.issuesmanagement.model.repository;

import com.xworkz.issuesmanagement.dto.SignUpDTO;

public interface SignUpRepo {


    public boolean userDataSave(SignUpDTO signUpDTO);


    //to generate password
  public SignUpDTO findByEmailAndPassword(String email, String password);


}
