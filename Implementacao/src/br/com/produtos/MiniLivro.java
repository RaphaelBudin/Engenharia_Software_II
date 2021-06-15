package br.com.produtos;
import br.com.livraria.*;

import br.com.produtos.*;

public class MiniLivro extends Livro{
	
	public MiniLivro(Autor autor) {
		super(autor);
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
	
}
