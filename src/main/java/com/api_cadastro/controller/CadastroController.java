package com.api_cadastro.controller;

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

import com.api_cadastro.model.Cadastro;
import com.api_cadastro.repository.CadastroRepository;


@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	
	/*@GetMapping
	public String home() {
		return "Testanto API Cadastro";
	}*/
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping
	public List<Cadastro> listar(){
		return cadastroRepository.findAll(); //lista todos os cadastros
		
	}
	
	@PostMapping	
	public Cadastro add(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro); //criar um cadastro
	}
	
	
	@GetMapping //endpoint: cadastro/cadastro/id
	@RequestMapping(path = "/cadastro/{id}") 
	public Cadastro getCadastroId( @PathVariable Long id) {
		return cadastroRepository.findById(id).get(); //obter cadastro pelo ID
	}
	
	@PutMapping(value="/cadastro/{id}")
	public Cadastro update(@PathVariable long id, @RequestBody Cadastro newcadastro) {
		return cadastroRepository.findById(id).map(cad -> {
			cad.setNome(newcadastro.getNome());
			cad.setEmail(newcadastro.getEmail());
			cad.setCpf(newcadastro.getCpf());
			cad.setDtanasc(newcadastro.getDtanasc());
			return cadastroRepository.save(cad);
		}).orElseGet(() -> {
			newcadastro.setId(id);
			return cadastroRepository.save(newcadastro);
		});

	}
	
	@DeleteMapping ("/cadastro/{id}")
	void delCadastroId(@PathVariable long id) {
		cadastroRepository.deleteById(id); //deletar um cadastro pelo ID
		
	}
	
	

}
