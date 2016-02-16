
package ejer2;

//2. Escriba un algoritmo que permita calcular la hipotenusa de un triángulo 
//rectángulo utilizando el teorema de Pitágoras.
import java.util.Scanner;//paquete

public class Ejer2 {

	public static void main(String[] args){

			Scanner lector=new Scanner (System.in);
			double ladoA, ladoB, hipotenusa;
                        
			System.out.println("digite el lado A:");
			ladoA=lector.nextDouble();
			System.out.println("digite el ladoB");
			ladoB=lector.nextDouble();

			hipotenusa=Math.sqrt(ladoA*ladoA+Math.pow(ladoB,2));

			System.out.println("el valor de la hipotenusa es:"+hipotenusa);
        }

}

