package com.xworkz.issuesmanagement.model.repository;

import com.xworkz.issuesmanagement.dto.SignInDTO;

public interface SignInRepo {


    public boolean userDataSave(SignInDTO signInDTO);

}
