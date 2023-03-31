package reto3;

public class empleado extends persona2 {
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    private float total;
    private float totala;

    public empleado(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,int edad,String sexo){
        super(tipoDoc,documento,nombre,apellido,peso,estatura,edad,sexo);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
    }

    public void calcularHonorarios() {
        total=valorHora*horasTrabajadas;
        totala=(float) (total-0.966);
    }
    public void mostrarHonorarios() {
        System.out.println("estos son los horarios que maneja: "+totala);
    }
    public void mostrarEmpleado() {
        System.out.println("estos son los datos del empleado:_"+getTipoDoc()+","+getDocumento()+","+getNombre()+","+getApellido()+","+getPeso()+","+getEstatura()+","+getEdad()+","+getSexo());
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getTotal2() {
        return totala;
    }

    public void setTotal2(float totala) {
        this.total = totala;
    }
}
