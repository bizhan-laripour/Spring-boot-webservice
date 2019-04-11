package com.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Patient patient;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "doctors_id")
//    private List<Doctor> doctors;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "illnessId")
    private List<Definitions> illnesses;

    @OneToOne(cascade = CascadeType.ALL)
    private Definitions city;

    @OneToOne(cascade = CascadeType.ALL)
    private Definitions address;

    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    private Definitions gender;

    private Date LastVisit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
//
//    public List<Doctor> getDoctors() {
//        return doctors;
//    }
//
//    public void setDoctors(List<Doctor> doctors) {
//        this.doctors = doctors;
//    }

    public List<Definitions> getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(List<Definitions> illnesses) {
        this.illnesses = illnesses;
    }

    public Definitions getCity() {
        return city;
    }

    public void setCity(Definitions city) {
        this.city = city;
    }

    public Definitions getAddress() {
        return address;
    }

    public void setAddress(Definitions address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Definitions getGender() {
        return gender;
    }

    public void setGender(Definitions gender) {
        this.gender = gender;
    }

    public Date getLastVisit() {
        return LastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        LastVisit = lastVisit;
    }
}
