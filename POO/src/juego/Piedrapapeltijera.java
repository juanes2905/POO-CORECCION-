package Juego;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera implements Juego {
    private String nomJugador;
    private int maquina;
    private int eleccion;

    Scanner capturar=new Scanner(System.in);
    public void iniciar() {
        System.out.println("digite su nombre ");
        nomJugador=capturar.next();
    }

    public void jugar() {
        System.out.println(nomJugador+" digite su eleccion \n1.piedra \n2.tijera \n3.papel");
        eleccion=capturar.nextInt();
        Random aleatorio=new Random();
        maquina=aleatorio.nextInt(3)+1;
        System.out.println("piedra,papel o tijera");
        System.out.println("la maquina saca "+maquina);
    }

    public void finalizar() {
        if (maquina==eleccion) {
            System.out.println("hay un empate");
        }
        else if (maquina==1 && eleccion==2) {
            System.out.println("la maquina gana");
        }else if (maquina==2 && eleccion==3) {
            System.out.println("la maquina gana");
        }else if(maquina==3 && eleccion==1){
            System.out.println("la maquina gana");
        }else{
            System.out.println("usted gana");
        }
    }
}
