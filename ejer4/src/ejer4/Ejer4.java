// 4. Desarrollar un programa que calcule la nota definitiva de un estudiante 
// en una asignatura, se sabe que durante el semestre académico se manejan 
// tres notas con sus respectivos porcentajes así: seguimiento (50%), 
// parcial I (25%) y parcial 2 (25%).
package ejer4;
import java.util.Scanner;//paquete

public class Ejer4 {
    
	public static void main(String[] args){

			Scanner lector=new Scanner (System.in);
			
			double seguimiento, parcial1, parcial2, nota;

			System.out.println("digite la nota de seguimiento:");
			seguimiento=lector.nextDouble();
			System.out.println("digite nota del parcial 1:");
			parcial1=lector.nextDouble();
			System.out.println("digite nota del parcial 2:");
			parcial2=lector.nextDouble();

			nota=seguimiento*0.5+parcial1*0.25+parcial2*0.25;

			System.out.println("la nota final es: "+nota);
		}
	}