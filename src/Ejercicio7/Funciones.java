package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funciones {
    public static void pausar(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static String validar_respuesta(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        String respuesta = entrada.nextLine();

        while (!respuesta.equals("S") && !respuesta.equals("N")){
            System.out.print("ERROR! El valor ingresado es incorrecto, ingrese nuevamente: ");
            respuesta = entrada.nextLine();
        }
        return respuesta;
    }
    public static String validar_descuento(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nTipo de descuento (F - P - PT): ");
        String tipo = entrada.nextLine();

        while (!tipo.equals("F") && !tipo.equals("P") && !tipo.equals("PT")){
            System.out.print("ERROR! El valor es incorrecto, ingrese nuevamente: ");
            tipo = entrada.nextLine();
        }
        return tipo;
    }
    public static Producto cargar_producto(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Código: ");
        String codigo = entrada.nextLine();
        System.out.print("Precio: ");
        float precio = Float.parseFloat(entrada.nextLine());
        return new Producto(nombre, codigo, precio);
    }
    public static List<Producto> cargar_carrito(){
        List<Producto> productos = new ArrayList<>();
        String respuesta = validar_respuesta("\n¿Desea cargar un producto? (S - N): ");
        int contador = 1;

        while (respuesta.equals("S")){
            System.out.println("Producto Nº" + contador);
            productos.add(cargar_producto());
            contador += 1;
            respuesta = validar_respuesta("\n¿Desea cargar otro producto? (S - N): ");
        }
        return productos;
    }
    public static void cargar_valor(String mensaje, Descuento descuento){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        descuento.setValor_descuento(entrada.nextFloat());
    }
    public static void cargar_valor_tope(float tope, Descuento descuento) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Porcentaje a descontar: ");
        float porcentaje = entrada.nextFloat();

        while (porcentaje > tope){
            System.out.print("ERROR! El descuento ingresado supera el " + tope + "%, ingrese nuevamente: ");
            porcentaje = entrada.nextFloat();
        }
        descuento.setValor_descuento(porcentaje);
    }
    public static Descuento crear_descuento(String tipo, float tope){
        Descuento descuento;
        if (tipo.equals("F")){
            descuento = new DescuentoFijo();
            cargar_valor("Valor a descontar: ", descuento);
        } else if (tipo.equals("P")) {
            descuento = new DescuentoPorcentaje();
            cargar_valor("Porcentaje a descontar: ", descuento);
        } else {
            descuento = new DescuentoPorcentajeTope();
            cargar_valor_tope(tope, descuento);
        }
        return descuento;
    }
}
