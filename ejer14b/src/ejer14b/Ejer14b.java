package ejer14b;

import java.util.Scanner;

public class Ejer14b {

    public static void main(String[] args) {
        // TODO code application logic here

        Figuras figura1 = new Figuras();
        Scanner lector1 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("por favor escriba una opcion:\n1. area del circulo.\n2. area del triangulo. \n3. area del cuadrado.\n3. area del cuadrado.\n4. area del rectangulo.\n5. salir.");
            opcion = lector1.nextInt();

            switch (opcion) {
                case 1:
                    figura1.circulo();
                    break;
                case 2:
                    figura1.triangulo();
                    break;
                case 3:
                    figura1.cuadrado();
                    break;
                case 4:
                    figura1.rectangulo();
                    break;
            }
        } while (opcion != 5);

    }
}
