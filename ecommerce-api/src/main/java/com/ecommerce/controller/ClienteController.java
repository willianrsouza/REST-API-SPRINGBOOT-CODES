package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cliente;
import com.ecommerce.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping
	@ResponseStatus()
	public List<Cliente> listarClientes() {
      return clienteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus()
	    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
		
		
	}
}
