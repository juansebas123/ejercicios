/*6. En la U de A hay una máquina dispensadora que tiene 4 productos etiquetados con los
números 1, 2, 3 y 4, cada uno con un valor de $500, $800, $300 y $900, respectivamente.
Defina un algoritmo que lea el número de producto que ingresa el usuario y que le muestre
su precio.
*/
package ejer6;
import java.util.Scanner;//paquete

public class Ejer6 {
    
	public static void main(String[] args){

			Scanner lector=new Scanner (System.in);
			
			int uno, dos, tres, cuatro, numero;

			System.out.println("digite el numero del producto:");
			numero=lector.nextInt();
                        
                        if (numero==0)
				System.out.println("error");
			if (numero==1)
				System.out.println("el precio es $500");
			if (numero==2)
				System.out.println("el precio es $800");
			if (numero==3)
				System.out.println("el precio es $300");
                        if (numero==4)
				System.out.println("el precio es $900");
                        if (numero>=5)
				System.out.println("error");
		}
	}