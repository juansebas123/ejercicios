/*Escribir un programa utilizando la estructura Switch, que reciba dos números de dos cifras,
tome el primer número digitado y dependiendo del valor del último digito haga
 */
package ejer8;

import java.util.Scanner;//paquete

public class Ejer8 {
    
    public static void main(String[] args){
        
        Scanner lector=new Scanner (System.in);
        
        double suma, resta, mult, div, div2;
        double div1, raiz1, numero1, numero2;
        int x;
        
        System.out.println("dijite el primer numero:");
        numero1=lector.nextInt();
        System.out.println("dijite el segundo numero:");
        numero2=lector.nextInt();
    
        System.out.println("\n eliga su opcion de interes\n");
        System.out.println("0: cual es el numero mayor");
        System.out.println("1: cual es el numero menor");
        System.out.println("2: su suma");
        System.out.println("3: su resta");
        System.out.println("4: su multiplicacion");
        System.out.println("5: su division");
        System.out.println("6: ¿el primero es divisible por el segundo?");
        System.out.println("7: ¿el segundo es divisible por el primero?");
        System.out.println("8: raiz cuadrada del primero");
        System.out.println("9: Que punto tan fácil parce\n");
        
        System.out.println("opcion:");
        x=lector.nextInt();
        
        switch (x) {
            case 0:
                System.out.println ("el numero mayor es");
                    if (numero1>numero2)
                        System.out.println(numero1 + " es mayor que " + numero2);
                    else
                        System.out.println(numero2 + " es mayor que " + numero1);
                   break;
            case 1:
                System.out.println ("el numero menor es");
               if (numero1<numero2)
                        System.out.println(numero1 + " es menor que " + numero2);
                    else
                        System.out.println(numero2 + " es menor que " + numero1);
                break;
            case 2:
                suma=numero1+numero2;
                System.out.println ("la suma es  "+suma);
                break;
            case 3:
                resta=numero1-numero2;
                System.out.println ("la resta es  "+resta);
                break;
            case 4:
                mult=numero1*numero2;
                System.out.println ("la multiplicacion es  "+mult);
                break;
            case 5:
                div=numero1/numero2;
                System.out.println ("la division es  "+div);
                break;
            case 6:
                System.out.println ("el primero es divisible por el segundo");
                break;
            case 7:
                System.out.println ("el primero es divisible por el primero");
                break;
            case 8:
                raiz1=Math.sqrt(numero1);
                System.out.println ("cual es mayor  "+raiz1);
                break;
            case 9:
                System.out.println ("Que punto tan fácil parce");
                break;                
                    
		}
	}
}
