package br.ufpb.apspoo.Exercicio3;

public class CustoFuncionarioDecorator extends CustoAquisicaoDecorator{
	
	private Double valorComponente;
	
	public CustoFuncionarioDecorator(CalculadorCusto calculador){
		super(calculador);
		this.valorComponente = 20.0;
	}
	
	public Double calcularCusto(){
		return super.calcularCusto() + this.valorComponente;
	}
	
	public void setPreco(Double valor){
		this.valorComponente = valor;
	}

}
