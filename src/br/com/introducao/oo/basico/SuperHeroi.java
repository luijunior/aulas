package br.com.introducao.oo.basico;

public class SuperHeroi extends PessoaPublica{
	
	//Isso e sobreescrita de metodo, pode lancar uma excecao contando que a classe pai lance uma excecao maior
	@Override
	public String situacaoFiscal(){
		// TODO Auto-generated method stub
		return "Nao da pra identificar pois nao tem identidade";
	}

	//Sobrecarga e quando mudamos os argumentos do metodo
	public String situacaoFiscal(boolean checarNaReceita){
		return "Ainda nao conseguimos identificar";
	}
	
}
