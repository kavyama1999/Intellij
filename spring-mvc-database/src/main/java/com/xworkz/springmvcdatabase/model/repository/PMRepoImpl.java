package com.xworkz.springmvcdatabase.model.repository;


import com.xworkz.springmvcdatabase.dto.PMDTO;
import com.xworkz.springmvcdatabase.dto.PMSearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class PMRepoImpl implements PMRepo {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public PMRepoImpl() {
        System.out.println("Constructor created for PMRepoImpl");
    }

    //save PM data
    @Override
    public boolean pmDataSave(PMDTO pmdto) {

        System.out.println("pmDataSave method in FormRepoImpl");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();


        try {
            entityTransaction.begin();
//         entityManager.persist(pmdto);
            entityManager.merge(pmdto);

            entityTransaction.commit();
        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        } finally {
            System.out.println("Connection closed for FormRepoImpl..");
            entityManager.close();
        }
        return true;
    }


    //PM search
    @Override
    public List<PMDTO> searchPMData(PMSearchDTO pmSearchDTO) {

        System.out.println("searchPMData method in FormRepoImpl");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();


        try {
            String query = "select pm from PMDTO pm where pm.name=:pmName";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("pmName", pmSearchDTO.getName());
            List<PMDTO> resultList = query1.getResultList();
            entityTransaction.commit();

            return resultList;
        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        } finally {
            System.out.println("Connection closed");
            entityManager.close();
        }

        return Collections.emptyList();
    }

    //PM edit data by using id
    @Override
    public PMDTO findByIdPM(int id) {
        System.out.println("Running findByIdPM method in FormRepoImpl");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            String query = "select pm from PMDTO pm where pm.id=:pmid";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("pmid", id);
            PMDTO pmdto = (PMDTO) query1.getSingleResult();
            entityTransaction.commit();
            return pmdto;
        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        } finally {
            System.out.println("Connection closed");
            entityManager.close();
        }
        return PMRepo.super.findByIdPM(id);
    }


//PM data delete by id
@Override
public PMDTO deleteById(int id) {
    System.out.println("deleteById method running in PMRepoImpl");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    PMDTO pmdto = null;
    try {
        pmdto = entityManager.find(PMDTO.class, id); // Find the entity and assign it to pmdto
        if (pmdto != null) {
            entityManager.remove(pmdto); // Remove the entity
            entityTransaction.commit();
        } else {
            System.out.println("Entity not found with id: " + id);
            entityTransaction.rollback();
        }
    } catch (PersistenceException persistenceException) {
        persistenceException.printStackTrace();
        entityTransaction.rollback();
    } finally {
        entityManager.close();
        System.out.println("Connection closed");
    }
    return pmdto; // Return the deleted entity or null
}


}