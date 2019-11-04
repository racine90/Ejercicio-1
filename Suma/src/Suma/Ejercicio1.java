package Suma;

import java.util.Scanner;

public class Ejercicio1 {
	private String nombre;

	public static void main(String[] args) {
 System.out.println(" Ingrese un valor");
 Scanner ingreso = new Scanner(System.in);
 int valor1 = ingreso.nextInt();
 System.out.println(" Ingrese un valor");
 int valor2 = ingreso.nextInt();
 int resultado = valor1 + valor2;
 
 System.out.println("resultado es: "+resultado);
		 
 }
	
}
