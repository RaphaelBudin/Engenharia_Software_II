package br.com.teste;


import java.util.List;
import br.com.livraria.*;
import br.com.produtos.*;


public class RegristroDeVenda {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Leandro Luque");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Engenharia de Software");
		fisico.setValor(79.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Estrutura de Dados");
		ebook.setValor(39.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
	
	
		List <Produto> produtos = carrinho.getProdutos();
		
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
		
		carrinho.remove(1);
		
		System.out.println("\n\nRemovendo um livro do carrinho de compra\n\n");
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
		
	}

}
