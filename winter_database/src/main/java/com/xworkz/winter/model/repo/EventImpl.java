package com.xworkz.winter.model.repo;

import com.xworkz.winter.dto.EventDTO;
import org.springframework.stereotype.Repository;

@Repository
public class EventImpl implements EventRepo{
    @Override
    public boolean event(EventDTO eventDTO) {
        return true;
    }
}
