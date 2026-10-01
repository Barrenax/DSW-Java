import java.util.Scanner;

public class ProductosPrecio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String listado = "";
        double total = 0;

        System.out.print("Producto (escribe Fin para terminar): ");
        String producto = sc.nextLine();

        while (!producto.toLowerCase().equals("fin")) {
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();

            listado = listado + producto + ": " + precio + " euros\n";
            total = total + precio;

            System.out.print("Producto (escribe Fin para terminar): ");
            producto = sc.nextLine();
        }

        System.out.println("Productos comprados:");
        System.out.println(listado);
        System.out.println("Total: " + total + " euros");

        sc.close();
    }
}