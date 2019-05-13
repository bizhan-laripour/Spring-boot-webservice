package com.dto;

import java.util.List;

public class AddressDto {

    private Integer id;

    private String city;

    private String country;

    private String address;

    private List<PatientDto> patientDtos;



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

    public List<PatientDto> getPatientDtos() {
        return patientDtos;
    }

    public void setPatientDtos(List<PatientDto> patientDtos) {
        this.patientDtos = patientDtos;
    }
}
