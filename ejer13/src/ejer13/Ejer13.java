 /*En un curso se practican 4 evaluaciones con los siguientes porcentajes: 25%, 20%, 25% y
30%. Para cada estudiante se informa el código y las 4 notas. Hacer un programa que calcule
la nota definitiva de cada estudiante, el promedio de notas definitivas del curso y el
porcentaje de perdedores. Sugerencia:*/

package ejer13;

import java.util.Scanner;//paquete

public class Ejer13 {

	public static void main(String[] args){
           
            Scanner lector=new Scanner (System.in);
            double porcentaje1, porcentaje2, porcentaje3, porcentaje4, cont1por25=0, cont2por20=0;
            double estudiantes,pronota, cont3por25=0, cont4por30=0, notaf=0;
            double contnotaf = 0, j, sum = 0, prom;
            
            System.out.println("digite numero de estudiantes: ");
            estudiantes=lector.nextInt();//100
            
            for (int i=0;i<estudiantes;i++)
            {
                System.out.println("digite nota parcial 1: ");
                porcentaje1=lector.nextInt();
                if (porcentaje1 < 3)
                    cont1por25++; // contMen25=contmen+1
                
                System.out.println("digite nota parcial 2: ");
                porcentaje2=lector.nextInt();
                if (porcentaje2 < 3)
                    cont2por20++; 
                
                System.out.println("digite nota parcial 3: ");
                porcentaje3=lector.nextInt();
                if (porcentaje3 < 3)
                    cont3por25++;
                    
                System.out.println("digite nota parcial 4: ");
                porcentaje4=lector.nextInt();
                if (porcentaje4 < 3)
                    cont4por30++;
                
                notaf=porcentaje1*0.25+porcentaje2*0.20+porcentaje3*0.25+porcentaje3*0.30;
                System.out.println("la nota definitiba del estudiante es: "+notaf);
               
                if(notaf<3);
                    contnotaf++;

            }
            
             if(j=1; j<=notaf; j++);
                sum=sum+nota[j];
        
                System.out.println("\npromedio estudiantes"+sum+"\n");
            
            System.out.println("\nperdieron "+contnotaf+" estudiantes esta materia\n");
            
            pronota=cont1por25+cont2por20+cont3por25+cont4por30;
                System.out.println("la nota definitiba del estudiante es: "+pronota);
                 
            
           
        }   
}