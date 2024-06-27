package com.xworkz.formvalidation.model.repository;

import com.xworkz.formvalidation.dto.EventDTO;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class EventRepositoryImpl implements EventRepository{
    @Override
    public boolean events(EventDTO eventDTO)
    {
        return true;
    }
}
