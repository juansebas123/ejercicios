
package ejer14;

public class circulo {
    
    private double area, radio;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void calcularArea (){
        area = radio * radio * 3.1415;
    }
}

