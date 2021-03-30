package com.thymeleaf.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private int id;

    private String firstName;

    private String lastName;

    private String email;
}
