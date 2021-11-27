package com.humanrosources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanrosources.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
