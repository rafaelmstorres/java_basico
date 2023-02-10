package com.rafael.javabasico.aula14;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade. \r");
		}
		
		System.out.print("Digite o preço: ");
		double preco = scan.nextDouble();
		
		if (preco <= 10) {
			System.out.println("Está barato.");
		} else if (preco > 10 && preco < 15) {
			System.out.println("Peça um desconto.");
		} else if (preco >=15 && preco < 20) {
			System.out.println("Pesquise mais.");
		} else {
			System.out.println("Está muito caro.");
		}

	}

}
