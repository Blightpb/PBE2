package com.senaidev.hospital.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_medico")
public class Medico {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_medico;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "crm", nullable = false, length = 11, unique = true)
	private String crm;
	
	@Column(name = "email", nullable = false, length = 100, unique = true)
	private String email;
	
	@Column(name = "rg", nullable = false, length = 9, unique = true)
	private String rg;

	//Construtores
	public Medico() {

	}

	public Medico(Long id_medico, String nome, String crm, String email, String rg) {
		this.id_medico = id_medico;
		this.nome = nome;
		this.crm = crm;
		this.email = email;
		this.rg = rg;
	}

	//Getters e Setters
	
	public Long getId_medico() {
		return id_medico;
	}

	public void setId_medico(Long id_medico) {
		this.id_medico = id_medico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}

