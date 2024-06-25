package com.xworkz.issuesmanagement.model.service;


import com.xworkz.issuesmanagement.dto.SignInDTO;
import com.xworkz.issuesmanagement.model.repository.SignInRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private SignInRepo signInRepo;


    public SignInServiceImpl() {
        System.out.println("No param Constructor in SignInServiceImpl");
    }


    @Override
    public boolean saveAndValidate(SignInDTO signInDTO) {

        System.out.println("saveAndValidate method running in SignInServiceImpl");
        System.out.println("SetAudit value setting.............");


        String createdBy = "Kavya"; //or get the current user
        LocalDateTime createdOn = LocalDateTime.now();

        String updatedBy = "NA"; //or het the current user
        LocalDateTime updatedOn = null;

        boolean isActive = true;

        setAudit(signInDTO, createdBy, createdOn, updatedBy, updatedOn, isActive);

        boolean data = this.signInRepo.userDataSave(signInDTO);
        if (data) {
            System.out.println("SignInRepo successful in SignInServiceImpl:" + signInDTO);
            return data;
        } else {
            System.out.println("SignInRepo not successful in SignInServiceImpl :" + signInDTO);
        }


        return true;
    }

    @Override
    public void setAudit(SignInDTO signInDTO, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn, boolean isActive) {
        System.out.println("setAudit method running in SignInServiceImpl..");
        signInDTO.setCreatedBy(createdBy);
        signInDTO.setCreatedOn(createdOn);
        signInDTO.setUpdatedBy(updatedBy);
        signInDTO.setUpdatedOn(updatedOn);
        signInDTO.setActive(isActive);

    }
}
