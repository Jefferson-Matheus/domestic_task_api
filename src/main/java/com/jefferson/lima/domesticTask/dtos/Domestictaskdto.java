package com.jefferson.lima.domesticTask.dtos;

import com.jefferson.lima.domesticTask.entities.DomesticTask;
import com.jefferson.lima.domesticTask.statusEnum.StatusDomesticTask;

import java.time.LocalDateTime;

public class Domestictaskdto {

    private Long id;

    private String name;

    private String description;

    private LocalDateTime conclusionDate;

    private String responsible;

    private StatusDomesticTask status;

    public Domestictaskdto(){}

    public Domestictaskdto(DomesticTask domesticTask) {
        this.id = domesticTask.getId();
        this.name = domesticTask.getName();
        this.description = domesticTask.getDescription();
        this.conclusionDate = domesticTask.getConclusionDate();
        this.responsible = domesticTask.getResponsible().getName();
        this.status = domesticTask.getStatus();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(LocalDateTime conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public StatusDomesticTask getStatus() {
        return status;
    }

    public void setStatus(StatusDomesticTask status) {
        this.status = status;
    }
}
