 /*En un curso se practican 4 evaluaciones con los siguientes porcentajes: 25%, 20%, 25% y
30%. Para cada estudiante se informa el código y las 4 notas. Hacer un programa que calcule
la nota definitiva de cada estudiante, el promedio de notas definitivas del curso y el
porcentaje de perdedores. Sugerencia:*/

package ejer12;

import java.util.Scanner;//paquete

public class Ejer12 {

        
        @SuppressWarnings("empty-statement")
	public static void main(String[] args){
           
            Scanner lector=new Scanner (System.in);
            double porcentaje1, porcentaje2, porcentaje3, porcentaje4, cont1por25=0, cont2por20=0; 
            double  pronota, cont3por25=0, cont4por30=0,contnota = 0, i, notaf = 0;
            double  nota;
            int estudiantes;
            
            System.out.println("digite numero de estudiantes: ");
            estudiantes=lector.nextInt();//100
            
            for (int j=0;j<estudiantes;j++)
            {
                System.out.println("Alumno " + (j+1));
                
                System.out.println("digite nota parcial 1: ");
                porcentaje1=lector.nextDouble();
                if (porcentaje1 < 3)
                    cont1por25++; // contMen25=contmen+1
                
                System.out.println("\bdigite nota parcial 2: ");
                porcentaje2=lector.nextDouble();
                if (porcentaje2 < 3)
                    cont2por20++; 
                
                System.out.println("digite nota parcial 3: ");
                porcentaje3=lector.nextDouble();
                if (porcentaje3 < 3)
                    cont3por25++;
                    
                System.out.println("digite nota parcial 4: ");
                porcentaje4=lector.nextDouble();
                if (porcentaje4 < 3)
                    cont4por30++;

                nota=(porcentaje1*0.25+porcentaje2*0.20+porcentaje3*0.25+porcentaje3*0.30);
                System.out.println("la nota definitiba del estudiante es: "+nota);
                notaf=notaf+nota;
           
                if(nota<3)
                    contnota++;
            }
            System.out.println("\npromedio de notas definitivas del curso: %"+notaf/estudiantes+"");
            System.out.println("perdieron "+contnota+" estudiantes esta materia");
            System.out.println("porcentaje de perdedores: %"+(contnota/estudiantes)*100);
        }
}