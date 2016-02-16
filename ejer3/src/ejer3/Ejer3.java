// 3. Dado el valor del lado de un triángulo equilátero, haga un algoritmo 
// que calcule su perímetro, su altura y su área.
package ejer3;

import java.util.Scanner;//paquete

public class Ejer3 {

	public static void main(String[] args){

		// declaracion de variables
	int lado; 
	double perimetro, altura, area;
	Scanner lector = new Scanner(System.in); //defino el lector

	// entrada de datos
	System.out.println("digite el lado del triangulo equilatro:");
	lado=lector.nextInt();

	//proceso de datos
	perimetro = lado*3;
	altura=((Math.sqrt(3))/2)*lado;
        area=(lado*altura)/2;

	//salida de datos
	System.out.println("el perimetro es: "+perimetro);
        System.out.println("la altura es: "+altura);
        System.out.println("el area es: "+area);
        }

}