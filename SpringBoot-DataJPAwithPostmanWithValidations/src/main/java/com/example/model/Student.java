package com.example.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "stud_tbl")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	
	@NotNull
	@Size(min = 2, message = " name should have at least 2 characters")
	private String name;
	@Column
	@NotEmpty
	@Size(min = 2, message = "scl name should have at least 2 characters")
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
