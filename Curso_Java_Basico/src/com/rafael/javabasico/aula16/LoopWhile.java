package com.rafael.javabasico.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; //a letra "i" geralmente é usada como contador
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		//enquanto a condição for verdadeira vai repetir o comando dentro do "while"
		//primeiro verifica a condição e depois executa o comando
		while (i <= max) {
			System.out.println("Valor de i = " + i);
			i++; //é o mesmo que "i = i + 1" ou "i += 1"
		}
		
		System.out.println(i);

	}

}
