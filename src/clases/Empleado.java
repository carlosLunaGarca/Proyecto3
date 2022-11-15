package clases;

public class Empleado {
    private String Nombre;
    private String apellido;
    private double salarioMes;
    private static Integer numeroEmpleado=0;

    public Empleado(String nombre, String apellido, Double salarioMes) {
        Nombre = nombre;
        this.apellido = apellido;
        this.salarioMes = salarioMes;
        numeroEmpleado++;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(Double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public static Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salarioMes=" + salarioMes +
                '}';
    }
}
