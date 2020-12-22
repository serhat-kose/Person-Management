package com.serhat.personmanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String departmentName;
    private  String departmentType;
}
