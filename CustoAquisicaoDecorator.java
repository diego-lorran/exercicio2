package br.ufpb.apspoo.Exercicio3;

public class CustoAquisicaoDecorator implements CalculadorCusto{

	private CalculadorCusto calculador;
	
	public CustoAquisicaoDecorator(CalculadorCusto calculador){
		this.calculador = calculador;
	}
	
	public Double calcularCusto() {
		return this.calculador.calcularCusto();
	}
	
	

}
