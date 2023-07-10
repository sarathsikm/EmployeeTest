package com.example.employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Employee;

@Repository
public interface EmployeeRrepository extends JpaRepository<Employee, Integer>{
    
} 
    
