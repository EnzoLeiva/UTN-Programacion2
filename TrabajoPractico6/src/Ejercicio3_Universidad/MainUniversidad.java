package Ejercicio3_Universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P1", "Profesor 1", "Matemática");
        Profesor p2 = new Profesor("P2", "Profesor 2", "Programación");
        Profesor p3 = new Profesor("P3", "Profesor 3", "Fisica");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C1", "Curso 1");
        Curso c2 = new Curso("C2", "Curso 2");
        Curso c3 = new Curso("C3", "Curso 3");
        Curso c4 = new Curso("C4", "Curso 4");
        Curso c5 = new Curso("C5", "Curso 5");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P3");
        uni.asignarProfesorACurso("C4", "P2");

        System.out.println("=== CURSOS ===");
        uni.listarCursos();

        System.out.println("\n=== PROFESORES ===");
        uni.listarProfesores();

        System.out.println("\n=== CAMBIO PROFESOR C1 -> P2 ===");
        uni.asignarProfesorACurso("C1", "P2");
        uni.listarCursos();

        System.out.println("\n=== ELIMINAR CURSO C5 ===");
        uni.eliminarCurso("C5");
        uni.listarCursos();

        System.out.println("\n=== ELIMINAR PROFESOR P3 ===");
        uni.eliminarProfesor("P3");
        uni.listarCursos();
        uni.listarProfesores();
    }
}
