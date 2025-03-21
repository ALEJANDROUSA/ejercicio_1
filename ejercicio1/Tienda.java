package ejercicio1;

import java.util.ArrayList;

import java.util.Scanner;
public class Tienda {
	private static ArrayList<Productos> productosDisponibles = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        productosDisponibles.add(new Productos(505, "Queso", new Tipo(true, 3), new Fecha(2025, 7, 13), 15000, 1));
        productosDisponibles.add(new Productos(506, "Brownies", new Tipo(true, 6), new Fecha(2025, 6, 8),2000, 5 ));
        productosDisponibles.add(new Productos(507, "X-Box", new Tipo(false, 18), new Fecha(2026,5,12), 25000, 1));

      
        mostrarProductos();
        buscarProducto();
    }

    public static void mostrarProductos() {
        System.out.println("\n Productos disponibles:");
        for (Productos p : productosDisponibles) {
            System.out.println(p);
        }
    }

    public static void buscarProducto() {
        System.out.print("\n Ingrese el código del producto que desea encontrar: ");
        int codigo = entrada.nextInt();

        boolean encontrado = false;
        for (Productos p : productosDisponibles) {
            if (p.getCodigo() == codigo) {
                System.out.println("Producto encontrado: " + p);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
