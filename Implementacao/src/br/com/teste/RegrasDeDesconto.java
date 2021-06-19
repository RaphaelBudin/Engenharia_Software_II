package br.com.teste;

import br.com.livraria.*;
import br.com.produtos.*;


public class RegrasDeDesconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Autor autor = new Autor();
		autor.setNome("Henrique Oliveira");

		Livro livro = new LivroFisico(autor);
		livro.setValor(39.90);

		if (!((LivroFisico) livro).aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no livro não pode ser maior do que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);

		if (!ebook.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
		
		MiniLivro miniLivro = new MiniLivro(autor);
		
		if (!miniLivro.aplicaDescontoDe(0.3)) {
			System.out.println("Mini Livro não pode ter desconto");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}

	}

}
