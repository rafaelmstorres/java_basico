package com.rafael.javabasico.aula15;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = scan.nextInt();
		
		//"%" é o mod do java (resto da divisão)
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.print("É um ano bissexto.");
		} else {
			System.out.print("Não é um ano bissexto.");
		}
	}

}
