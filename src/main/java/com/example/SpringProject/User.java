package com.example.SpringProject;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "Users")
//@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String job;
}
