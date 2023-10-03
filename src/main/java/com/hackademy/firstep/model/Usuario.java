package com.hackademy.firstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String lastName;
	private String addres;
	
	Usuario(){
	}
	
	public Usuario(String name, String lastName, String addres) {
		this.name = name;
		this.lastName = lastName;
		this.addres = addres;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddres() {
		return addres;
	}
	
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", lastName=" + lastName + ", addres=" + addres + "]";
	}
	
}
