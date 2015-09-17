package br.com.introducao.jvm;

import java.util.ArrayList;
import java.util.List;

public class EsgarcandoGc {
	//Executar com -verbose:gc -Xms64m -Xmx64m 
	// GC Memoria em uso antes GC->Memoria em uso depois GC(Total memoria), Tempo da coleta
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {

			List<Object> lista = new ArrayList<Object>();

			for (int j = 0; j < 300000; j++) {

				lista.add(new Object());

			}
		}
	}

}
