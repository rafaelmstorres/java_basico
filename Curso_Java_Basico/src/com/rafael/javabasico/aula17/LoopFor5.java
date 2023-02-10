package com.rafael.javabasico.aula17;

public class LoopFor5 {

	public static void main(String[] args) {
		
		//loop "for" sem corpo (geralmente usado quando se quer somar ou subtrair valores)
		//soma = 0 + (1 + 2 + 3 + 4)
		int soma = 0;
		for (int i=1; i<5; soma += i++);
		System.out.println("Valor da soma = " + soma);
		
		//subtracao = 15 - (1 - 2 - 3 - 4)
		int subtracao = 15;
		for (int i=1; i<5; subtracao -= i++);
		System.out.println("Valor da subtração = " + subtracao);

	}

}
