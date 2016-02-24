package pkg1.practica;

import java.math.BigInteger;
import java.util.Scanner;
import javax.swing.JOptionPane;


public final class Practica {

    int contUser = 0, cod = 1; //variable llevar control usuarios ingresados
    basedatos usuario[] = new basedatos[5]; //creando el arreglo de objetos 

    public Practica() { //constructor de la clase 

        String ax;
        int op = 0;

        do {
            ax = JOptionPane.showInputDialog(null, "ingrese la opcion\n"
                    + "1. Ingresar usuario\n"
                    + "2. Actualizar usuario\n"
                    + "3. Eliminar usuario\n"
                    + "4. Buscar usuario\n"
                    + "5. Salir");
            if (ax != null && !ax.equals("")) {
                op = Integer.parseInt(ax);

                switch (op) {
                    case 1:
                        ingresar();
                        break;
                    case 2:
                        mostrar();
                        break;
                    case 3:
                        eliminar();
                        break;
                    case 4:
                        buscar();
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No es una opción valida!!!");
                }
            }

        } while (op != 5);
    }

    public void ingresar() {

        BigInteger telefono;
        String nombre, apellido, fechanacimiento, direccion, areas;
        Double cedula;

        nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre: ");
        apellido = JOptionPane.showInputDialog(null, "Ingrese el Apellido: ");
        fechanacimiento = JOptionPane.showInputDialog(null, "Ingrese el fechanacimiento: ");
        cedula = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cedula: "));
        direccion = JOptionPane.showInputDialog(null, "Ingrese la direccion: ");
        telefono = new BigInteger(JOptionPane.showInputDialog(null, "Ingrese el Telefono: "));
        areas =JOptionPane.showInputDialog(null, "Ingrese el area favorita: ");

        basedatos temp = new basedatos();

        temp.setCod(cod);
        temp.setNombre(nombre);
        temp.setApellido(apellido);
        temp.setFechanacimiento(fechanacimiento);
        temp.setCedula(cedula);
        temp.setNombre(direccion);
        temp.setTelefono(telefono);
        temp.setNombre(areas);

        usuario[contUser] = temp;
        contUser++;
        cod++;
    }

    public void areas() {
        
        String ax, quimica;
        int op = 0;
         
        do {
            ax = JOptionPane.showInputDialog(null, "ingrese la area de interes\n"
                    + "1. quimica\n"
                    + "2. fisica\n"
                    + "3. tecnologia\n"
                    + "4. calculo\n"
                    + "5. programacion\n"
                    + "6. Salir");
            
            if (ax != null && !ax.equals("")) {
                op = Integer.parseInt(ax);
                basedatos temp = new basedatos();
                switch (op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "ingreso quimica");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "ingreso fisica");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "ingreso tecnologia");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "ingreso calculo");
                        break;
                     case 5:
                        JOptionPane.showMessageDialog(null, "ingreso programacion");
                        break;
                    case 6:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No es una opción valida!!!");
                }
            }

        } while (op != 6);
    }
    
    public void mostrar() {

        String ay = "";

        for (int i = 0; i < contUser; i++) {
            ay += "Codigo: " + usuario[i].getCod() + "\n"
                    + "Nombre: " + usuario[i].getNombre() + "\n"
                    + "Apellido: " + usuario[i].getApellido() + "\n"
                    + "fechanacimiento: " + usuario[i].getFechanacimiento() + "\n"
                    + "cedula: " + usuario[i].getCedula() + "n"
                    + "Telefono: " + usuario[i].getTelefono() + "\n"
                    + "Area: " + usuario[i].getAreas() + "\n";
        }
        JOptionPane.showMessageDialog(null, ay);
    }

    public void buscar() {

        String ax;
        int c;

        ax = JOptionPane.showInputDialog(null, "Digite el codigo a buscar");
        if (ax != null && !ax.equals("")) {
            c = Integer.parseInt(ax);
            ax = "";
            if (contUser != 0) {
                for (int i = 0; i < contUser; i++) {
                    if (usuario[i].getCod() == c) {
                        ax = "";
                        ax += "Codigo: " + usuario[i].getCod() + "n"
                                + "Nombre: " + usuario[i].getNombre() + "\n"
                                + "Apellido: " + usuario[i].getApellido() + "\n"
                                + "fechanacimiento: " + usuario[i].getFechanacimiento() + "\n"
                                + "cedula: " + usuario[i].getCedula() + "n"
                                + "Telefono: " + usuario[i].getTelefono() + "\n"
                                + "Area: " + usuario[i].getAreas() + "\n";
                        break;
                    } else {
                        ax = "No se ha encontrado el usuario :(";
                    }
                }
                JOptionPane.showMessageDialog(null, ax);
            }

        }
    }

    public void eliminar() {
        int c;
        basedatos alumTemp[] = new basedatos[contUser - 1];//creando un arreglo temporal con un campo menos

        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo del estudiante a eliminar: "));//pidiendo el codigo a eliminar
        if (c <= contUser) { //si el codigo a eliminar es menor o igual al contador de estudiantes

            for (int i = 0; i < contUser; i++) { 
                if (c == usuario[i].getCod()) {
                } else {
                    if (usuario[i].getCod() < c) {
                        alumTemp[i] = usuario[i];                     
                    }
                    if (usuario[i].getCod() > c) {
                        usuario[i].setCod(i);
                        alumTemp[i - 1] = usuario[i];
                    }
                }
            } 
            usuario = null;
            cod--;
            contUser--;                   
            usuario = new basedatos[5]; 
            System.arraycopy(alumTemp, 0, usuario, 0, alumTemp.length); 
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante a eliminar no existe !!!");
        }
    }

    public static void main(String[] args) {

        Practica w = new Practica(); 
        System.exit(0);
    }
}
