/*14. Implemente un programa utilizando clases que permite calcular el área de las siguientes
figuras trigonométricas: círculo, triangulo, cuadro y rectángulo. El programa debe visualizar
un menú para que el usuario seleccione la figura deseada, al entrar en dicho menú se solicitan
los datos necesarios al usuario para ejecutar el cálculo, después de esto debe volver al menú
inicial.*/
package ejer14;

import java.util.Scanner;//paquete

public class Ejer14 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        circulo circ = new circulo(); // cree un nuevo objeto
        triangulo trian = new triangulo();
        double area, radio, valor1, valor2;
        int opcion;

        do {
            System.out.println("por favor escriba una opcion:");
            System.out.println("1. area del circulo");
            System.out.println("2. area del triangulo");
            System.out.println("3. area del cuadrado");
            System.out.println("4. area del rectangulo");
            System.out.println("5. salir");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("digite el valor de radio");
                    radio = lector.nextDouble();
                    circ.setRadio(radio);
                    circ.calcularArea();
                    System.out.println("el valor del area es" + circ.getArea());
                    break;
                case 2:
                    System.out.println("ingrese el valor de la base:");
                    valor1 = lector.nextDouble();
                    trian.setValor1(valor1);
                    System.out.println("ingrese el valor de la altura: ");
                    valor2 = lector.nextDouble();
                    trian.setValor2(valor2);
                    trian.calcularArea();
                    System.out.println("el valor del area es" + trian.getArea());
                    break;
 
                case 3:

                    break;
                case 4:

                    break;
            }
        } while (opcion != 5);

    }

}
