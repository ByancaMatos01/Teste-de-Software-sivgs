package com.fatec.sigvs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.sigvs.model.Cliente;

@RestController // responsável por ouvir a porta 8080
//atende as requsições http

//500 erro de servidor 
//404 erros de não achar serviço 
// 200 OK é a resposta de status de sucesso que indica que a requisição foi bem sucedida.

public class controller {
	@GetMapping("/alo-mundo")
	public String alomundo() {
		return "Alo mundo!!";
	}

	@GetMapping("/clientes") // entrar em localhost porta 8080/ clientes
	public Cliente getCliente() {
		Cliente umCliente = new Cliente(1, "Jose", "AV aguia de haia");
		return umCliente;

	}

	@GetMapping("/clientes_all")
	public List<Cliente> getAll() {
		List<Cliente> lista = new ArrayList<>();
		lista.add(new Cliente(1, "Jose", "AV Águia de Haia"));
		lista.add(new Cliente(2, "Silva", "AV Paulista"));
		lista.add(new Cliente(3, "Maria", "AV Martins Fontes"));

		return lista;
	}

	@GetMapping("/clientes/{id}")
	public Cliente getClientePorId(@PathVariable("id") int id) {
		return new Cliente(id, "Souza", "AV. Martins Fontes");
	}

	@PostMapping("/clientes") // espera os dados do cliente
	public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
		List<Cliente> lista = new ArrayList<>();
		lista.add(new Cliente(1, cliente.getNome(), cliente.getEndereço()));
		return lista.get(0);
	}

	@PutMapping("/clientes/{id}") // atualiza atraves só campo que mudou
	public Cliente atualizar (@RequestBody Cliente cliente, @PathVariable ("id") int id) {
		
		 Cliente clienteAtualizado = new Cliente (id, cliente.getNome(), cliente.getEndereço());
		return clienteAtualizado;
	}
	
	@DeleteMapping ("/clientes/{id}")
	public  String excluir (@PathVariable ("id") int id ) {
		return "Cliente excluido ==> "+ id;
	}
}
