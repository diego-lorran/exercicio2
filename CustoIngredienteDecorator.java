package br.ufpb.apspoo.Exercicio3;

public class CustoIngredienteDecorator extends CustoAquisicaoDecorator{
	
	private Double valorComponente;
	
	public CustoIngredienteDecorator(CalculadorCusto calculador){
		super(calculador);
		this.valorComponente = 0.0;
	}
	public Double calcularCusto(){
		return super.calcularCusto() + this.valorComponente;
	}
	
	public void setPreco(Double valor){
		this.valorComponente = valor;
	}

}
