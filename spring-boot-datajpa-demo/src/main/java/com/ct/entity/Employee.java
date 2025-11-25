package com.ct.entity;

import jakarta.persistence.*;
import lombok.*;

// @Entity tells JPA this class maps to a database table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto Increment ID
    private Long id;

    private String name;
    private String dept;
    private Double salary;
}
