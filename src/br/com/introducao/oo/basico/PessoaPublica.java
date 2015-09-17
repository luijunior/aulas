package br.com.introducao.oo.basico;


public class PessoaPublica {
	//Os atributos sao caracteristicas da nossa classe
	public String nome;
	public String cpf;
	public String email;
	
	//Por default o compilador gera o metodo contrutor para nos
	public PessoaPublica(){
		
	}
	
	//Metodos sao comportamentos de nossa classe
	public String situacaoFiscal(){
		//If e o operador logico que valida cenarios CUIDADO com ele, ele sempre valida um boolean que em java tem o valor true ou false
		if(cpf.equals("12312312345")){
			return "Regular";
		}
		else{
			return "Irregular";
		}
	}
	
	public String situacaoFiscalIfReduzido(){
		return (cpf.equals("12312312345")) ? "Regular" : "Irregular";
	}

}
