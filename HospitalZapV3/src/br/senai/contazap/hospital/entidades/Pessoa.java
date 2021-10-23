package br.senai.contazap.hospital.entidades;

import java.time.LocalDate;

import lombok.Data;

@Data
public abstract class Pessoa {

	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	
}
