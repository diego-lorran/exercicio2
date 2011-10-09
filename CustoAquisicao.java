package br.ufpb.apspoo.Exercicio3;

public class CustoAquisicao implements CalculadorCusto{

	private Double valor;
	
	public CustoAquisicao(Double valor){
		this.valor = valor;
	}
	
	public Double calcularCusto() {
		return this.valor;
	}
	

}
