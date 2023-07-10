package com.example.employee.contract;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AddressDTO {

    @NotEmpty(message = "HouseName Name cannot be empty")
    private String houseName;

    private String place;

    private String pincode;
}
