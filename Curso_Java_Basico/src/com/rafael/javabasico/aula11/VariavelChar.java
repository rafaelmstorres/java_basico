package com.rafael.javabasico.aula11;

public class VariavelChar {

	public static void main(String[] args) {

		char o = 'o';
		
		char i = 'i';
		
		char o1 = 111; //Valor da tabela ASCII
		
		char i1 = 105; //Valor da tabela ASCII
		
		char pontuacao = 0x003f; //Valor da tabela UNICODE
		
		System.out.println(o+i);
		
		System.out.println(""+o+i);
		
		System.out.println(o1+i1);
		
		System.out.println(""+o1+i1);
		
		System.out.println(pontuacao);
	}

}
