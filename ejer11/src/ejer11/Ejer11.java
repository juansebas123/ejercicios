//Leer un número y calcularle el factorial a todos los enteros comprendidos entre 1 y el número
//y el número leído.

package ejer11;

import java.util.Scanner;

public class Ejer11 {
    
    public static void main(String[] args){
        
        Scanner lector=new Scanner (System.in); 
    
        System.out.println("Este programa calcula el factorial de su numero ");
        System.out.print("bien digita tu numero ");
        int a, f;
        a = lector.nextInt();
        f = 1;
        while (a != 1) {
            f *= a;
            a--;
        }
        System.out.println("el resultado es " + f);
    }
}
