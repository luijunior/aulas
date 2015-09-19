package br.com.introducao.oo.coesao;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo{

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() > 6000.0){
			return funcionario.getSalario() * 0.25;
		}
		else{
			return funcionario.getSalario() * 0.15;
		}
	}

}
