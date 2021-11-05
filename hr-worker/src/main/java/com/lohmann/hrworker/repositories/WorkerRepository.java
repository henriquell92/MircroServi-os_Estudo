package com.lohmann.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lohmann.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
