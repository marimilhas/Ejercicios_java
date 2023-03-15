package Ejercicio4;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Persona cliente1 = new Persona("Ignacio","Sánchez");
        cliente1.fechanac = LocalDateTime.parse("2001-10-05T00:00" + ":00");

        Producto[] productos1 = new Producto[3];
        productos1[0] = new Producto("Jabón en polvo", "IN-0085", 40);
        productos1[1] = new Producto("Esponjas", "PDF-417", 10);
        productos1[2] = new Producto("Chocolates", "EAN-13", 100);

        Carrito carrito1 = new Carrito(cliente1, productos1);
        carrito1.fechacompra = LocalDateTime.now();

        float precio = carrito1.obtenerprecio();
        System.out.println("Precio total del carrito: $" + precio);
    }
}