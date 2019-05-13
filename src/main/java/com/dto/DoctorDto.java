package com.dto;

import java.util.List;

public class DoctorDto {

    private Integer id;

    private String name;

    private String lastName;

    private AddressDto addressDto;


    private TelephoneDto telephoneDto;

    private List<PatientDto> patientDtos;

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

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public TelephoneDto getTelephoneDto() {
        return telephoneDto;
    }

    public void setTelephoneDto(TelephoneDto telephoneDto) {
        this.telephoneDto = telephoneDto;
    }


    public List<PatientDto> getPatientDtos() {
        return patientDtos;
    }

    public void setPatientDtos(List<PatientDto> patientDtos) {
        this.patientDtos = patientDtos;
    }
}
