package com.rafael.javabasico.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valo1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valo1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 e valor2 é 2: " + resultado1);
		
		boolean resultado2 = (valo1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 ou valor2 é 2: " + resultado2 + "\r");
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(verdadeiro ^ !falso);

	}

}
