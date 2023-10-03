package com.hackademy.firstep.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackademy.firstep.model.Usuario;
import com.hackademy.firstep.service.UsuarioService;

@RequestMapping("/user")
@RestController
public class Endpoints {

	@Autowired
	private UsuarioService usuarios;
		
	@GetMapping("/")
	public List<Usuario> all() {
		return usuarios.getAll();
	}
	
	@PostMapping("/")
	public void add(@RequestBody Usuario body) {
		usuarios.add(body);
	}
	
	@GetMapping("/{id}")
	public Usuario getOne(@PathVariable int id) {
		return usuarios.get(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		usuarios.remove(id);
	}

	@PutMapping("/{id}")
	public Usuario delete(@PathVariable int id, @RequestBody Usuario body) {
		return usuarios.set(id, body);
	}
}
