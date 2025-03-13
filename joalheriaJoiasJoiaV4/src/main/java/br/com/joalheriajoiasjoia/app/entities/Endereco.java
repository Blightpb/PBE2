package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEndereco", nullable = false)
	private Long idEndereco;
	
	@Column(name = "cep", nullable = false, length = 8)
	private String cep;
	
	@Column(name = "rua", nullable = false, length = 100)
	private String rua;
	
	@Column(name = "numCasa", nullable = false)
	private String numCasa;
	
	@Column(name = "cidade", nullable = false, length = 100)
	private String cidade;
	
	@Column(name = "estado", nullable = false, length = 2)
	private String estado;
	
	@Column(name = "comp", nullable = false, length = 100)
	private String comp;
	
	@Column(name = "bairro", nullable = false, length = 100)
	private String bairro;

	// Construtores
	
	public Endereco() {
	}
	
	public Endereco(Long idEndereco, String cep, String rua, String numCasa, String cidade, String estado, String comp, String bairro) {
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.rua = rua;
		this.numCasa = numCasa;
		this.cidade = cidade;
		this.estado = estado;
		this.comp = comp;
		this.bairro = bairro;
	}
	
	//Getters e setters

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
