package com.jefferson.lima.domesticTask.entities;

import com.jefferson.lima.domesticTask.statusEnum.StatusDomesticTask;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "TB_TASKS")
public class DomesticTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private LocalDateTime conclusionDate;

    @ManyToOne
    @JoinColumn(name = "RESPONSIBLE_ID")
    private Responsible responsible;

    @Enumerated(EnumType.ORDINAL)
    private StatusDomesticTask status;

    public DomesticTask(){

    }

    public DomesticTask(Long id, String name, String description, LocalDateTime conclusionDate, Responsible responsible) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.conclusionDate = conclusionDate;
        this.responsible = responsible;
        this.status = StatusDomesticTask.TREND;
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

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DomesticTask that = (DomesticTask) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
