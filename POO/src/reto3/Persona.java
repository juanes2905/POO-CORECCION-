
package reto3;
import java.util.*;

public class Persona {
    
    
    
    //atributos
    public static String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public int edad;
    public int peso;
    public double estatura;
    public String sexo;
    public double suma;
    public double estatura2;
    //metodos
    public class Empleado extends Persona{
        public Empleado(String cargo, int valorHora, int horasTrabajadas, String departamento){
            super();
            this.documento = documento;
        }
}
    
    public static String getTipoDocumento(){ 
      return tipoDoc;
    }
    public int documento(){
        return documento;
    }
    public String nombre(){
        return nombre;
    }
    public String apellido(){
        return apellido;
    }
    public void setTipoDocumento(String tipoDocumento){
        this.tipoDoc = tipoDoc;
    }
    
    
    public void mostrarDatos(){
        System.out.println("El tipo de documento es: \n "+ tipoDoc);
        System.out.println("El numero de documento es: \n "+ documento);
        System.out.println("Su nombre es: \n "+ nombre);
        System.out.println("Su apellido es: \n  "+ apellido);
        System.out.println("Su peso es: \n  "+ peso +"kg");
        System.out.println("Su estatura es: \n "+ estatura);
        System.out.println("Su edad es: \n "+ edad);
        System.out.println("Su sexo  es: \n "+ sexo);
        

       
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
               
                if (edad >= 18){
                    System.out.println("Usted es mayor de edad"+ edad);
                } else if (edad < 18){
                    System.out.println("usted es aun menor de edad "+ edad);
                }
    }
    
}
