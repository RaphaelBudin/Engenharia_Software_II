package br.com.teste;

import java.util.List;

import br.com.cliente.CadastroDeCliente;
import br.com.cliente.Cliente;
import br.com.cliente.Pessoa;

public class RegistroDeCliente {

	public static void main(String[] args) {
		
		CadastroDeCliente cadastro = new CadastroDeCliente();
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(1);
		cliente1.setNome("Henrique Oliveira");
		cliente1.setCpf("486.713.178-95");
		cliente1.setEmail("henrit515@gmail.com");
		cliente1.setEndereco("Rua Paulo afonço Xavier");
		cliente1.setBairro("Parque buenos aires");
		cliente1.setUf("SP");
		cliente1.setCidade("Suzano");
		cliente1.setCep("08640-705");
		cliente1.setTelefone("95967-3701");
		
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setId(2);
		cliente2.setNome("Joao Oliveira");
		cliente2.setCpf("486.713.178-95");
		cliente2.setEmail("joao@gmail.com");
		cliente2.setEndereco("Rua Paulo afonço Xavier");
		cliente2.setBairro("Parque buenos aires");
		cliente2.setCidade("Suzano");
		cliente2.setUf("SP");
		cliente2.setCep("08640-705");
		cliente2.setTelefone("95967-3701");
		
		
		Cliente cliente3 = new Cliente();
		
		cliente3.setId(3);
		cliente3.setNome("Pedro Oliveira");
		cliente3.setCpf("486.713.178-95");
		cliente3.setEmail("pedro@gmail.com");
		cliente3.setEndereco("Rua Paulo afonço Xavier");
		cliente3.setBairro("Parque buenos aires");
		cliente3.setCidade("Suzano");
		cliente3.setUf("SP");
		cliente3.setCep("08640-705");
		cliente3.setTelefone("95967-3701");
		
		Cliente cliente4 = new Cliente();
		
		cliente4.setId(4);
		cliente4.setNome("Leandro Luque");
		cliente4.setCpf("486.713.178-95");
		cliente4.setEmail("luque@gmail.com");
		cliente4.setEndereco("Rua Paulo afonço Xavier");
		cliente4.setBairro("Parque buenos aires");
		cliente4.setCidade("mogi");
		cliente4.setUf("SP");
		cliente4.setCep("08640-705");
		cliente4.setTelefone("95967-3701");
		
		Cliente cliente5 = new Cliente();
		
		cliente5.setId(5);
		cliente5.setNome("Raphel Budin");
		cliente5.setCpf("486.713.178-95");
		cliente5.setEmail("raphael@gmail.com");
		cliente5.setEndereco("Rua Paulo afonço Xavier");
		cliente5.setBairro("Parque buenos aires");
		cliente5.setCidade("mogi");
		cliente5.setUf("SP");
		cliente5.setCep("08640-705");
		cliente5.setTelefone("95967-3701");
		
		cadastro.adiciona(cliente1);
		cadastro.adiciona(cliente2);
		cadastro.adiciona(cliente3);
		cadastro.adiciona(cliente4);
		cadastro.adiciona(cliente5);
		
		List <Pessoa> pessoas = cadastro.getPessoa();
		
		
		System.out.println("-------------------------------------------\t");
		System.out.println("|       Relatorios de Clientes            |");
	    System.out.println("-------------------------------------------\t");
				   
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		cadastro.remove(3);
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
;
	}

}
