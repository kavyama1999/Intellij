package com.xworkz.springmvcdatabase.model.repository;

import com.xworkz.springmvcdatabase.dto.CountryDTO;
import com.xworkz.springmvcdatabase.dto.CountrySearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;


@Repository
public class CountryRepoImpl implements CountryRepo {


    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public CountryRepoImpl() {
        System.out.println("Constructor created for CountryRepoImpl ");
    }

    @Override
    public boolean countryDataSave(CountryDTO countryDTO) {

        System.out.println("Form method running in FormRepoImpl......");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();


        try {
            entityTransaction.begin();
//                entityManager.persist(countryDTO);
            entityManager.merge(countryDTO);  //to update and insert

            entityTransaction.commit();

        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();

        } finally {
            entityManager.close();
        }

        //entitymanagerfactory will closed by spring
        return true;
    }

    @Override
    public List<CountryDTO> countrySearch(CountrySearchDTO countrySearchDTO) {

        System.out.println("CountrySearch method ruuning in CountryRepoImpl");

        //EntityMangerFactory will created by spring

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            String query = "SELECT ct FROM CountryDTO ct where ct.countryName=:country";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("country", countrySearchDTO.getCountryName());
            List<CountryDTO> countryDTOS = query1.getResultList();

            entityTransaction.commit();
            return countryDTOS;
        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        } finally {
            System.out.println("Connection closed");

            entityManager.close();

        }


        return Collections.emptyList();
    }


    @Override
    public CountryDTO findById(int id) {

        System.out.println("findById method running in CountryRepoImpl");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            String query = "SELECT ct FROM CountryDTO ct WHERE ct.id=:ctid";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("ctid", id);
            CountryDTO countryDTO = (CountryDTO) query1.getSingleResult();
            entityTransaction.commit();
            return countryDTO;
        } catch (PersistenceException persistenceException) {
            persistenceException.printStackTrace();
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("Connection closed");
        }
        return CountryRepo.super.findById(id);
    }

    //delete country data by id


    @Override
    public boolean countryDeleteById(int id) {

        System.out.println("countryDeleteById method running in CountryRepoImpl");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try
            {
                String query = "DELETE FROM  CountryDTO ct where ct.id=:ctyid ";
                Query query1 = entityManager.createQuery(query);
                query1.setParameter("ctyid", id);
                int data = query1.executeUpdate();
                System.out.println(data);
                entityTransaction.commit();
                return true;

        }

        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            entityTransaction.rollback();

        }

        finally {
            entityManager.close();
            System.out.println("Connection closed..");
        }

        return CountryRepo.super.countryDeleteById(id);
    }
}

