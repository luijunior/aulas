package br.com.introducao.oo.basico;

public class PrimeiraClasse {
	//Metodo executado pela JVM
	public static void main(String[] args) {
		PessoaPublica pessoa = new PessoaPublica();
		pessoa.email = "luizlagj@gmail.com";
		pessoa.cpf = "12312312345";
		pessoa.nome = "Luiz Antonio";
		
		System.out.println(pessoa.situacaoFiscal());
		System.out.println(pessoa.situacaoFiscalIfReduzido());
		/*
		SuperHeroi batman = new SuperHeroi();
		batman.nome = "Batman";
		System.out.println(batman.situacaoFiscal());
		System.out.println(batman.situacaoFiscal(true));
		*/
	}

}
