package com.xworkz.springmvcdatabase.model.repository;


import com.xworkz.springmvcdatabase.dto.ContactDTO;
import com.xworkz.springmvcdatabase.dto.ContactSearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class ContactRepoImpl implements ContactRepo {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    public ContactRepoImpl() {
        System.out.println("Constructor created for ContactRepoImpl");
    }

    @Override
    public boolean contactSave(ContactDTO contactDTO) {

        System.out.println("ContactSave method running ContactRepoImpl");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
//        entityManager.persist(contactDTO);
            entityManager.merge(contactDTO);

            entityTransaction.commit();

        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        } finally {

            System.out.println("Connection closed");
            entityManager.close();
        }

        return true;
    }

    @Override
    public List<ContactDTO> searchContact(ContactSearchDTO contactSearchDTO) {

        System.out.println("searchContact method running in ContactRepoImpl");

        System.out.println("searchContact method in FormRepoImpl");

        //persist it will create by spring

        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            String query = "SELECT ct from ContactDTO ct where ct.name=:cName";

            Query query1 = entityManager.createQuery(query);
            query1.setParameter("cName", contactSearchDTO.getName());


            List<ContactDTO> resultList = query1.getResultList();
            entityTransaction.commit();
            return resultList;

        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        } finally {
            System.out.println("connection closed");
            entityManager.close();

        }

        return Collections.emptyList();
    }


    //contact edit by id

    @Override
    public ContactDTO findById(int id) {
        System.out.println("running findById method in FormRepoImpl");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            String query = "select dto from ContactDTO dto where dto.id=:cid";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("cid", id);
            ContactDTO contactDTO = (ContactDTO) query1.getSingleResult();
            entityTransaction.commit();
            return contactDTO;

        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        }
        finally {
            System.out.println("Connection closed");
            entityManager.close();
        }
        return ContactRepo.super.findById(id);
    }

    //contact delete by id
    @Override
    public boolean contactDelete(int id) {

        System.out.println("contactDelete method running ContactRepoImpl..");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            String query = "DELETE FROM ContactDTO dto where dto.id=:ctid";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("ctid", id);
            int data = query1.executeUpdate();
            System.out.println(data);
            entityTransaction.commit();
//            return  data>0;
            return true;
        }
        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        }

        finally {
            entityManager.close();
            System.out.println("Connection closed");
        }
        return false;
    }

}
