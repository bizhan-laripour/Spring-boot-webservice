package com.entity;

import javax.persistence.*;

@Entity
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tell;

    private Integer telephoneType;

    @ManyToOne
    @JoinColumn(name = "doctorTel" , referencedColumnName = "id")
    private Doctor doctorTel;

    @ManyToOne
    @JoinColumn(name = "patientTel" , referencedColumnName = "id")
    private Patient patientTel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Integer getTelephoneType() {
        return telephoneType;
    }

    public void setTelephoneType(Integer telephoneType) {
        this.telephoneType = telephoneType;
    }

    public Doctor getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(Doctor doctorTel) {
        this.doctorTel = doctorTel;
    }

    public Patient getPatientTel() {
        return patientTel;
    }

    public void setPatientTel(Patient patientTel) {
        this.patientTel = patientTel;
    }
}
