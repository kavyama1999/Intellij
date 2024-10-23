package com.xworkz.trailgithub.beans;

import com.xworkz.trailgithub.dto.ScholarshipDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class TrailGithubBean {


    public TrailGithubBean() {
            System.out.println("TrailGithubBean............");
        }


        @PostMapping("/apply")
        public String scholar(ScholarshipDTO scholarshipDTO, Model model) {
            System.out.println("DTo has invalid data");
            System.out.println("Data:"+scholarshipDTO);
            model.addAttribute("studentName", "Application SuccessFull..!:" + scholarshipDTO.getStudentName());
            return "Result";


        }

}





