package com.rafael.javabasico.aula15;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.print("Digite a operação (+ - / *): \r");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean validacao = true;
		
		switch (operacao) {
			case "+": resultado = num1 + num2; break; 
			case "-": resultado = num1 - num2; break; 
			case "/": resultado = num1 / num2; break; 
			case "*": resultado = num1 * num2; break; 
			default: System.out.println("Operação inválida!"); validacao = false;
		}
		
		if (validacao) {
			System.out.println("Resultado: "+resultado);
			
			if (resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Resultado par.");
			} else {
				System.out.println("Resultado ímpar.");
			}
		}

	}

}
