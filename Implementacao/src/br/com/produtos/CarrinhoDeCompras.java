package br.com.produtos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private double total; 
	
	private List<Produto> produtos;
	
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
		total += produto.getValor();
	}
	
	public void remove(Produto produto) {
		this.produtos.add(produto);
		total -= produto.getValor();
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public double getTotal() {
		return total;
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
}
