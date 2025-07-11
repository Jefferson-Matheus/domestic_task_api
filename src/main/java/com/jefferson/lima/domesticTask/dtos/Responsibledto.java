package com.jefferson.lima.domesticTask.dtos;

import com.jefferson.lima.domesticTask.entities.Responsible;

public class Responsibledto {
    private Long id;

    private String name;

    public Responsibledto(){}

    public Responsibledto(Responsible responsible) {
        this.id = responsible.getId();
        this.name = responsible.getName();
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
}
