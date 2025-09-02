package trabajopractico4;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(101, "Enzo Leiva", "Programador", 120000);
        Empleado emp2 = new Empleado("Rocio Peña", "QA");
        Empleado emp3 = new Empleado("Teo Nala", "Diseñador");

        emp1.actualizarSalario(10);
        emp2.actualizarSalario(5000); 
        emp3.actualizarSalario(15); 

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
