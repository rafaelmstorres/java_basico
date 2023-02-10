package com.rafael.javabasico.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 6;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 3;
		System.out.println(resultado);
		
		resultado = resultado % 4; //Resto da divisão do valor do "resultado" por 4
		System.out.println(resultado);
		
		String primeiro = "Esta é uma ";
		String segundo = "String concatenada.";
		String terceiro = primeiro + segundo;
		System.out.println(terceiro);
		
		resultado ++; //Incremento unitário
		System.out.println(resultado);
		
		resultado --; //Decremento unitário
		System.out.println(resultado);
		
		System.out.println(resultado++); //Está pedindo para imprimir o "resultado" e depois fazer o incremento
		//é a mesma coisa que:
		//System.out.println(resultado);
		//resultado = + 1; ou resultado += 1;
		
		System.out.println(++resultado); //Está fazendo o incremento primeiro e depois imprimindo o "resultado"
		//é a mesma coisa que:
		//resultado = + 1; ou resultado += 1;
		//System.out.println(resultado);
						

	}

}
