package com.rafael.javabasico.aula17;

public class LoopFor2 {

	public static void main(String[] args) {
		
		//o "for" pode conter mais de uma variável
		for (int i = 1, j = 10; i < j ; i++, j--) {
			System.out.println("Valor de i = " + i + " | valor de j = " + j);
		}

	}

}
