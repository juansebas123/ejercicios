//10. Leer un número de dos dígitos y determinar si pertenece a la serie de Fibonacci.

package ejer10;

import java.util.Scanner;//paquete

public class Ejer10 {
    
    public static void main(String[] args){
            
            Scanner lector=new Scanner (System.in);
            int a = 0;
            while (a < 10 || a > 99) {
            System.out.println("Ingrese el numero de dos digitos:  ");
            a = lector.nextInt();
            }
            int fibo1, fibo2, i, resp = 0;
            fibo1 = 1;
            fibo2 = 1;
            System.out.print(fibo1 + " ");
            for (i = 2; i <= 11; i++) {
                if (fibo2 == a) {
                resp = 1;
                }
                fibo2 = fibo1 + fibo2;
                fibo1 = fibo2 - fibo1;
                System.out.print(fibo2 + " ");
                
            }
            if (resp == 1) {
                System.out.print("El numero si se encuentra dentro de los numeros fibonacci ");
            } 
            else {
                System.out.print("El numero no se encuentra dentro de los numeros fibonacci ");
            }
        }
}
