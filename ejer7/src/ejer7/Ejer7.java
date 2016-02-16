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
            int cantidad,nacimiento,sexo,registro, edad;
            int portmenores,portfemenino, portmedellin;
            
            System.out.println("Conductores a ingresar:");
            cantidad=lector.nextInt();
            for (int i=0;i<cantidad;i++)
            {
                System.out.println("conductor"+(i+1));
                System.out.println("año de nacimiento");
                nacimiento=lector.nextInt();
                do{
                    System.out.println("Sexo 1 o 2 (1=Femenino, 2=Masculino):");
                    sexo=lector.nextInt();
                }
                while (sexo==1 || sexo==2);
            }
            
            System.out.println("Inserte la edad: "); 
            edad=lector.nextInt();
            do{
                System.out.println("Opciones de registro: \n1.- Medellin\n2.- Otro\nInserte el numero de su opcion: "); 
                registro=lector.nextInt();
            }
            while (registro==1 || registro==2);
        }
for( i=0; i<cantidad; i++)
{
if(edad<25)
{
portmenores= portmenores+1;
}
if(b[i].sexo==2){
portfemenino=portfemenino+1;
}
if(b[i].registro==2){
medellin=medellin+1;
} 
System.out.println("PORCENTAJES DE CONDUCTORES\n");
System.out.println("Menores a 25 años: %0.2f",(porcentaje_men*100)/cantidad);
System.out.println("\nFemeninos: %0.2f",(porcentaje_fem*100)/cantidad);
System.out.println("\nMasculinos: %0.2f",(porcentaje_mas*100)/cantidad);
System.out.println("\nCon registro fuera de Medallin: %0.2f",(porcentaje_fue*100)/cantidad);

        

}
}