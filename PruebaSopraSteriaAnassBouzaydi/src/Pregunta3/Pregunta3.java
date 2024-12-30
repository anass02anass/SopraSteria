package Pregunta3;

import java.util.Scanner;

public class Pregunta3 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in); 
		// leemos
		System.out.print("LEER HORASTRABAJADAS: "); 
		int horasTrabajadas = scanner.nextInt(); 
		System.out.print("LEER TARIFA: "); 
		double tarifa = scanner.nextDouble(); 
		double salario; 
		if (horasTrabajadas > 40) { 
			int horasExtras = horasTrabajadas - 40; salario = (40 * tarifa) + (horasExtras * tarifa * 1.5);
			} else { 
				salario = horasTrabajadas * tarifa; 
				} 
		// Mostrar el salario calculado 
		System.out.printf("el salario del trabajador es: %.2f\n", salario);
		
	}

}
