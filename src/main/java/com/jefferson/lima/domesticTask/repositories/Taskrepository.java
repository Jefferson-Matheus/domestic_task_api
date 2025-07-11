package com.jefferson.lima.domesticTask.repositories;

import com.jefferson.lima.domesticTask.entities.DomesticTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Taskrepository extends JpaRepository<DomesticTask,Long> {
}
