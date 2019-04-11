package com.dto;

public class PatientDto {

    private Integer id;

    private String name;

    private String lastName;

    private DocumentDto document;

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

    public DocumentDto getDocument() {
        return document;
    }

    public void setDocument(DocumentDto document) {
        this.document = document;
    }
}
