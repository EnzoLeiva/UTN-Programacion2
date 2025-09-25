package Ejercicio1_Stock;

public class MainStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("P1", "Manzana", 500, 30, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P2", "Celular", 2000, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P3", "Camisa", 1500, 25, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P4", "Silla", 3000, 5, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P5", "Mesa", 2500, 8, CategoriaProducto.ELECTRONICA));

        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        System.out.println("\n=== BUSCAR P2 ===");
        Producto buscado = inventario.buscarProductoPorId("P2");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n=== FILTRAR ELECTRONICA ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        inventario.eliminarProducto("P1");
        System.out.println("\n=== LISTA TRAS ELIMINAR P1 ===");
        inventario.listarProductos();

        inventario.actualizarStock("P3", 50);
        System.out.println("\n=== STOCK ACTUALIZADO P3 ===");
        inventario.buscarProductoPorId("P3").mostrarInfo();
        System.out.println("\nTotal stock: " + inventario.obtenerTotalStock());
        System.out.println("\nProducto con mayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        System.out.println("\n=== PRODUCTOS ENTRE 1000 Y 3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\n=== CATEGORÍAS ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
