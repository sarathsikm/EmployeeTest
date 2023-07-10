package com.example.employee.contract;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotEmpty(message = "Employee Name cannot be empty")
    private String name;

    private String phone;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "Date of birth cannot be empty")
    @PastOrPresent(message = "Date of birth cannot be a future date")
    private LocalDate dateOfBirth;

    private AddressDTO employeeAddress;
    
}
