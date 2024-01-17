package com.generation.lojadegames.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome é obrigatorio")
	@Size(min = 5, max = 255, message = "O nome deve conter no minimo 5 caracteres e no máximo 255")
	private String nome;
	
	@NotBlank (message = "O preço é obrigatorio")
	private Double preco;
	
	@NotBlank (message = "A classifição é obrigatoria")
	private Double classificação;
	
	@NotBlank (message = "O idioma é obrigatorio")
	@Size(min = 5, max = 255, message = "O idioma deve conter no minimo 5 caracteres e no máximo 255")
	private String idioma;
	
	@NotBlank (message = "A data é obrigatorio")
	private LocalDate lancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getClassificação() {
		return classificação;
	}

	public void setClassificação(Double classificação) {
		this.classificação = classificação;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public LocalDate getLancamento() {
		return lancamento;
	}

	public void setLancamento(LocalDate lancamento) {
		this.lancamento = lancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	

}
