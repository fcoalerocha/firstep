package com.hackademy.firstep.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hackademy.firstep.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>  {

}
