package com.jefferson.lima.domesticTask.statusEnum;

public enum StatusDomesticTask {
    TREND(1, "Em andamento"),
    FINISHED(2, "Finalizada"),
    PENDENT(3, "Pendente");

    private int code;
    private String description;

    StatusDomesticTask(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
