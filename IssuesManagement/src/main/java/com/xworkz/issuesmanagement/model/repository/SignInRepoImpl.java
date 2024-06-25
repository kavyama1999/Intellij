package com.xworkz.issuesmanagement.model.repository;

import com.xworkz.issuesmanagement.dto.SignInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class SignInRepoImpl implements SignInRepo {


    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public SignInRepoImpl() {
        System.out.println(" No param Constructor created for SignInRepoImpl ");
    }


    @Override
    public boolean userDataSave(SignInDTO signInDTO) {

        System.out.println("userDataSave method running in SignInRepoImpl");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
            entityManager.persist(signInDTO);
            entityTransaction.commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        }

        finally {
            entityManager.close();
            System.out.println("Connection closed");
        }
        return true;
    }

}
