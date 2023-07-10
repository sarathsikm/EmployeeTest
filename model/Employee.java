package com.example.employee.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity
@Table(name="employee")
public class Employee {
    
    @Id
    @Column(name="empid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int empid;

    @NotBlank
    @Column(name="name")
    String name;

    @Column(name="phone")
    String phone;

    @Past(message = "Birth date must be past date")
    @Column(name="dateOfBirth")
    LocalDate dateOfBirth;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Address employeeAddress;
}
