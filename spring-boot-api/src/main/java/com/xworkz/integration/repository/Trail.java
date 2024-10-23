//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//Service
//public class EmployeeService {
//
//
//    @Autowired
//    public EmployeeRepository employeeRepository;
//
//    //create employee
//    public Employee createEmployee(Employee employee)//employee object
//    {
//
//        return   employeeRepository.save(employee);
//    }
//
//
//    //insert multiple employee
//    public void saveAllEmployee(List<Employee> emp) {
//        employeeRepository.saveAll(emp);
//    }
//
//    public List<Employee> getAllEmployee() {
//        return employeeRepository.findAll();
//    }
//
//
//    // Get employee by ID
//    public Optional<Employee> getEmployeeById(Integer id) {
//        return employeeRepository.findById(id);
//    }
//
//
////    public Employee putEmployee(Integer id)
////    {
////        return employeeRepository.
////    }
//
//    public Employee updateEmployee(int id, Employee employee) {
//        if (employeeRepository.existsById(id)) {
//            employee.setId(id);
//            return employeeRepository.save(employee);  //save and save All
//        }
//        return null; // Handle this case as needed
//    }
//
//
//    public void deleteEmployee(int id) {
//        employeeRepository.deleteById(id);
//    }
//
//
//
////    public void patch(int id,Employee employee) {
////
////        employeeRepository.save(employee);
////    }
//}
//
//
////    // Update employee by ID
////    public Employee updateEmployee(Integer id, Employee updatedEmployee) {
////        return employeeRepository.findById(id)
////                .map(employee -> {
////                    employee.setName(updatedEmployee.getName());
////                    employee.setDepartment(updatedEmployee.getDepartment());
////                    // Update other fields as necessary
////                    return employeeRepository.save(employee);
////                })
////                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
////    }
//
//







//package com.xworkz.spring_boot_crud_operation.controller;
//
//import com.xworkz.spring_boot_crud_operation.entity.Employee;
//import com.xworkz.spring_boot_crud_operation.model.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController     //it indicates that this class is API
////@RequestMapping("api/employees") //api/employees
//public class EmployeeController {
//
//    @Autowired
//    public EmployeeService employeeService;
//
//    // Create a new employee
//    //http://localhost:8080/insert-data
//
//    @PostMapping("insert-data")
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeService.createEmployee(employee);
//    }
//
//
//    @PostMapping("insert-multiple-data")
//    public void saveAllEmployee(@RequestBody List<Employee> emp)
//    {
//        employeeService.saveAllEmployee(emp);
//    }
//
//    // Get all employees
//    //localhost://8080/getAll/
//    @GetMapping("/getAll")
//    public List<Employee> getAllEmployees() {
//        return employeeService.getAllEmployee();
//    }
//
//
//    //Get particular employee
//    //http://localhost:8080/get-employee/5
//    @GetMapping("get-employee/{id}")
//    public Optional<Employee> getEmployee(@PathVariable int id) {
//
//        return employeeService.getEmployeeById(id);
//    }
//
//
//    //to update particular data
//    //http://localhost:8080/put-update/5
//    @PutMapping("/put-update/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
//        Employee updatedEmployee = employeeService.updateEmployee(id, employee);
//        return updatedEmployee != null ? ResponseEntity.ok(updatedEmployee) : ResponseEntity.notFound().build();
//    }
//
////to delete particular data
//
//    // http://localhost:8080/delete/4    //endpoint
//    @DeleteMapping("delete/{id}")
//    public void deleteEmployee(@PathVariable int id) {
//        employeeService.deleteEmployee(id);
//    }
//
//
//
//    //patch for particular field
//
////    @PatchMapping("path-singleField")
////    public  void patch(@RequestBody  Employee employee)
////    {
////        employeeService.patch(employee);
////    }
//
//}
//
////    http://localhost:8080/insert-data
////    http://localhost:8080/api/getAll
////    http://localhost:8080/get-employee/5
////    http://localhost:8080/put-update/5
////    http://localhost:8080/delete/4
