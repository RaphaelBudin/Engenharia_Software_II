package br.com.cliente;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeCliente {
	
	private List<Pessoa> pessoa;
	
	public CadastroDeCliente() {
		this.pessoa = new ArrayList<Pessoa>();
	}
	
	public void adiciona(Pessoa pessoa) {
		this.pessoa.add(pessoa);
	}
	
	public void remove(int posicao) {
		this.pessoa.remove(posicao);
	}
	
	public List<Pessoa> getPessoa(){
		return pessoa;
	}

}
