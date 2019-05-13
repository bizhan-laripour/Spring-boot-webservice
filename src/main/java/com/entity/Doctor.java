package com.entity;

import javax.persistence.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String lastName;

    private String expert;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    @OneToOne(cascade = CascadeType.ALL)
    private Telephone telephone;




}
