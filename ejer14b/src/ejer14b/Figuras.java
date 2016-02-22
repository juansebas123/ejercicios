package ejer14b;

import java.util.Scanner;

public class Figuras {

    private Scanner lector;
    private double area, valor1, valor2;

    public void circulo() {
        lector = new Scanner(System.in);
        System.out.println("ingrese el valor del radio: ");
        valor1 = lector.nextDouble();
        area = 3.1416 * valor1 * valor1;
        System.out.println("el area del circulo es: " + area);
    }

    public void triangulo() {

        lector = new Scanner(System.in);
        System.out.println("ingrese el valor de la base: ");
        valor1 = lector.nextDouble();
        System.out.println("ingrese el valor de la altura: ");
        valor2 = lector.nextDouble();
        area = valor1 * valor2 / 2;
        System.out.println("el area del triangulo es: " + area);
    }

    public void cuadrado() {

        lector = new Scanner(System.in);
        System.out.println("ingrese el valor del lado: ");
        valor1 = lector.nextDouble();
        area = valor1 * valor1;
        System.out.println("el area del cuadrado es: " + area);
    }

    public void rectangulo() {

        lector = new Scanner(System.in);
        System.out.println("ingrese el valor de un lado: ");
        valor1 = lector.nextDouble();
        System.out.println("ingrese el valor del otro lado: ");
        valor2 = lector.nextDouble();
        area = valor1 * valor1;
        System.out.println("el area del rectangulo es: " + area);
    }
}
