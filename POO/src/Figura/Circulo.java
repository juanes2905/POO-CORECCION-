package Figura;

public class Circulo extends Figuras {
    private float radio;
    private double pi=3.1416;

    public Circulo(float radio,double pi){
        this.radio=radio;
        this.pi=pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void calcularArea() {
        float area=0;
        area=(float) ((radio*radio)*3.1416);
        System.out.println("el radio del circulo es "+radio+" y su area es "+area);
    }

    
}
