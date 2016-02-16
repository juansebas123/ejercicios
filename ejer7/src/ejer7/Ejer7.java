/*Una oficina de seguros ha reunido datos concernientes a todos los accidentes de tránsito
ocurridos en el área metropolitana en el último año. Por cada conductor involucrado en un
accidente se toman los siguientes datos: año de nacimiento, sexo (1: Femenino, 2: Masculino),
registro del carro (1: Medellín, 2: Otras ciudades). Hacer un programa en java que muestre:
a) El porcentaje de conductores menores de 25 años. b) El porcentaje de conductores del sexo femenino.
c) El Porcentaje de conductores cuyos carros están registrados fuera de Medellín.*/
package ejer7;

import java.util.Scanner;//paquete

public class Ejer7 {

	public static void main(String[] args){
            
            Scanner lector=new Scanner (System.in);
            double accidentes,yearnac, sexo, ciudad,contMen25=0, contFem=0, contFuera=0;
            double porcContMEn25, porcContFem, porcContFuera;
            
            System.out.println("digite el numero de accidentes:");
            accidentes=lector.nextInt();//100
            
            for (int i=0;i<accidentes;i++)
            {
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
            }
            porcContMEn25=contMen25/accidentes*100;
            porcContFem=contFem/accidentes*100;
            porcContFuera=contFuera/accidentes*100;
            
            System.out.println("el porcentaje de menores de 25 es: "+porcContMEn25+
                    "\nel porcentaje de femenimo es: "+porcContFem+
                    "\nel porcentaje de carros de afuera es: " +porcContFuera);
        }   
}