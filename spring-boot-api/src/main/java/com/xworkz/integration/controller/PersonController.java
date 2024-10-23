package com.xworkz.integration.controller;


import com.xworkz.integration.dto.PersonDTO;
import com.xworkz.integration.entity.PersonEntity;
import com.xworkz.integration.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;


    @PostMapping("insert-person-data")
    public PersonEntity savePerson(@RequestBody PersonDTO personDTO) {
        return personService.save(personDTO);
        //  return result;
    }


    @GetMapping("getAllPersons")
    public List<PersonEntity> getAllPersons() {
        return personService.getAllEPersons();
    }

    //    @GetMapping("/{id}")
    @GetMapping("/getPersonById")
    public PersonDTO getByPersonID(@RequestParam int id) {
        System.out.println("get data");
        return personService.getById(id);
    }


    @DeleteMapping("/{id}")
    public List<PersonEntity> deleteData(@PathVariable int id) {
      return   personService.deleteByID(id);
    }


    @PutMapping("/updatePerson")
    public PersonEntity updateProduct(@RequestBody PersonEntity personEntity) {
        return personService.updateProduct(personEntity);
    }

}


////to update particular data
////http://localhost:8080/put-update/5
//@PutMapping("/put-update/{id}")
//public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
//    Employee updatedEmployee = employeeService.updateEmployee(id, employee);
//    return updatedEmployee != null ? ResponseEntity.ok(updatedEmployee) : ResponseEntity.notFound().build();
//}

