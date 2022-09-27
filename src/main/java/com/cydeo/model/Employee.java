package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-dd, but localDate accepts mm-dd-yyyy
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate birthDay;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
}
