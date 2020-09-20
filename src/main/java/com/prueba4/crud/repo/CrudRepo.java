package com.prueba4.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba4.crud.model.Usuario;

public interface CrudRepo extends JpaRepository<Usuario, Integer>{

}
