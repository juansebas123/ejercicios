package solucionpractica;

import java.util.Scanner;

public class Solucionpractica {

    public static void main(String[] args) {
        //almacena una persona: PersonalData Datos = new PersonalData();)
        PersonalData Datos[] = new PersonalData[100];// almacena 100 personas
        Scanner lector = new Scanner(System.in);
        int opc = 0, contUs = 0; //conus nos merpite ssaber cuantos usuarios hay en el sistema

        do {
            System.out.println("menu principal");
            System.out.println("1. ingresar usuario");
            System.out.println("2. actualizar");
            System.out.println("3. eliminar");
            System.out.println("4. buscar");
            System.out.println("5. salir");
            System.out.print("selecion una opcion!  ");
            opc = lector.nextInt();

            switch (opc) {
                case 1:
                    if (contUs < 99) {
                        Datos[contUs]= new PersonalData();
                        System.out.print("Ingreso de usuarios");
                        System.out.print("digite el nombre del usuaio ");
                        Datos[contUs].setNombre(lector.next());
                        System.out.print("digite el nombre del apellido ");
                        Datos[contUs].setApellido(lector.next());
                        System.out.print("digite el nombre de fecha de nacimiento ");
                        Datos[contUs].setFecha(lector.next());
                        System.out.print("digite el nombre de cedula ");
                        Datos[contUs].setCedula(lector.next());
                        System.out.print("digite el nombre de direccion ");
                        Datos[contUs].setDireccion(lector.next());
                        System.out.print("digite el nombre de telefono ");
                        Datos[contUs].setTelefono(lector.next());
                        System.out.print("digite el nombre de areas: \n.1.quimica, fisica, tecnologia, calculo o programacion");
                        Datos[contUs].setAreas(lector.next());
                        contUs++;
                    } else {
                        System.out.print("No hay mas memoria");
                    }

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.print("gracias por utilizar el programa, bye");
                    break;
                default:
                    System.out.print("\nopcion incorrecta\n");
                    break;
            }
        } while (opc != 5);

    }

}
