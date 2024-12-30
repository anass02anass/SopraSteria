package Pregunta;

import java.util.Scanner;

public class Pregunta1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		System.out.print("LEER NUMERO: "); 
		int numero = scanner.nextInt(); 
		if (numero % 2 == 0) { 
			System.out.println("El número es par. Pares descendentes desde " + numero + " hasta 0:"); 
		for (int i = numero; i >= 0; i -=2) { 
			System.out.println(i); 
			} 
		} else { 
			System.out.println("El número es impar. Impares descendentes desde " + numero + " hasta 1:"); 
		
		for (int i = numero; i >= 1; i -= 2) {
			System.out.println(i); 
			} 
		}
		}
	}


