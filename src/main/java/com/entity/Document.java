package com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "document")
    private List<Doctor> doctorDto;

    @OneToOne(cascade = CascadeType.ALL)
    private Patient patientDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Doctor> getDoctorDto() {
        return doctorDto;
    }

    public void setDoctorDto(List<Doctor> doctorDto) {
        this.doctorDto = doctorDto;
    }

    public Patient getPatientDto() {
        return patientDto;
    }

    public void setPatientDto(Patient patientDto) {
        this.patientDto = patientDto;
    }
}
