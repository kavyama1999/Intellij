package com.xworkz.winter.model.repo;

import com.xworkz.winter.dto.EventDTO;
import com.xworkz.winter.dto.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;


@Repository
public class SearchRepoImpl implements SearchRepo {

    @Autowired //ti created instance or object

    private EntityManagerFactory entityManagerFactory;
    
    public SearchRepoImpl()
    {
        System.out.println("....created SearchRepoImpl....");
    }

    @Override
    public List<EventDTO> searchEvent(SearchDTO searchDTO) {

        System.out.println("Running searchEvent method in SearchRepoImpl ");

        //persist it will create by spring
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();


        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

//        List<EventDTO> resultList = null;
        try {
            String query = "select et from EventDTO et where et.event=:eventName";

            Query query1 = entityManager.createQuery(query);
            query1.setParameter("eventName", searchDTO.getEvent());

           List<EventDTO> resultList = query1.getResultList();
            entityTransaction.commit();
            return resultList;

        } catch (PersistenceException persistenceException) //parent or persistenceexception
        {
            persistenceException.printStackTrace();
            entityTransaction.rollback();    //if any data wring than again enter it rollback old one.

        } finally {
            entityManager.close();
        }


        //return resultList;
        return  Collections.emptyList();
    }


//    @Override
//    public boolean searchEvent(SearchDTO searchDTO) {
//        return false;
//    }



}







