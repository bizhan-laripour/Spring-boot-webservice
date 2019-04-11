package com.dto;

import java.util.List;

public class DoctorDto {

    private Integer id;

    private String name;

    private String lastName;

    private DefinitionsDto medSchool;

    private List<PatientDto> patients;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DefinitionsDto getMedSchool() {
        return medSchool;
    }

    public void setMedSchool(DefinitionsDto medSchool) {
        this.medSchool = medSchool;
    }

    public List<PatientDto> getPatients() {
        return patients;
    }

    public void setPatients(List<PatientDto> patients) {
        this.patients = patients;
    }
}
