package com.Spring_Project.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tilte;
	private String disciption;
	private boolean completed;
	

	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private LocalDateTime createdAt;


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTilte() {
		return tilte;
	}


	public void setTilte(String tilte) {
		this.tilte = tilte;
	}


	public String getDisciption() {
		return disciption;
	}


	public void setDisciption(String disciption) {
		this.disciption = disciption;
	}


	public boolean isCompleted() {
		return completed;
	}


	public void setCompleted(boolean completed) {
		this.completed = completed;
	}


	
	
	
}
