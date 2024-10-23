package com.xworkz.winter.model.repo;

import com.xworkz.winter.dto.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

@Repository
public class EventImpl implements EventRepo{

@Autowired
    private EntityManagerFactory entityManagerFactory;

    public EventImpl()
    {
        System.out.println("created EventImpl...");
    }

    @Override
    public boolean event(EventDTO eventDTO) {

        System.out.println("Running event method in EventRepoImpl..");

EntityManager manager= entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= manager.getTransaction();

try
{
    entityTransaction.begin();
    manager.persist(eventDTO);
    entityTransaction.commit();

}
catch (PersistenceException persistenceException)
{
    persistenceException.printStackTrace();
    entityTransaction.rollback(); //if any data wring than again enter it rollback old one.
}

finally {
    manager.close(); //emf will close spring
}

return true;
    }
}


