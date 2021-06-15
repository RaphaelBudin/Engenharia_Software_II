package br.com.produtos;

import br.com.livraria.*;

public class Revista implements Produto, Promocional {
	
	private String nome;
	private String descircao;
	private double valor;
	private Editora editora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescircao() {
		return descircao;
	}
	public void setDescircao(String descircao) {
		this.descircao = descircao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
	
}	
