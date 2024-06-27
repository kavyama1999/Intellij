package com.xworkz.issuesmanagement.model.service;

import com.xworkz.issuesmanagement.dto.SignUpDTO;
import com.xworkz.issuesmanagement.model.repository.SignUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpRepo signUpRepo;

    @Autowired
    private JavaMailSender mailSender;


    //pasword locking
    private Map<String, Integer> failedAttemptsMap = new HashMap<>();
    private Map<String, SignUpDTO> users = new HashMap<>(); // Simulated database

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int PASSWORD_LENGTH = 10;
    private static final SecureRandom RANDOM = new SecureRandom();

    public SignUpServiceImpl() {
        System.out.println("No param Constructor in SignInServiceImpl");
    }

    @Override
    public boolean saveAndValidate(SignUpDTO signUpDTO) {
        System.out.println("saveAndValidate method running in SignInServiceImpl");
        System.out.println("SetAudit value setting.............");

        // Generate automatic password
        String generatedPassword = generateRandomPassword();
        signUpDTO.setPassword(generatedPassword);

        // Set audit fields
        String createdBy = "Kavya"; // or get the current user
        LocalDateTime createdOn = LocalDateTime.now();

        String updatedBy = "NA"; // or get the current user
        LocalDateTime updatedOn = null;

        boolean isActive = true;

        setAudit(signUpDTO, createdBy, createdOn, updatedBy, updatedOn, isActive);

        boolean data = this.signUpRepo.userDataSave(signUpDTO);
        if (data) {
            System.out.println("SignInRepo successful in SignInServiceImpl:" + signUpDTO);
            return data;
        } else {
            System.out.println("SignInRepo not successful in SignInServiceImpl :" + signUpDTO);
        }
        users.put(signUpDTO.getEmail(), signUpDTO); // Simulate saving to a database //password locking
        return true;
    }


    @Override
    public void setAudit(SignUpDTO signUpDTO, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn, boolean isActive) {
        System.out.println("setAudit method running in SignInServiceImpl..");
        signUpDTO.setCreatedBy(createdBy);
        signUpDTO.setCreatedOn(createdOn);
        signUpDTO.setUpdatedBy(updatedBy);
        signUpDTO.setUpdatedOn(updatedOn);
        signUpDTO.setActive(isActive);
    }


    @Override
    public String generateRandomPassword() {
        StringBuilder sb = new StringBuilder(PASSWORD_LENGTH);
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }


    @Override
    public SignUpDTO findByEmailAndPassword(String email, String password) {
        SignUpDTO user = users.get(email);
        if (user != null && !user.isAccountLocked() && user.getPassword().equals(password)) {
            return user;
        }
        return signUpRepo.findByEmailAndPassword(email, password);
    }


    //to send password to email

    @Override
    public void sendPasswordEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);
        message.setFrom("kmsrcb@gmail.com");

        mailSender.send(message);

    }

    @Override
    public void incrementFailedAttempts(String email) {


        int attempts = failedAttemptsMap.getOrDefault(email, 0) + 1;
        failedAttemptsMap.put(email, attempts);
        if (attempts >= 3) {
            lockAccount(email);
        }
    }

    @Override
    public int getFailedAttempts(String email) {
        return failedAttemptsMap.getOrDefault(email, 0);  // ajax with xml http request
    }


    @Override
    public void resetFailedAttempts(String email) {

        failedAttemptsMap.remove(email);


    }

    @Override
    public void lockAccount(String email) {

        SignUpDTO user = users.get(email);
        if (user != null) {
            user.setAccountLocked(true);
        }

    }
}




