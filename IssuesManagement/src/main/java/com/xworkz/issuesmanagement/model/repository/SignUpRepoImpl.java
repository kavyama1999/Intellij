package com.xworkz.issuesmanagement.model.repository;

import com.xworkz.issuesmanagement.dto.SignUpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class SignUpRepoImpl implements SignUpRepo {


    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public SignUpRepoImpl() {
        System.out.println(" No param Constructor created for SignInRepoImpl ");
    }


    @Override
    public boolean userDataSave(SignUpDTO signUpDTO) {

        System.out.println("userDataSave method running in SignInRepoImpl");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
            entityManager.persist(signUpDTO);
            entityTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        } finally {
            entityManager.close();
            System.out.println("Connection closed");
        }
        return true;
    }

    //password generate automatically
    @Override
    public SignUpDTO findByEmailAndPassword(String email, String password) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
            String query = "SELECT s FROM SignUpDTO s where s.email=:email AND s.password=:password";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("email", email);
            query1.setParameter("password", password);
            SignUpDTO signUpDTO = (SignUpDTO) query1.getSingleResult();
            System.out.println(signUpDTO);
            entityTransaction.commit();
            return signUpDTO;

        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        } finally {
            entityManager.close();
        }
        return null;
    }



}
