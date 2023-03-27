package Ejercicio6;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    private static void pausar(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Presione ENTER para iniciar su compra!");
        entrada.nextLine();
        System.out.println("Agregando productos al carrito...");
        pausar();
        System.out.println("\n↓ Ingrese los siguientes datos ↓");

        Persona cliente1 = new Persona("Ignacio","Sánchez");
        cliente1.fechanac = LocalDateTime.parse("2001-10-05T00:00" + ":00");

        Producto[] productos1 = new Producto[3];
        productos1[0] = new Producto("Jabón en polvo", "IN-0085", 40);
        productos1[1] = new Producto("Esponjas", "PDF-417", 10);
        productos1[2] = new Producto("Chocolates", "EAN-13", 100);

        Carrito carrito1 = new Carrito(cliente1, productos1);
        carrito1.setFechacompra(LocalDateTime.now());
        DescuentoFijo tope = new DescuentoFijo();
        tope.setValor_descuento(75);

        String tipo_descuento = Descuento.validar_descuento();
        carrito1.setDescuento(Descuento.crear_descuento(tipo_descuento, tope.getValor_descuento()));

        System.out.println("Cargando...");
        pausar();
        System.out.println("\nPrecio total del carrito: $" + carrito1.obtenerprecio());
    }
}