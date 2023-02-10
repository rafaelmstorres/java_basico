package com.rafael.javabasico.aula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0 ) {
			System.out.print("Número par.");
		} else {
			System.out.print("Número ímpar.");
		}

	}

}
