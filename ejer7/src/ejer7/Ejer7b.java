
package ejer7;

import java.util.Scanner;//paquete

public class Ejer7b {

	public static void main(String[] args){
            
            Scanner lector=new Scanner (System.in);
            double accidentes = 0, yearnac, sexo, ciudad,contMen25=0, contFem=0, contFuera=0;
            double porcContMEn25, porcContFem, porcContFuera;
            int opcion;        
            
            do{
                accidentes++;
                System.out.println("digite el año de nacimeitno");
                yearnac=lector.nextInt();
                if (2016 - yearnac < 25)
                    contMen25++; // contMen25=contmen+1
                
                System.out.println("digite el el sexo: 1 femenino, 2 masculino");
                sexo=lector.nextInt();
                if (sexo==1)
                    contFem++; 
                
                System.out.println("digite el registro del carro: 1 medellin, 2 otra ciudad");
                ciudad=lector.nextInt();
                if (ciudad == 2)
                    contFuera++;
                
                System.out.println("digite 1 para seguir y 2 para salir");
                opcion=lector.nextInt();
            }while(opcion==1);
            
            porcContMEn25=contMen25/accidentes*100;
            porcContFem=contFem/accidentes*100;
            porcContFuera=contFuera/accidentes*100;
            
            System.out.println("el porcentaje de menores de 25 es: "+porcContMEn25+
                    "\nel porcentaje de femenimo es: "+porcContFem+
                    "\nel porcentaje de carros de afuera es: " +porcContFuera);
        }   
}

