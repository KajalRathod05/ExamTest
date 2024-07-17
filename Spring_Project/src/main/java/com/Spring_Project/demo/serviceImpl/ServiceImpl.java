package com.Spring_Project.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring_Project.demo.model.Task;
import com.Spring_Project.demo.repository.TaskRepository;
import com.Spring_Project.demo.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	TaskRepository tr;

	@Override
	public void addTask(Task ts) {

		tr.save(ts);
	}
	
}
