package com.serhat.personmanagement.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String personName;
    private String personSurname;

}
