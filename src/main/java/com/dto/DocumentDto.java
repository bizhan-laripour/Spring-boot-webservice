package com.dto;


import java.sql.Date;
import java.util.List;

public class DocumentDto {

    private Integer id;

    private PatientDto patient;

    private List<DoctorDto> doctors;

    private List<DefinitionsDto> illnesses;

    private DefinitionsDto city;

    private DefinitionsDto address;

    private Integer age;

    private DefinitionsDto gender;

    private Date LastVisit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public List<DoctorDto> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<DoctorDto> doctors) {
        this.doctors = doctors;
    }

    public List<DefinitionsDto> getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(List<DefinitionsDto> illnesses) {
        this.illnesses = illnesses;
    }

    public DefinitionsDto getCity() {
        return city;
    }

    public void setCity(DefinitionsDto city) {
        this.city = city;
    }

    public DefinitionsDto getAddress() {
        return address;
    }

    public void setAddress(DefinitionsDto address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DefinitionsDto getGender() {
        return gender;
    }

    public void setGender(DefinitionsDto gender) {
        this.gender = gender;
    }

    public Date getLastVisit() {
        return LastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        LastVisit = lastVisit;
    }
}
