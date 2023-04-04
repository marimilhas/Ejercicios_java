package Ejercicio7;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws ExcepcionPrecioNegativo, ExcepcionPrecioCero {

        System.out.println("¡Bienvenido a supermercado Carrefour!");
        System.out.println("↓ Carrito de compra ↓");

        Persona cliente1 = new Persona();
        cliente1.setNombre("Ignacio");
        cliente1.setApellido("Sánchez");
        cliente1.setFechanac(LocalDateTime.parse("2001-10-05T00:00" + ":00"));

        Carrito carrito1 = new Carrito();
        carrito1.setCliente(cliente1);
        carrito1.setProductos(Funciones.cargar_carrito());
        carrito1.setFechacompra(LocalDateTime.now());

        if (carrito1.getProductos().size() > 0){
            System.out.println("Agregando productos al carrito...");
            Funciones.pausar();

            float precio = carrito1.obtenerprecio();
            if (precio != 0){
                DescuentoFijo tope = new DescuentoFijo();
                tope.setValor_descuento(75);    //ejemplo

                String tipo_descuento = Funciones.validar_descuento();
                carrito1.setDescuento(Funciones.crear_descuento(tipo_descuento, tope.getValor_descuento()));

                System.out.println("\nCargando...");
                Funciones.pausar();
            }

            try {
                float preciofinal = carrito1.obtenerpreciofinal(precio);
                System.out.println("\nPrecio total del carrito: $" + preciofinal);
            } catch (ExcepcionPrecioCero e1){
                System.out.println(e1.getMessage());
            } catch (ExcepcionPrecioNegativo e2){
                System.out.println(e2.getMessage());
            }
        }
        System.out.println("Gracias por usar nuestro servicio, hasta luego!");
    }
}