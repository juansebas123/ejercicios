
package ejer14;

import java.util.Scanner;//paquete

public class Ejer14 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        circulo circ = new circulo (); // cree un nuevo objeto
        double area, radio;
        
        System.out.println("digite el valor de radio");
        radio=lector.nextDouble();
        circ.setRadio(radio);
        circ.calcularArea();
        System.out.println("el valor del area es"+circ.getArea());
        
        
    }
    
}
