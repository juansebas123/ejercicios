//La nota final del curso de Desarrollo de aplicaciones móviles está dividido en 5 partes: Quices
//y seguimiento 20%, Prácticas de laboratorio 30%, Exposiciones 10%, Proyecto I 15% y
//Proyecto Final el 25%, desarrolle un programa en java que permita calcular la nota final de
//un estudiante del curso. Después de calcular la nota final el programa imprimirá lo siguiente
//dependiendo de la nota:.........

package ejer5;
import java.util.Scanner;//paquete

public class Ejer5 {

	public static void main(String[] args){

			Scanner lector=new Scanner (System.in);
			
			double quiz, prac, expos,proy1, proyf, nota;

			System.out.println("digite nota de quices:");
			quiz=lector.nextDouble();
			System.out.println("digite nota de prac:");
			prac=lector.nextDouble();
			System.out.println("digite nota de expos:");
			expos=lector.nextDouble();
			System.out.println("digite nota de proy1:");
			proy1=lector.nextDouble();
			System.out.println("digite nota de proyf:");
			proyf=lector.nextDouble();

			nota=quiz*0.2+prac*0.3+prac*0.1+proy1*0.15+proyf*0.25;

			System.out.println("la nota final es: "+nota);

			if (nota>= 0 && nota <1)
				System.out.println("estas en el lugar equivocado");
			if (nota>= 1 && nota <2)
				System.out.println("remal");
			
			if (nota>= 2 && nota <3)
				System.out.println("es posible recuperarse");
			if (nota>= 3 && nota <4)
				System.out.println("normalito");
			if (nota>= 4 && nota <4.5)
				System.out.println("muy bien");
			if (nota>= 4.5 )
				System.out.println("exelente");
		}
	}