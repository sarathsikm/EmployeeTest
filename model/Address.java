package com.example.employee.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity
@Table(name="address")
public class Address {

    @Id
    @Column(name="empid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int addressid;

    @NotBlank
    @Column(name="housename")
    String houseName;

    @Column(name="place")
    String place;

    @Column(name="pincode")    
    String pincode;

}
