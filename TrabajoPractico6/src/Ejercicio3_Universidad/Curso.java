package Ejercicio3_Universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevo) {
        if (this.profesor == nuevo) return;

        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        this.profesor = nuevo;

        if (nuevo != null && !nuevo.getCursos().contains(this)) {
            nuevo.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + codigo + " - " + nombre +
            " | Profesor: " + (profesor != null ? profesor.getNombre() : "SIN PROFESOR"));
    }
}
