package br.ufpb.apspoo.Exercicio3;

public class ProdutoEletronicoCalculadorCusto implements CalculadorCusto {
	
	private Double valor;
	
	public ProdutoEletronicoCalculadorCusto(Double valor){
		this.valor = valor;
	}
	
	public ProdutoEletronicoCalculadorCusto(){
		this(0.0);
	}
	
	public Double calcularCusto() {
		return this.valor;
	}

}
