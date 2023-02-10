//Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número]".

package com.rafael.javabasico.aula11;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		
		System.out.print("O número informado foi: "+numero);

	}
}