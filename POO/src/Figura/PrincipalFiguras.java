package Figura;

import java.util.Scanner;

public class PrincipalFiguras {
    public static void main(String[] args) {
        float lado,base,altura,radio;
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite el valor del lado del cuadrado");
        lado=capturar.nextFloat();

        Cuadrado cua1=new Cuadrado(lado);
        cua1.calcularArea();
        

        System.out.println("digite el valor de la base del rectangulo");
        base=capturar.nextFloat();
        System.out.println("digite el valor de la altura ");
        altura=capturar.nextFloat();

        Rectangulo rec1=new Rectangulo(base, altura);
        rec1.calcularArea();

        System.out.println("digite el valor de la base del triangulo");
        base=capturar.nextFloat();
        System.out.println("digite el valor de la altura ");
        altura=capturar.nextFloat();

        Triangulo tri1=new Triangulo(base, altura);
        tri1.calcularArea();

        System.out.println("digite el valor del radio del circulo");
        radio=capturar.nextFloat();

        Circulo cir1=new Circulo(radio, radio);
        cir1.calcularArea();

        capturar.close();
    }

}
