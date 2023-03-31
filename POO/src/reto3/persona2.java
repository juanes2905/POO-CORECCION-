package reto3;
import java.util.*;

public class persona2 {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int peso;
    private int estatura;
    private int edad;
    private String sexo;

    int esta2;
    int resultado;

    public persona2() {
    }
    
    public persona2(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,int edad,String sexo){
        
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc){
        this.tipoDoc=tipoDoc;
    }
    public int getDocumento(){
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getEstatura() {
        return estatura;
    }
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

public void mostrarImc(){
    // aqui se hace la operacion para calcular
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
    }

public void registrarPersona() {
    Scanner capturar=new Scanner(System.in);


    System.out.print("Escriba el tipo de su documento: \n ");
    tipoDoc = capturar.next();
    System.out.print("Escriba numero de su documento: \n ");
    documento = capturar.nextInt();
    System.out.print("Escriba su nombre : \n ");
    nombre = capturar.next();
    System.out.print("Escriba su apellido: \n ");
    apellido = capturar.next();
    System.out.print("Escriba su peso :\n");
    peso = capturar.nextInt();
    System.out.print("Escriba su estatura :\n");
    estatura = capturar.nextInt();
    System.out.print("Escriba su edad :\n");
    edad = capturar.nextInt();
    System.out.print("Escriba su sexo :\n");
    sexo = capturar.next();
}

public void mostrarPersona(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,int edad,String sexo) {
    System.out.println("El tipo de documento es: \n "+ tipoDoc);
        System.out.println("El numero de documento es: \n "+ documento);
        System.out.println("Su nombre es: \n "+ nombre);
        System.out.println("Su apellido es: \n  "+ apellido);
        System.out.println("Su peso es: \n  "+ peso +"kg");
        System.out.println("Su estatura es: \n "+ estatura);
        System.out.println("Su edad es: \n "+ edad);
        System.out.println("Su sexo  es: \n "+ sexo);
} 

    
}


