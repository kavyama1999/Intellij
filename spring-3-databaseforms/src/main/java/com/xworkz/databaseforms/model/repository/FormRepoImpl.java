package com.xworkz.databaseforms.model.repository;

import com.xworkz.databaseforms.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class FormRepoImpl  implements FormRepo{

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public FormRepoImpl()
    {
        System.out.println("Constructor created for FormRepoImpl ");
    }

    //country


    @Override
    public boolean form(CountryDTO countryDTO) {

        System.out.println("Form method running in FormRepoImpl......");
      EntityManager entityManager=  entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction= entityManager.getTransaction();


       try
       {
           entityTransaction.begin();
           //entityManager.persist(countryDTO);
           entityManager.merge(countryDTO);  //to update and insert

           entityTransaction.commit();

       }

       catch (PersistenceException persistenceException)
       {
           persistenceException.printStackTrace();
           entityTransaction.rollback();

       }

       finally {
           entityManager.close();
       }

       //entitymanagerfactory will closed by spring
        return true;
    }

    //country search
    @Override
    public List<CountryDTO> searchRepo(CountrySearchDTO countrySearchDTO) {


        System.out.println("searchRepo method running in FormRepoImpl..(searchCountry). ");

        //persist it will create by spring

        EntityManager entityManager=   entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        entityTransaction.begin();

        try {
            String query="select ct from CountryDTO ct where ct.countryName=:country";
          Query query1= entityManager.createQuery(query);
          query1.setParameter("country",countrySearchDTO.getCountryName());

          List<CountryDTO>   resultList=query1.getResultList();
          entityTransaction.commit();
          return resultList;

        }

        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        }

        finally
        {
            entityManager.close();
        }
        return Collections.emptyList();
    }


    //contact
    @Override
    public boolean contactData(ContactDTO contactDTO) {


        System.out.println("ContacData method in FormRepoImpl....");

       EntityManager entityManager= entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction=  entityManager.getTransaction();

     try
     {
         entityTransaction.begin();
//         entityManager.persist(contactDTO);
         entityManager.merge(contactDTO);

         entityTransaction.commit();
     }

     catch (PersistenceException persistenceException)
     {
         persistenceException.printStackTrace();
         entityTransaction.rollback();
     }
     finally {
         System.out.println("connection closed");
         entityManager.close();
     }
        return true;
    }

    //Contact search
    @Override
    public List<ContactDTO> searchContact(ContactSearchDTO contactSearchDTO) {

        System.out.println("searchContact method in FormRepoImpl");

        //        //persist it will create by spring
EntityManager entityManager= this.entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= entityManager.getTransaction();
       entityTransaction.begin();

       try

       {
           String query="SELECT ct from ContactDTO ct where ct.name=:cName";

Query query1=  entityManager.createQuery(query);
query1.setParameter("cName",contactSearchDTO.getName());


List<ContactDTO>  resultList=query1.getResultList();
entityTransaction.commit();
return  resultList;

       }

       catch (PersistenceException persistenceException)
       {
           persistenceException.printStackTrace();
           entityTransaction.rollback();
       }

       finally {
           System.out.println("connection closed");
           entityManager.close();

       }

        return Collections.emptyList();
    }

    //PM data Save
    @Override
    public boolean pmDataSave(PMDTO pmdto) {


        System.out.println("pmDataSave method in FormRepoImpl");

      EntityManager entityManager= entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction= entityManager.getTransaction();


     try
     {
         entityTransaction.begin();
//         entityManager.persist(pmdto);
         entityManager.merge(pmdto);

         entityTransaction.commit();
     }

     catch (PersistenceException persistenceException)
     {
         persistenceException.printStackTrace();
         entityTransaction.rollback();
     }

     finally {
         System.out.println("Connection closed for FormRepoImpl..");
         entityManager.close();
     }
        return true;
    }

    //pm search
    @Override
    public List<PMDTO> searchPMData(PMSearchDTO pmSearchDTO) {
        System.out.println("searchPMData method in FormRepoImpl");

      EntityManager entityManager=  entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=  entityManager.getTransaction();
    entityTransaction.begin();


    try
    {
        String query="select pm from PMDTO pm where pm.name=:pmName";
       Query query1= entityManager.createQuery(query);
       query1.setParameter("pmName",pmSearchDTO.getName());
      List<PMDTO> resultList= query1.getResultList();
      entityTransaction.commit();

      return  resultList;
    }
    catch (PersistenceException persistenceException)
    {
        persistenceException.printStackTrace();
        entityTransaction.rollback();
    }

    finally {
        System.out.println("Connection closed");
        entityManager.close();
    }
        return Collections.emptyList();
    }

    //contact id

    @Override
    public ContactDTO findById(int id) {
        System.out.println("running findById method in FormRepoImpl");
     EntityManager entityManager=   entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction= entityManager.getTransaction();
    entityTransaction.begin();

    try
    {
        String  query="select dto from ContactDTO dto where dto.id=:cid";
      Query query1=  entityManager.createQuery(query);
      query1.setParameter("cid",id);
     ContactDTO contactDTO= (ContactDTO) query1.getSingleResult();
     entityTransaction.commit();
     return   contactDTO;
    }
    catch (PersistenceException persistenceException)
    {
        persistenceException.printStackTrace();
        entityTransaction.rollback();
    }

    finally {
        System.out.println("Connection closed");
        entityManager.close();
    }
        return FormRepo.super.findById(id);
    }


    //country edit


    @Override
    public CountryDTO findbyId(int id) {

        System.out.println("Running findByMethod in FormRepoImpl..");
      EntityManager entityManager= entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction= entityManager.getTransaction();
     entityTransaction.begin();

     try
     {
         String query="select ct from CountryDTO ct where ct.id=:ctid";  //dynamic
      Query query1= entityManager.createQuery(query);
      query1.setParameter("ctid",id);
    CountryDTO countryDTO= (CountryDTO) query1.getSingleResult();
    entityTransaction.commit();
    return countryDTO;
     }

     catch (PersistenceException persistenceException)
     {
         persistenceException.printStackTrace();
         entityTransaction.rollback();
     }

     finally {
         System.out.println("Connection closed");
         entityManager.close();

     }
        return FormRepo.super.findbyId(id);
    }

    //pm data edit


    @Override
    public PMDTO findByIdPM(int id) {
        System.out.println("Running findByIdPM method in FormRepoImpl");

      EntityManager entityManager=  entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction= entityManager.getTransaction();
     entityTransaction.begin();

     try
     {
         String query="select pm from PMDTO pm where pm.id=:pmid";
        Query query1= entityManager.createQuery(query);
        query1.setParameter("pmid",id);
     PMDTO pmdto= (PMDTO)query1.getSingleResult();
    entityTransaction.commit();
    return  pmdto;
     }
     catch (PersistenceException persistenceException)
     {
         persistenceException.printStackTrace();
         entityTransaction.rollback();
     }


     finally {
         System.out.println("Connection closed");
         entityManager.close();
     }
        return FormRepo.super.findByIdPM(id);
    }
}


