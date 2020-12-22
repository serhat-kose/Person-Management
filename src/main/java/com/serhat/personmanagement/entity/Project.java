package com.serhat.personmanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String projectName;
    private  Integer projectCode;
}
