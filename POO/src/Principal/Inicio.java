package Principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
    // crear un objeto -> Instancia de una clase
    Persona registro = new Persona();
        registro.pedirDatosp();
        registro.mostrarPersonap();
        registro.calcularmcp();
        registro.mayorEdadp();
    }
}
