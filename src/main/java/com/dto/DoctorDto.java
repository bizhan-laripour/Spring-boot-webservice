package com.dto;

public class DoctorDto {

    private Integer id;

    private String name;

    private String lastName;

    private Long medicineCode;

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

    public Long getMedicineCode() {
        return medicineCode;
    }

    public void setMedicineCode(Long medicineCode) {
        this.medicineCode = medicineCode;
    }
}
