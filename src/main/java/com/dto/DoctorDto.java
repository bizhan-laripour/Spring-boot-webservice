package com.dto;

public class DoctorDto {

    private Integer id;

    private String name;

    private String lastName;


    private AddressDto address;


    private TelephoneDto telephone;


    private ExpertDto expert;

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

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public TelephoneDto getTelephone() {
        return telephone;
    }

    public void setTelephone(TelephoneDto telephone) {
        this.telephone = telephone;
    }

    public ExpertDto getExpert() {
        return expert;
    }

    public void setExpert(ExpertDto expert) {
        this.expert = expert;
    }
}
