package com.rafael.javabasico.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		//"for (inicialização; condição; incremento)"
		for (int i = 1; i <= 5; i++) {
			System.out.println("Valor de i = " + i);
		}
		
		System.out.println();
		
		//"for (inicialização; condição; decremento)"
		for (int i = 5; i >= 1; i--) {
			System.out.println("Valor de i = " + i);
		}
		
		//a variável "i" vale apenas para o bloco "for" onde foi criada

	}

}
