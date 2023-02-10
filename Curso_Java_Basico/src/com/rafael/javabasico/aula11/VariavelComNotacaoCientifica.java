package com.rafael.javabasico.aula11;

public class VariavelComNotacaoCientifica {

	public static void main(String[] args) {
		
		double d1 = 123.4;
		
		double d2 = 1.234e2; //valor igual a d1, mas em notação científica
		
		float f1 = 387.9f;
		
		float f2 = 3.879e2f; //valor igual a f1, mas em notação científica
		
		//"e2" é o mesmo que 10 elevado a 2
		
		System.out.println(f1+" é igual a "+f2);
		
		System.out.println(d1+" é igual a "+d2);

	}

}
