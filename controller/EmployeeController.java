package com.example.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.contract.EmployeeDTO;
import com.example.employee.contract.Response;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @SneakyThrows
    @Operation(summary = "Save employee details request")
    @PostMapping(value = {"/save"})
    public ResponseEntity<Response> saveEmployee(@Valid @RequestBody EmployeeDTO request) {
        Employee employeeDetailsResponse = employeeService.saveEmployeeDetails(request);
        return new ResponseEntity<>(
                Response.builder()
                        .payload(String.valueOf(employeeDetailsResponse))
                        .message("Successfully saved")
                        .build(),
                HttpStatus.OK);
    }
    
}
