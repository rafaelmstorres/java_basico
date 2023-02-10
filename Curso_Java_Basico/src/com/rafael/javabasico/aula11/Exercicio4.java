//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

package com.rafael.javabasico.aula11;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média bimestral é: %,.2f",media);

	}
}