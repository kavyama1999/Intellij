package com.xworkz.formvalidation.model.service;

import com.xworkz.formvalidation.dto.EventDTO;
import com.xworkz.formvalidation.model.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ///parent componet
public class EventServiceImpl implements EventService{
    @Autowired

    private EventRepository eventRepository;
    @Override
    public boolean eventRegister(EventDTO eventDTO)
    {
    boolean data= eventRepository.events(eventDTO);
    if(data)
    {
        System.out.println("Data saved successfully in service:"+eventDTO);
    }
    else
    {
        System.out.println("Data not saved successfully in service:"+eventDTO);
    }
        return true;
    }
}
