//Faça um Programa que peça dois números e imprima a soma.

package com.rafael.javabasico.aula11;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma dos números é: "+(numero1 + numero2));
		
	}
}