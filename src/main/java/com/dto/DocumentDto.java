package com.dto;

import java.util.List;

public class DocumentDto {

    private Integer id;

    private List<DoctorDto> doctorDto;

    private PatientDto patientDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<DoctorDto> getDoctorDto() {
        return doctorDto;
    }

    public void setDoctorDto(List<DoctorDto> doctorDto) {
        this.doctorDto = doctorDto;
    }

    public PatientDto getPatientDto() {
        return patientDto;
    }

    public void setPatientDto(PatientDto patientDto) {
        this.patientDto = patientDto;
    }
}
