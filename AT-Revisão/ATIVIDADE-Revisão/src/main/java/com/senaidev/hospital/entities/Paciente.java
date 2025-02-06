package com.senaidev.hospital.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_paciente")
public class Paciente {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_paciente;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "rg", nullable = false, length = 9, unique = true)
	private String rg;

	@Column(name = "nome_acompanhante", nullable = false, length = 100)
	private String nome_acompanhante;
	
	@Column(name = "dt_nascimento", nullable = false)
	private Date dt_nascimento;
	
	
	
	//Construtores
	public Paciente() {

	}

	public Paciente(Long id_medico, String nome, String rg, String nome_acompanhante, Date dt_nascimento) {
		this.id_paciente = id_medico;
		this.nome = nome;
		this.rg = rg;
		this.nome_acompanhante = nome_acompanhante;
		this.dt_nascimento = dt_nascimento;
	}

	//Getters e Setters
	
	public Long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Long id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome_acompanhante() {
		return nome_acompanhante;
	}

	public void setNome_acompanhante(String nome_acompanhante) {
		this.nome_acompanhante = nome_acompanhante;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

}

