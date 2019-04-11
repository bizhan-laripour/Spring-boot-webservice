package com.dto;

public class DefinitionsRelationDto {

    private Integer id;

    private String title;

    private DefinitionsDto definitionsDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DefinitionsDto getDefinitionsDto() {
        return definitionsDto;
    }

    public void setDefinitionsDto(DefinitionsDto definitionsDto) {
        this.definitionsDto = definitionsDto;
    }
}
