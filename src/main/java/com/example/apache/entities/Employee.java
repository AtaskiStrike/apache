package com.example.apache.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "profile_id")
    @JsonBackReference
    private Profile profile;

//    @Column(name = "RoleName_id")
//    private String RoleName_id;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    @Column(name = "updatedAt")
    private LocalDate updatedAt;


}
