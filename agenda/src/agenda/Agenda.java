package agenda;

import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        int opcion, c = 0, posNombre;
        String nombreClase, apellidoClase, cedulaClase;
        Scanner lector = new Scanner(System.in);

        Contactos[] nit = new Contactos[10];

        do {

            System.out.println("Digite una opción: ");
            System.out.println("1. ingresar usuario");
            System.out.println("2. actualizar usuario");
            System.out.println("3. eliminar usuario");
            System.out.println("4. buscar usuario");
            System.out.println("5. imprimir base de datos");
            System.out.println("6. salir");
            opcion = lector.nextInt();

            switch (opcion) {

                case 1:
                    c++;
                    nit[c] = new Contactos();
                    System.out.println("ingrese el nombre:");
                    nombreClase = lector.next();
                    nit[c].setNombre1(nombreClase);
                  
                    System.out.println("ingrese el apellido:");
                    apellidoClase = lector.next();
                    nit[c].setApellido1(apellidoClase);
                  
                    System.out.println("ingrese el numero de cedula:");
                    cedulaClase = lector.next();
                    nit[c].setCedula1(cedulaClase);
                    System.out.println("se ingreso el usuario con exito");

                    break;

                case 2:

                    int i = 0,
                     estado = 0;
                    String buscar = new String();
                    System.out.println("ingrese el nombre del usuario para actualizar datos:");
                    buscar = lector.next();
                    if (c > 0) {
                        nit[i] = new Contactos();
                        for (i = 0; i < c + 1; i++) {

                            if (buscar.equals(nit[i].getNombre1())) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[i].getNombre1());
                                System.out.println("apellido:" + nit[i].getApellido1());
                                System.out.println("cedula: " + nit[i].getCedula1());
                            
                                System.out.println("ingrese el nuevo nombre:");
                                nombreClase = lector.next();
                                nit[i].setNombre1(nombreClase);
                              
                                System.out.println("ingrese el nuevo apellido:");
                                apellidoClase = lector.next();
                                nit[i].setApellido1(apellidoClase);
                                
                                System.out.println("ingrese el nuevo numero de cedula:");
                                cedulaClase = lector.next();
                                nit[i].setCedula1(cedulaClase);
                           
                                estado = 1;
                                break;

                            }

                        }
                    }

                    if (estado == 0) {
                        System.out.println("no existe el usuario");
                    }
                    break;

                case 3:

                    int m = 0,
                     estado2 = 0;
                    String eliminar = new String();
                    System.out.println("ingrese el nombre del usuario para eliminar:");
                    eliminar = lector.next();
                    if (c > 0) {
                        nit[m] = new Contactos();
                        for (m = 0; m < c + 1; m++) {

                            if (eliminar.equals(nit[m].getNombre1())) {

                                for (int r = m; r < c; r++) {

                                    nit[r] = nit[r + 1];
                                }
                                c--;
                            }

                        }
                    }
                    if (estado2 == 0) {
                        System.out.println("no existe el usuario");
                    }

                    break;

                case 4:

                    int j = 0,
                     esta = 0;
                    String buscaUsuario;
                    System.out.println("ingrese el nombre del usuario para buscar datos:");
                    buscaUsuario = lector.next();
                    if (c > 0) {
                        nit[j] = new Contactos();
                        for (j = 0; j <= c; j++) {
                            if (buscaUsuario.equals(nit[j].getNombre1())) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[j].getNombre1());
                                System.out.println("apellido: " + nit[j].getApellido1());
                                System.out.println("cedula: " + nit[j].getCedula1());
                                esta = 1;
                                break;
                            }
                        }
                    }
                    if (esta == 0) {
                        System.out.println("no existe el usuario");
                    }
                    break;

                case 5:

                    int p = 0;
                    nit[p] = new Contactos();
                    if (c > 0) {
                        for (p = 0; p <= c; p++) {
                            System.out.println("datos:");
                            System.out.println("nit: " + p);
                            System.out.println("nombre: " + nit[p].getNombre1());
                            System.out.println("apellido: " + nit[p].getApellido1());
                            System.out.println("cedula: " + nit[p].getCedula1());

                        }
                    }
                    break;
            }
        } while (opcion != 6);

    }
    /*System.out.println("ensayo de repositorio");
        System.out.println("ensayo de actualización");
         System.out.println("ensayo 2 de actualización");
         System.out.println("ensayo 3 de actualización");
     */

}
