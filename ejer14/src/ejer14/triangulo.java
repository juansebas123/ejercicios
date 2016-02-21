
package ejer14;

import java.util.Scanner;//paquete

public class triangulo {

    private double area, valor1, valor2;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public void calcularArea() {
        area = (valor1 * valor2) / 2;
    }
}
