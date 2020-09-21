package com.prueba4.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Rol {
	@Id
	private int id_Rol;
	private String nombre;
	
	public Rol() {
	}
	
	public Rol(int id_Rol, String nombre) {
		super();
		this.id_Rol = id_Rol;
		this.nombre = nombre;
	}

	public int getId_Rol() {
		return id_Rol;
	}

	public void setId_Rol(int id_Rol) {
		this.id_Rol = id_Rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	


}
