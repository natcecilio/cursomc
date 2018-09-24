package com.tatafly.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatafly.cursomc.domain.Cliente;
import com.tatafly.cursomc.repositories.ClienteRepository;
import com.tatafly.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) { 
		Optional<Cliente> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(  
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));  
		} 

}
