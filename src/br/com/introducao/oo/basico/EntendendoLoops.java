package br.com.introducao.oo.basico;

public class EntendendoLoops{
	public static void main(String[] args) {
		loopFor(4);
		String[] palavras = {"Palavra 1","Palavra 2"};
		loopDeObjetos(palavras);
		loopLogico(true);
		loopLogicoExecutadoUmaVezSempre(false);
	}
	//A palavra static se refere a metodos ou atributos de classe e nao de isntancia
	//Metodos estaticos so podem invocar diretamente outros metodos estaticos, pois pode nao existir uma instancia da classe quando o mesmo for chamado
	private static void loopFor(int tamanho){
		for (int i=1;i<=tamanho;i++){
			System.out.println("Iteracao "+i+" maximo de "+tamanho);
		}
	}
	
	private static void loopDeObjetos(String[] palavras){
		for(String palavra : palavras){
			System.out.println(palavra);
		}
	}
	
	private static void loopLogico(boolean condicao){
		while(condicao){
			System.out.println("Vou aparecer se condicao for true");
			condicao =false;
		}
	}
	
	private static void loopLogicoExecutadoUmaVezSempre(boolean condicao){
		do{
			System.out.println("Vou aparecer sempre");
		}
		while(condicao);
		
	}

}
