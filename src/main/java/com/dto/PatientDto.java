package com.dto;

import java.util.List;

public class PatientDto {

    private Integer id;

    private String name;

    private String lastName;

    private Integer age;

    private List<DoctorDto> doctorDtos;

    private List<TelephoneDto> telephoneDto;

    private List<AddressDto> addressDtos;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<TelephoneDto> getTelephoneDto() {
        return telephoneDto;
    }

    public void setTelephoneDto(List<TelephoneDto> telephoneDto) {
        this.telephoneDto = telephoneDto;
    }

    public List<AddressDto> getAddressDtos() {
        return addressDtos;
    }

    public void setAddressDtos(List<AddressDto> addressDtos) {
        this.addressDtos = addressDtos;
    }


    public List<DoctorDto> getDoctorDtos() {
        return doctorDtos;
    }

    public void setDoctorDtos(List<DoctorDto> doctorDtos) {
        this.doctorDtos = doctorDtos;
    }
}
