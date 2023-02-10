package com.rafael.javabasico.aula16;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.print("Digite uma nota entre 1 e 10: ");
			double nota = scan.nextDouble();
			
			if (nota >= 1 && nota <=10) {
				notaValida = true;
				System.out.println("Você digitou "+nota);
			} else {
				System.out.println("Nota inválida, tente novamente. \r");
			}
		} while (!notaValida);

	}

}
