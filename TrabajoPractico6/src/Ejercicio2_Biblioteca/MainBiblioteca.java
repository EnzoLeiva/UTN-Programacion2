package Ejercicio2_Biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A1", "Autor 1", "Argentina");
        Autor a2 = new Autor("A2", "Autor 2", "Brasilera");
        Autor a3 = new Autor("A3", "Autor 3", "Colombiana");

        biblioteca.agregarLibro("ISBN1", "Libro 1", 1967, a1);
        biblioteca.agregarLibro("ISBN2", "Libro 2", 1997, a2);
        biblioteca.agregarLibro("ISBN3", "Libro 3", 1963, a3);
        biblioteca.agregarLibro("ISBN4", "Libro 4", 1998, a2);
        biblioteca.agregarLibro("ISBN5", "Libro 5", 1961, a1);

        System.out.println("=== LISTA DE LIBROS ===");
        biblioteca.listarLibros();

        System.out.println("\n=== BUSCAR ISBN2 ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN2");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n=== LIBROS DE 1997 ===");
        biblioteca.filtrarLibrosPorAnio(1997);

        biblioteca.eliminarLibro("ISBN3");
        System.out.println("\n=== LISTA TRAS ELIMINAR RAYUELA ===");
        biblioteca.listarLibros();

        System.out.println("\nCantidad de libros: " + biblioteca.obtenerCantidadLibros());

        biblioteca.mostrarAutoresDisponibles();
    }
}
