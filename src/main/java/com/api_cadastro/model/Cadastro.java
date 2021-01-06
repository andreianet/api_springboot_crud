package com.api_cadastro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CPF;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@NotBlank(message = "Este campo é obrigatório")
	private String nome;
	
	@Column(unique = true)
	@NotBlank(message = "Este campo é obrigatório")
	@NotEmpty
	@Email(message = "Email Inválido, verificar")
	private String email;
	
	@Column(unique = true)
	@NotBlank(message = "Este campo é obrigatório")
	@Size(min = 11, max = 14, message = "Entre com CPF válido")
	@CPF(message = "CPF Inválido, verificar")
	private String cpf;
	
	//@DateTimeFormat(iso = ISO.DATE_TIME)
	//@CreationTimestamp //cria data atual
	
	@JsonFormat(pattern = "dd/MM/yyyy@HH:mm:ss.SSSZ")		
	private Date dtanasc;// = 1567109422123L;
	
	
	
}
