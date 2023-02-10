package com.rafael.javabasico.aula15;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean letraValida = false;
		
		do {
			System.out.print("Digite apenas uma letra: ");
			String letra = scan.next();
					
			//"variavel.length()" faz a verificação de quantos caracteres foram digitados na "String"
			if (letra.length() > 1) {
				System.out.println("Letra inválida!");
			} else {
				letraValida = true;
				switch (letra) {
					case "a":
					case "e":
					case "i":
					case "o":
					case "u":
					case "A":
					case "E":
					case "I":
					case "O":
					case "U": System.out.println("A letra é uma vogal."); break;
					default: System.out.println("A letra é uma consoante.");
				}
			}
		} while (!letraValida);

	}

}
