//1.Desarrolle un algoritmo que permita calcular el volumen y el área de un cubo
package ejer1;

import java.util.Scanner;//paquete

public class Ejer1 {

	public static void main(String[] args){


		// declaracion de variables
	int lado; 
	double volumen, area;
	Scanner lector = new Scanner(System.in); //defino el lector

	// entrada de datos
	System.out.println("digite el lado del cubo:");
	lado=lector.nextInt();

	//proceso de datos
	volumen = Math.pow(lado, 3);
	area=Math.pow (lado, 2);

	//salida de datos
	System.out.println("el area es igual a: "+area+" y el volumen es igual a:"+volumen);
        }

}