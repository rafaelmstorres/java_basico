package com.rafael.javabasico.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		
		//"&" simples sempre analiza todos os parâmetros para determinar o resultado
		boolean resultado1 = falso & verdadeiro;
		System.out.println(resultado1);
		
		//"&" duplo (curto circuito) só analiza até o parâmetro em que já pode determinar o resultado
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado2);
		
		//O "curto circuito" é somente para o && (e) e para o || (ou)

	}

}
