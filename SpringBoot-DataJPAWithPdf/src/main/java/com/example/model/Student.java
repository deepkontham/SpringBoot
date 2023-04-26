package com.example.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String scl;

	public Student() {
		super();
	}

	public Student(int id, String name, String scl) {
		super();
		this.id = id;
		this.name = name;
		this.scl = scl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScl() {
		return scl;
	}

	public void setScl(String scl) {
		this.scl = scl;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scl=" + scl + "]";
	}

}
