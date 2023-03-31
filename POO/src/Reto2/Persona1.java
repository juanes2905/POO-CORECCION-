package Reto2;

import java.util.Scanner;

public class Persona1 {
    // Atributos 
    public String nombrep ; // se creo un atributo con visibilidad publica 
    public String apellidop;// se creo un atributo con visibilidad publica 
    public int documentop ;// se creo un atributo con visibilidad publica 
    public static String tipoDoc ;// se creo un atributo con visibilidad publica 
    public  int peso ;// se creo un atributo con visibilidad publica 
    public int estatura ;// se creo un atributo con visibilidad publica 
    public int edad ;// se creo un atributo con visibilidad publica 
    public String sexo ;// se creo un atributo con visibilidad publica 
    public int pesoActual=0;// se creo un atributo con visibilidad publica 
   //Metodos
   

   public void pedirDatosp(){
       Scanner capturar = new Scanner (System.in);
       System.out.print("Escriba el tipo de su documento: \n ");
       tipoDoc = capturar.next();
       System.out.print("Escriba numero de su documento: \n ");
       documentop = capturar.nextInt();
       System.out.print("Escriba su nombre : \n ");
       nombrep = capturar.next();
       System.out.print("Escriba su apellido: \n ");
       apellidop = capturar.next();
       System.out.print("Escriba su peso :\n");
       peso = capturar.nextInt();
       System.out.print("Escriba su estatura :\n");
       estatura = capturar.nextInt();
       System.out.print("Escriba su edad :\n");
       edad = capturar.nextInt();
       System.out.print("Escriba su sexo :\n");
       sexo = capturar.next();
       capturar.close();
   } 
   public void mostrarPersonap (){
       System.out.println("El tipo de documento es: \n "+ tipoDoc);
       System.out.println("El numero de documento es: \n "+ documentop);
       System.out.println("Su nombre es: \n "+ nombrep);
       System.out.println("Su apellido es: \n  "+ apellidop);
       System.out.println("Su peso es: \n  "+ peso +"kg");
       System.out.println("Su estatura es: \n "+ estatura);
       System.out.println("Su edad es: \n "+ edad);
       System.out.println("Su sexo  es: \n "+ sexo);
       
   }
   //metodo con parametros 
   public double calcularmcp(){
    double pesoActual=  peso/(estatura*estatura);
       if (pesoActual<20){
          System.out.println("el peso está por debajo de lo ideal"+pesoActual);
          
          
       }
       else if (pesoActual>=20||pesoActual<=25){
          System.out.println("el peso es ideal"+pesoActual);
          
       }
       else if (pesoActual>25){
       System.out.println("Usted tiene sobrepeso" + pesoActual);
          
       }
       return pesoActual;
       }

   public void mayorEdadp (){
       if (edad >= 18){
           System.out.println("Usted es mayor de edad"+ edad);
       } else if (edad < 18){
           System.out.println("usted es aun menor de edad "+ edad);
       }

   }
}
