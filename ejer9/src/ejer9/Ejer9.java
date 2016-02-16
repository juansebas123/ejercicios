/*9. Generar los números del 1 al 10 utilizando un ciclo que vaya de 10 a 1.*/

package ejer9;

import java.util.Scanner;//paquete

public class Ejer9 {

	public static void main(String[] args){
    int numero = 1;
          //Con un while imprimimos mientras numero sea menor que 11
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }

          //Con un do...while imprimimos mientras numero sea mayor que 1
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
}
}