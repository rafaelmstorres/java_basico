package com.rafael.javabasico.aula15;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana (1-7): ");
		int dia = scan.nextInt();
		
		switch (dia) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.err.println("Não é um dia válido!");
		}
		
		switch (dia) {
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: System.out.println("Dia útil"); break;
			case 1:
			case 7: System.out.println("Fim de semana"); break;
			default: System.err.println("Digite um número entre 1 e 7");
		}
		
		//"Switch Case" também aceita comparação com "String"

	}

}
