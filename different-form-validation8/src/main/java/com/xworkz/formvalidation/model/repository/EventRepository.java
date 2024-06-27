package com.xworkz.formvalidation.model.repository;

import com.xworkz.formvalidation.dto.EventDTO;
import org.springframework.stereotype.Repository;


public interface EventRepository {

    public boolean events(EventDTO eventDTO);
}
