package reto3;

import java.util.Scanner;


public class inicio {
    public static void main(String[] args) {
        persona2 Ar =new persona2();
        // atributos 
        String tipoDoc;// atributos por defecto 
        int documento;// atributos por defecto 
        String nombre;// atributos por defecto 
        String apellido;// atributos por defecto 
        int peso;// atributos por defecto 
        int estatura;// atributos por defecto 
        int edad;// atributos por defecto 
        String sexo;// atributos por defecto 
        String nombreE;// atributos por defecto 
        String apellidoE;// atributos por defecto 
        int documentoE;// atributos por defecto 
        String tipoDocE;// atributos por defecto 
        String cargo;// atributos por defecto 
        int valorHora;// atributos por defecto 
        int horasTrabajadas;// atributos por defecto 
        String departamento;// atributos por defecto 
        int totala;// atributos por defecto 

        Scanner capturar=new Scanner(System.in);
        //----//
        System.out.println("escriba su nombre");
        nombre=capturar.next();
        System.out.println("escriba su apellido");
        apellido=capturar.next();
        System.out.println("ingrese su documento");
        documento=capturar.nextInt();
        System.out.println("escriba el tipo de documento");
        tipoDoc=capturar.next();
        System.out.println("escriba su sexo ");
        sexo=capturar.next(); 
        System.out.println("escriba su peso");
        peso=capturar.nextInt();
        System.out.println("escriba su estatura");
        estatura=capturar.nextInt();

   
        
        Ar.setNombre(nombre);
        Ar.setApellido(apellido);
        Ar.setDocumento(documento);
        Ar.setTipoDoc(tipoDoc);
        Ar.setSexo(sexo);
        Ar.setPeso(peso);
        Ar.setEstatura(estatura);

        System.out.println("el nombre es:"+Ar.getNombre());
        System.out.println("el apellido es:"+Ar.getApellido());
        System.out.println("el documento es:"+Ar.getDocumento());
        System.out.println("el tipo de documento es:"+Ar.getTipoDoc());
        System.out.println("el sexo es:"+Ar.getSexo());
        System.out.println("el peso es:"+Ar.getPeso());
        System.out.println("el estatura es:"+Ar.getEstatura());

      

       
        Ar.mostrarImc();

        empleado emp=new empleado(Ar.getTipoDoc(),Ar.getDocumento(),Ar.getApellido(),Ar.getNombre(),Ar.getEdad(),Ar.getEstatura(),Ar.getPeso(),Ar.getSexo());
        
        System.out.println("Digite el nombre del empleado");
        nombreE=capturar.next();

        System.out.println("escriba el apellido del empleado");
        apellidoE=capturar.next();
        System.out.println("escriba el documento del empleado");
        documentoE=capturar.nextInt();
        System.out.println("escriba el tipo de documento");
        tipoDocE=capturar.next();
        System.out.println("escriba el cargo del empleado");
        cargo=capturar.next();
        System.out.println("escriba las horas trabajadas del empleado");
        horasTrabajadas=capturar.nextInt();
        System.out.println("escriba el valor de hora trabajada del empleado");
        valorHora=capturar.nextInt();

        emp.setCargo(cargo);
        emp.setNombre(nombreE);
        emp.setApellido(apellidoE);
        emp.setDocumento(documentoE);
        emp.setTipoDoc(tipoDocE);
        emp.setValorHora(valorHora);
        emp.setHorasTrabajadas(horasTrabajadas);

        System.out.println("aqui esta el cargo del empleado:"+emp.getCargo()+","+emp.getNombre()+","+emp.getApellido()+","+emp.getDocumento()+","+emp.getTipoDoc()+","+emp.getValorHora()+","+emp.getHorasTrabajadas());
        emp.calcularHonorarios();
        emp.mostrarHonorarios();
        
        capturar.close();
    }
}
