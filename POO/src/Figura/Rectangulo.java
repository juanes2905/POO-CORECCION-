package Figura;

public class Rectangulo extends Figuras {
    private float base;
    private float altura;

    public Rectangulo(float base,float altura){
        this.altura=altura;
        this.base=base;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        float area=0;
        area=base*altura;
        System.out.println("La base del rectangulo es "+base+" su altura es "+altura +" y su area es "+area);
    }


}
