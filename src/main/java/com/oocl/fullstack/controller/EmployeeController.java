package com.oocl.fullstack.controller;


import com.oocl.fullstack.model.Employee;
import com.oocl.fullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/jpa_employees/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
        return employeeRepository.getOne(employeeId);
    }

    @PostMapping("/jpa_employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }


}
