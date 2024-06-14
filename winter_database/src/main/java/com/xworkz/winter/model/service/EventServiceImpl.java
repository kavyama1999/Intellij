package com.xworkz.winter.model.service;

import com.xworkz.winter.dto.EventDTO;
import com.xworkz.winter.model.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    public EventServiceImpl()
    {
        System.out.println("Created EventServiceImpl");
    }

@Autowired
    private EventRepo eventRepo;

    @Override
    public boolean function(EventDTO eventDTO) {

        System.out.println("data:"+eventDTO);
        boolean data=this.eventRepo.event(eventDTO);
        if(data)
        {
            System.out.println("EventRepo is successful in EventService"+eventDTO);
        }

        else
        {
            System.out.println("EventRepo is successful in EventService"+eventDTO);
        }
        return true;

    }
}
