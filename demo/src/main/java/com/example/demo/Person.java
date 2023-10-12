package com.example.demo;


import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_user")
    private Long idUser;

    @Column(name = "username")
    private String username;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "email")
    private String email;

    @Column(name = "typeuser")
    private String typeUser;

    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @OneToMany(mappedBy = "person")
    private List<PersonActivity> personActivities;
    // getters and setters
}
