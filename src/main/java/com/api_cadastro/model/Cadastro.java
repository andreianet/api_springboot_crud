package com.api_cadastro.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor //cria automaticamente um construtor com todas os atributos da classe como argumento
@NoArgsConstructor //construtor vazio (sem argumentos)
@Entity
@Data //pertence ao JPA e isso significa que a classe será automaticamente mapeada à tabela com o mesmo nome
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, name ="nome")
	private String nome;
	
	
	private String email;
	
	
	private String cpf;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Long dtanasc;// = 1567109422123L;
	//dtanasc = LocalDate.ofInstant(Instant.ofEpochMilli(dtanasc), ZoneId.systemDefault());
	

}
