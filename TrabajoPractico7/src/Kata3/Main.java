package Kata3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Enzo", 1200));
        empleados.add(new EmpleadoTemporal("Leiva", 40, 10));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " cobra: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Es empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Es empleado temporal");
            }
        }
    }
}
