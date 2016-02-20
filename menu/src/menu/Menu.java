package menu;

import java.util.Scanner;//paquete

public class Menu {

    public static void main(String[] args) {

        int opcion;
        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("digite una opcion");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. raiz cuadrada");
            System.out.println("6. salir");
            opcion = lector.nextInt();
            
            switch (opcion){
                case 1: 
                    
                    break;
                case 2:
                        break;
                case 3:
                    break;
            }
            
        } while (opcion!=6);
            
    }
}
