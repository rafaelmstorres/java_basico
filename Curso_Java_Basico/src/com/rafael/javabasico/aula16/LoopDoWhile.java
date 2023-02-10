package com.rafael.javabasico.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {

		int i = 0;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		//repete o comando dentro do "do" enquanto a condição "while" for verdadeira
		//primeiro executa o comando e depois verifica a condição
		do {
			i++;
			System.out.println("Valor de i = " + i);
		} while (i < 10);
		
		System.out.println(i);
		
		//a condição é falsa, mas o "do-while" executa o comando pelo menos uma vez
		//porque a verificação da condição vem depois da execução do comando
		do {
			i++;
			System.out.println("Valor de i = " + i);
		} while (i < 10);
		
		System.out.println(i);
		
	}

}
