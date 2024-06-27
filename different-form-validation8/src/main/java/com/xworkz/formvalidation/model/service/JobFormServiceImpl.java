package com.xworkz.formvalidation.model.service;

import com.xworkz.formvalidation.dto.JobFormDTO;
import com.xworkz.formvalidation.model.repository.JobFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobFormServiceImpl implements  JobFormService{

    @Autowired
    private JobFormRepository jobFormRepository;

    @Override
    public boolean jobRegister(JobFormDTO jobFormDTO) {

      boolean result=  jobFormRepository.jobForm(jobFormDTO);
      if(result)
      {
          System.out.println("Data saved successfully in Service:"+jobFormDTO);
      }

      else
      {
          System.out.println("Data not saved successfully in Service"+jobFormDTO);
      }
        return true;
    }
}
