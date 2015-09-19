package br.com.introducao.oo.acoplamento;

public class GeradorDeNf {

	private NfDao dao;
	private CalculadorDeImposto impostos;
	private RegraDeEntrega regraDeEntrega;
	private Correios correios;

	public EnviadorDeNf(NfDao dao,CalculadorDeImposto impostos,RegraDeEntrega entrega,Correios correios){
		this.dao = dao;
		this.correios = correios;
		this.impostos = impostos;
		this.regraDeEntrega = entrega;
		this.correios = correios;
	}
	
	public void processa(NotaFiscal nf){
		double imposto = this.impostos.para(nf);
		nf.setImposto(imposto);
		if(regraDeEntrega.deveEntregarUrgente(nf)){
			correios.enviarSedex10(nf);
		}
		else{
			correios.enviarPac(nf);
		}
		dao.persiste(nf);
	}

}

