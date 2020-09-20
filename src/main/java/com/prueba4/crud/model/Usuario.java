package com.prueba4.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Usuario {
	@Id
	private int id_Usuario;
	private int id_Rol;
	private String nombre;
	private char activo;
	
	public Usuario() {
	}
	
	public Usuario(int id_Usuario, int id_Rol, String nombre, char activo) {
		super();
		this.id_Usuario = id_Usuario;
		this.id_Rol = id_Rol;
		this.nombre = nombre;
		this.activo = activo;
	}
	
	public int getId_Usuario() {
		return id_Usuario;
	}
	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
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
	public char getActivo() {
		return activo;
	}
	public void setActivo(char activo) {
		this.activo = activo;
	} 
	
	

}
