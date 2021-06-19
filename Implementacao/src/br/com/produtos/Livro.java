package br.com.produtos;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.livraria.*;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	
	public Livro(Autor autor) {
		
		if(autor == null) {
			throw new RuntimeException();
		}
		this.autor = autor;
	}
	
	public Livro() { 
		this.isbn = "000-00-00000-00-0";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	

	@Override
	public String toString() {
		return "Mostrando detalhes do livro" 
		+"\nNome: "+ nome
		+"\nDescricao: "+ descricao
		+"\nValor: "+ valor
		+"\nISBN: "+ isbn
		+ autor.toString()
		
		+"\n-----------------------------------";
	}
	
	
	
	
}
