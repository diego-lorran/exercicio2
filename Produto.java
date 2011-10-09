package br.ufpb.apspoo.Exercicio3;

public class Produto {
	
	private String nome;
	private CalculadorCusto calculador;
	
	public Produto(String nome) {
		this.nome = nome;
	}

	public void setCalculadorCusto(CalculadorCusto calculador){
		this.calculador = calculador;
	}

	public Double calcularCusto(){
		return this.calculador.calcularCusto();
	}

}
