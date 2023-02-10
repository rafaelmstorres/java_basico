package com.rafael.javabasico.aula17;

public class LoopFor4 {

	public static void main(String[] args) {
		
		//a variável e o incremento podem ser declarados fora do "for" ("for" com partes ausentes)
		int i = 0;
		for ( ; i <= 10 ; ) {
			System.out.println("Valor de i = " + i);
			i += 2;
		}

	}

}
