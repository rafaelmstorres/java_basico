package com.rafael.javabasico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome completo: ");
		//Lê a linha inteira digitada
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto + "\r");
		
		System.out.print("Digite seu primeiro nome: ");
		//Lê apenas a primeira string digitada
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.print("Digite sua idade: ");
		//Leitura do mesmo tipo da variável
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade + " anos");
		
		//Lendo vários dados em sequência (as respostas podem ser separadas por "enter" ou "backspace"
		System.out.println("Digite seu nome, sua idade, sua altura, se é casado (true / false) e quantos filhos tem: ");
		String nome = scan.next();
		int anos = scan.nextInt();
		float altura = scan.nextFloat();
		boolean estCivil = scan.nextBoolean();
		byte filhos = scan.nextByte();
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+anos);
		System.out.println("altura: "+altura);
		System.out.println("É casado? "+estCivil);
		System.out.println("Qtd. de filhos: "+filhos);

	}

}
