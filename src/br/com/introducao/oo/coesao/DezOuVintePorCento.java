package br.com.introducao.oo.coesao;

public class DezOuVintePorCento implements RegraDeCalculo{

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() > 3000.0){
			return funcionario.getSalario() * 0.80;
		}
		else{
			return funcionario.getSalario() * 0.90;
		}
	}

}
