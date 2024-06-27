package com.xworkz.formvalidation.model.repository;

import com.xworkz.formvalidation.dto.JobFormDTO;
import org.springframework.stereotype.Repository;

@Repository
public class JobFormRepositoryImpl implements JobFormRepository {
    @Override
    public boolean jobForm(JobFormDTO jobFormDTO) {
        return true;
    }
}
