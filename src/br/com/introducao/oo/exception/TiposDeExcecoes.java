package br.com.introducao.oo.exception;

public class TiposDeExcecoes {
	
	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscal(5.0, "Julio");
		try{
			nf.criarNota();
		}
		catch(ExceptionChecked check){
			nf.valor = 40;
			try{
				nf.criarNota();
			}
			catch(ExceptionChecked ex){
				nf.salvarNoBanco();
			}
		}
		nf.salvarNoBanco();
	}
}

class NotaFiscal{
	
	public double valor;
	public String nomeDoCliente;
	
	public NotaFiscal(double valor,String nomeDoCliente){
		this.valor = valor;
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public void criarNota() throws ExceptionChecked{
		this.valor=this.valor-10;
		if(this.valor<0){
			throw new ExceptionChecked("Nota precisa de valor positivo");
		}
	}
	
	public void salvarNoBanco(){
		throw new ExceptionUnchecked("Erro ao salvar no banco");
	}
	
}

class ExceptionChecked extends Exception{

	public ExceptionChecked(String msg){
		super(msg);
	}
}

class ExceptionUnchecked extends RuntimeException{

	public ExceptionUnchecked(String msg){
		super(msg);
	}
}
