package com.hackademy.firstep.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackademy.firstep.model.Usuario;
import com.hackademy.firstep.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
		
	public List<Usuario> getAll() {
		return (List<Usuario>) repository.findAll();
	}

	public void add(Usuario body) {
		if(body.getName() != "")
			repository.save(body);
	}

	public Usuario get(int id) {
		return repository.findById(id).get();
	}

	public void remove(int id) {
		repository.deleteById(id);
	}

	public Usuario set(int id, Usuario body) {
		Usuario usuario = repository.findById(id).get();
		usuario.setAddres(body.getAddres());
		usuario.setLastName(body.getLastName());
		usuario.setName(body.getName());
		return repository.save(usuario);
	}

}
