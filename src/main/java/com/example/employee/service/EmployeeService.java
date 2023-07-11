package com.example.employee.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.employee.contract.EmployeeDTO;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRrepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final ModelMapper modelMapper = new ModelMapper();

    private final EmployeeRrepository employeeRepository;

    public Employee saveEmployeeDetails(@Valid EmployeeDTO request) {

        Employee employeeDetails = modelMapper.map(request, Employee.class);

        return employeeRepository.save(employeeDetails);
    }
    
}
