package com.prueba4.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba4.crud.model.Rol;
import com.prueba4.crud.model.Usuario;
import com.prueba4.crud.repo.CrudRepo;
import com.prueba4.crud.repo.CrudRepoRol;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	
	public List<Usuario> fetchUsuarioList() {
		// TODO Auto-generated method stub
		return repo.findAll();

	}
	
	public Usuario saveUsuarioToDB(Usuario user) {
	
			return repo.save(user);			
	}
	
	public Optional<Usuario> fetchUsuarioById(int id) {
		return repo.findById(id);
	}
	
	public String deleteUsuarioById(int id) {
		String result;
		try {
			repo.deleteById(id);
			result = "User succesfully deleted";
		}catch(Exception e) {
			result = "User with this id isn´t deleted";
		}
		return result;
	}
	
	public String updateUsuario(Usuario user) {
		String resultado;
		try {
			//Se debe borrar el usuario yo volverlo a meter
			//Porque de lo contrario puede pasar que 
			//Me meta nuevos usuarios cuando usuarios con un id determinado 
			//no están registrados
			repo.deleteById(user.getId_Usuario());
			repo.save(user);
			
			resultado = "User updated";
		}catch(Exception e) {
			resultado = "The user isn´t updated";
		}
		return resultado;
	}
	
	
	
	
}
