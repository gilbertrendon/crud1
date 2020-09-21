package com.prueba4.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prueba4.crud.model.Rol;
import com.prueba4.crud.repo.CrudRepoRol;
import com.prueba4.crud.services.CrudService;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		//En la base de datos se crean los roles con un query de sql
		System.out.println("Inicio prueba");
	}

}
