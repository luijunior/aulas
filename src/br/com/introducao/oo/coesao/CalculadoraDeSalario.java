package br.com.introducao.oo.coesao;


public class CalculadoraDeSalario{
	public double calcula(Funcionario funcionario){
		if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())){
			return dezOuVintePorCento(funcionario);
		}
		if(Cargo.DBA.equals(funcionario.getCargo())){
			return quinzeOuVinteCincoPorCento(funcionario);
		}
		throw new RuntimeException("funcionario com erro");
	}

	private double quinzeOuVinteCincoPorCento(Funcionario funcionario) {
		if(funcionario.getSalario() > 6000.0){
			return funcionario.getSalario() * 0.25;
		}
		else{
			return funcionario.getSalario() * 0.15;
		}
	}

	private double dezOuVintePorCento(Funcionario funcionario) {
		if(funcionario.getSalario() > 3000.0){
			return funcionario.getSalario() * 0.20;
		}
		else{
			return funcionario.getSalario() * 0.10;
		}
	}
}
