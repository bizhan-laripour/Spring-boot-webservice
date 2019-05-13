package com.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String city;

    private String country;

    private String address;

    @ManyToMany(cascade = CascadeType.ALL , mappedBy = "address" , fetch = FetchType.LAZY)
    private List<Patient> patients;



    @OneToOne(mappedBy = "address")
    private Doctor doctor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
