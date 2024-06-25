package com.xworkz.issuesmanagement.model.service;

import com.xworkz.issuesmanagement.dto.SignInDTO;

import java.time.LocalDateTime;

public interface SignInService {

    public boolean saveAndValidate(SignInDTO signInDTO);


    //set
    public void setAudit(SignInDTO signInDTO, String createdBy, LocalDateTime createdOn,String updatedBy,LocalDateTime updatedOn,boolean isActive);
}
