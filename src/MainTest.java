import clases.Empleado;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Empleado> empleados= new ArrayList<>();
        empleados.add(new Empleado("carlos","luna",340000.0));
        System.out.println("numero de empleados  ------->"+empleados.get(0).getNumeroEmpleado());
        empleados.add(new Empleado("luis","garzon",330000.0));
        System.out.println("numero de empleados  ------->"+empleados.get(0).getNumeroEmpleado());
        System.out.println(empleados);
        empleados.get(0).setSalarioMes(empleados.get(0).getSalarioMes()+(empleados.get(0).getSalarioMes()*0.1));
        empleados.get(1).setSalarioMes(empleados.get(1).getSalarioMes()+(empleados.get(1).getSalarioMes()*0.1));
        System.out.println(empleados);
        

    }
}
