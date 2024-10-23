package com.xworkz.scholarshipretain.beans;


import com.xworkz.scholarshipretain.dto.ScholarshipDTO;

@Component
@RequestMapping("/")
@EnableWebMvc
    public class ScholarShipFormBean {

        public ScholarShipFormBean() {
            System.out.println("ScholarShipFormBean............");
        }


        @PostMapping("/apply")


        public String scholar(@Valid ScholarshipDTO scholarshipDTO, BindingResult bindingResult, Model model) {
            if(bindingResult.hasErrors()) {
                System.err.println("Dto has invalid data");
                bindingResult.getAllErrors()
                        .forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
                model.addAttribute("errors", bindingResult.getAllErrors());
                model.addAttribute("dto", scholarshipDTO);
                return "ScholarshipApplicationForm";
            } else {
                model.addAttribute("studentName", "Application SuccessFull..!:" + scholarshipDTO.getStudentName());
            }
            System.out.println("Running scholar method");
            return "Result";
        }



    }
