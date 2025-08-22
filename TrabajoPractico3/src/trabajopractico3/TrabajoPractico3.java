package trabajopractico3;

import java.time.Year;

public class TrabajoPractico3 {
    public static void main(String[] args) {
        System.out.println("========== 1) Registro de Estudiantes ==========");
        Estudiante e = new Estudiante("Enzo", "Leiva", "Programación 2", 9.5);
        e.mostrarInfo();
        e.subirCalificacion(1.0);
        e.mostrarInfo();
        e.bajarCalificacion(3.0);
        e.mostrarInfo();

        System.out.println("\n========== 2) Registro de Mascotas ==========");
        Mascota m = new Mascota("Teo", "Perro", 2);
        m.mostrarInfo();
        m.cumplirAnios();
        m.cumplirAnios();
        m.mostrarInfo();

        System.out.println("\n========== 3) Encapsulamiento – Libro ==========");
        Libro libro = new Libro("Programación en Java", "Enzo", 2026);
        libro.mostrarInfo();
        libro.setAnioPublicacion(2018);
        libro.mostrarInfo();

        System.out.println("\n========== 4) Gallinas en Granja Digital ==========");
        Gallina g1 = new Gallina("G-01", 10);
        Gallina g2 = new Gallina("G-02", 8);
        g1.envejecer(); g1.ponerHuevo(); g1.ponerHuevo();
        g2.ponerHuevo(); g2.envejecer(); g2.envejecer();
        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("\n========== 5) Simulación de Nave Espacial ==========");
        NaveEspacial nave = new NaveEspacial("Nave 1", 50, 100);
        nave.mostrarEstado();
        nave.despegar();
        nave.avanzar(60);        
        nave.recargarCombustible(40); 
        nave.avanzar(80);
        nave.mostrarEstado();
    }
}

// 1) Registro de Estudiantes
class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + ", Curso: " + curso + ", Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion = calificacion + puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion = calificacion - puntos;
    }
}

// 2) Registro de Mascotas
class Mascota {
    private String nombre;
    private String especie;
    private int edad; // en años

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = Math.max(0, edad);
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " (" + especie + ") – Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
    }
}

// 3) Encapsulamiento con la clase Libro
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    // Validación simple: entre 1440 (invención de la imprenta) y año actual
    public void setAnioPublicacion(int anio) {
        int anioActual = Year.now().getValue();
        if (anio < 1440 || anio > anioActual) {
            System.out.println("[Libro] Año inválido: " + anio + ". Debe estar entre 1440 y " + anioActual + ". Se mantiene el valor previo.");
            // si es el constructor y aún no había valor, por defecto actual
            if (this.anioPublicacion == 0) {
                this.anioPublicacion = anioActual;
            }
        } else {
            this.anioPublicacion = anio;
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: '" + titulo + "' de " + autor + ", Año: " + anioPublicacion);
    }
}

// 4) Gestión de Gallinas
class Gallina {
    private String idGallina;
    private int edad; //en meses
    private int huevosPuestos;

    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = Math.max(0, edadInicial);
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " – Edad: " + edad + " meses, Huevos puestos: " + huevosPuestos);
    }
}

// 5) Simulación de Nave Espacial
class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double maxCombustible;
    private boolean enVuelo;

    public NaveEspacial(String nombre, double combustibleInicial, double maxCombustible) {
        this.nombre = nombre;
        this.maxCombustible = Math.max(1, maxCombustible);
        this.combustible = validarCombustible(combustibleInicial, 0, this.maxCombustible);
        this.enVuelo = false;
    }

    public void despegar() {
        if (combustible <= 0) {
            System.out.println("[" + nombre + "] No hay combustible para despegar.");
            return;
        }
        enVuelo = true;
        System.out.println("[" + nombre + "] ¡Despegue exitoso!");
    }

    // Regla: consumir 1 unidad por unidad de distancia.
    public void avanzar(double distancia) {
        if (distancia <= 0) {
            System.out.println("[" + nombre + "] Distancia inválida.");
            return;
        }
        double requerido = distancia;
        if (combustible < requerido) {
            System.out.println("[" + nombre + "] Combustible insuficiente para avanzar " + distancia + ". Disponible: " + combustible);
            return;
        }
        combustible -= requerido;
        System.out.println("[" + nombre + "] Avanzó " + distancia + " unidades. Combustible restante: " + combustible);
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("[" + nombre + "] Cantidad inválida para recargar.");
            return;
        }
        double nuevo = combustible + cantidad;
        if (nuevo > maxCombustible) {
            combustible = maxCombustible;
            System.out.println("[" + nombre + "] Se recargó hasta el máximo (" + maxCombustible + "). Se descartó el excedente.");
        } else {
            combustible = nuevo;
            System.out.println("[" + nombre + "] Recarga exitosa. Combustible: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave '" + nombre + "' – Combustible: " + combustible + "/" + maxCombustible + ", En vuelo: " + enVuelo);
    }

    private double validarCombustible(double v, double min, double max) { return Math.max(min, Math.min(max, v)); }
}

