package com.Spring_Project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring_Project.demo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{

	
}
