package Pregunta2;

import java.util.Scanner;

public class Clasificacion {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		Persona[] personas = new Persona[50]; //leemos 
		for (int i = 0; i < 50; i++) {
			personas[i] = new Persona(); System.out.println("LEER PERSONAS - Persona " + (i + 1));
				
			while (true) { 
				System.out.print("Sexo (M/F): "); 
				char sexo = scanner.next().charAt(0);
				if (sexo == 'M' || sexo == 'F') { personas[i].sexo = sexo;
				break;
				} else {
					System.out.println("Entrada no válida. Por favor, introduzca 'M' para masculino o 'F' para femenino."); 
					}
				} 
			
			
			while (true) { 
				System.out.print("Edad: ");
				if (scanner.hasNextInt()) {
					int edad = scanner.nextInt();
					if (edad >= 0) { // edad no puede ser negativo
						personas[i].edad = edad;
						break;
						} else { 
							System.out.println("Entrada no válida. Por favor, introduzca una edad no negativa."); }
					} else {
						System.out.println("Entrada no válida. Por favor, introduzca un número."); 
						scanner.next(); // descartar
					}
				}
			}
			
		int mayoresEdad = 0; 
		int menoresEdad = 0;
		int masculinosMayores = 0;
		int femeninasMenores = 0;
		int totalMujeres = 0; 
		// este seria para procesar 
		for (Persona persona : personas) {
			if (persona.edad >= 18){
				mayoresEdad++;
				if (persona.sexo == 'M') {
					masculinosMayores++;
					}
				} else { menoresEdad++;
				if (persona.sexo == 'F') { 
					femeninasMenores++; } 
				} if (persona.sexo == 'F') {
					totalMujeres++; 
					} 
				}
		// calcular porcentajes
		double porcentajeMayores = (mayoresEdad / 50.0) * 100;
		double porcentajeMujeres = (totalMujeres / 50.0) * 100; 

		// mostramos 
		System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad); 
		System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
		System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinosMayores); 
		System.out.println("Cantidad de personas femeninas menores de edad: " + femeninasMenores); 
		System.out.printf("Porcentaje de personas mayores de edad: %.2f%%\n", porcentajeMayores); 
		System.out.printf("Porcentaje de mujeres: %.2f%%\n",porcentajeMujeres);
		
		
		
		
		
	}

}
