package Clase9;
public class Trabajador {

    private String nombre;
    private String Cedula;
    private double salario;

    public Trabajador(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.Cedula = cedula;
        this.salario = salario;
    }

    public String getCedula() {
        return "";
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return "Trabajador { Cedula: "+ Cedula +
                ", Nombre: '" + nombre + '\'' +
                ", Salario: " + salario +
                " }";
    }

    public double pagar(double incremento){
        return salario + (salario * incremento);
    }



}