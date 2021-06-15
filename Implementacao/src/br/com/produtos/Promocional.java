package br.com.produtos;

public interface Promocional {
	
	boolean aplicaDescontoDe(double porcentagem);
	
	default boolean aplicaDescontoDe10porcento() {
		return aplicaDescontoDe(0.1);
	}
	
}
