package br.com.introducao.oo.coesao;

public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorCento()),DBA(new QuinzeOuVinteCincoPorCento()),GP(new QuinzeOuVinteCincoPorCento());
	
	private RegraDeCalculo regraDeCalculo;
	
	private Cargo(RegraDeCalculo regraDeCalculo){
		this.regraDeCalculo = regraDeCalculo;
	}

	public RegraDeCalculo getRegraDeCalculo() {
		return regraDeCalculo;
	}
	
	
}
