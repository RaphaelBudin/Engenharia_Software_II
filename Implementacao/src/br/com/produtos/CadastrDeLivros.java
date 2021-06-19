package br.com.produtos;

import java.util.ArrayList;
import java.util.List;

import br.com.livraria.*;

public class CadastrDeLivros {

	
	private List<Produto> produtos;
	
	public CadastrDeLivros() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	

}
