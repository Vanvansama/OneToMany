package com.oocl.fullstack.repository;


import com.oocl.fullstack.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
