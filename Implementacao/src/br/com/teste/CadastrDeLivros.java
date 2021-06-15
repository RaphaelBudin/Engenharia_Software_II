package br.com.teste;

import br.com.livraria.*;
import br.com.produtos.*;

public class CadastrDeLivros {

	public static void main(String[] args) {
	
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo ashiuchi");
		autor.setEmail("Rodrigo.ashiuchi@gmail.com");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(autor);

		livro.setNome("Java");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(79.90);
		livro.setIsbn("788-85-66250-46-6");
			
		
		System.out.println(livro.toString());
		
		Autor autor2 = new Autor();
		
		autor2.setNome("Paulo Henrique");
		autor2.setEmail("paulo.henrique@gmail.com");
		autor2.setCpf("123.456.789.10");
		
		
		Livro livro2 = new LivroFisico(autor2);
		
		livro2.setNome("Logica de Programação");
		livro2.setDescricao("Primeiros programas em C");
		livro2.setValor(59.90);
		livro2.setIsbn("878-85-66250-22-0");
			
		System.out.println(livro2.toString());
	
		
	}

}
