package com.serhat.personmanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "MANAGER")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String managerName;
}
