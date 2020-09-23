package com.prueba4.crud.controller;
import java.util.ArrayList;
//import org.springframework.web.bind.anotation.RestController;
//@RestController
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba4.crud.model.Usuario;
import com.prueba4.crud.services.CrudService;
@RestController
public class CrudResController {
	@Autowired	
	private CrudService service;
	
	
	@GetMapping("/getusuariolist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Usuario> fetchUsuarioList(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		//logica para la lista de la base de datos
		//service.fetchUsuarioList();
	
		
		usuarios = service.fetchUsuarioList();
	
		return usuarios;
		}
	
	@PostMapping("/addusuario")
	@CrossOrigin(origins = "http://localhost:4200")
	public Usuario saveUsuario(@RequestBody Usuario user){
		//System.out.println("Esto es lo que devuelve save:");
		//System.out.println(user.getNombre());
		String nombre="";
		boolean yaExiste = false;
		try {
			List<Usuario> usuarios = new ArrayList<Usuario>();
			//logica para la lista de la base de datos
			//service.fetchUsuarioList();
			usuarios = service.fetchUsuarioList();
			for(int i=0;i<usuarios.toArray().length;i++) {
				nombre = usuarios.get(i).getNombre();
				System.out.println(nombre+user.getNombre());
					if(nombre.equals(user.getNombre())) {
						System.out.println("ya existe");
						yaExiste = true;
						return user;
					}	
			}
		
		}catch(Exception e) {
			
			return user;
		}
		if(!yaExiste) {
			return service.saveUsuarioToDB(user);
		}else {
			return user;
		}
		}
		
	@GetMapping("/getusuariobyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Usuario fetchUsuarioById(@PathVariable int id){
		//System.out.println("Esto es lo que devuelve get por id");
		//System.out.println(service.fetchUsuarioById(id).get().getNombre());
		return service.fetchUsuarioById(id).get();
		}	
	
	@DeleteMapping("/deleteusuariobyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteUsuariobyid(@PathVariable int id){
		return service.deleteUsuarioById(id);
		}
	
	@PostMapping("/updateusuario")
	@CrossOrigin(origins = "http://localhost:4200")
	public String updateUsuario(@RequestBody Usuario user){
		return service.updateUsuario(user);
		}
	
	
	
	
	

}
