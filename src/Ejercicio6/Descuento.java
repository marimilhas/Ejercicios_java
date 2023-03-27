package Ejercicio6;

import java.util.Scanner;

public abstract class Descuento {
    private float valor_descuento;

    public float getValor_descuento() {
        return valor_descuento;
    }
    public void setValor_descuento(float valor_descuento) {
        this.valor_descuento = valor_descuento;
    }

    public abstract float obtener_valor_descuento(float valor_compra);
    public abstract float obtener_valor_compra_final(float valor_compra);

    public static String validar_descuento(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tipo de descuento (F - P - PT): ");
        String tipo = entrada.nextLine();

        while (!tipo.equals("F") && !tipo.equals("P") && !tipo.equals("PT")){
            System.out.print("ERROR! El valor es incorrecto, ingrese nuevamente: ");
            tipo = entrada.nextLine();
        }
        return tipo;
    }
    public void cargar_valor(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        this.valor_descuento = entrada.nextFloat();
    }
    public void cargar_valor_tope(float tope) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Porcentaje a descontar: ");
        float porcentaje = entrada.nextFloat();

        while (porcentaje > tope){
            System.out.print("ERROR! El porcentaje supera el " + tope +
                    "%, ingrese nuevamente: ");
            porcentaje = entrada.nextFloat();
        }
        this.valor_descuento = porcentaje;
    }
    public static Descuento crear_descuento(String tipo, float tope){
        Descuento descuento;
        if (tipo.equals("F")){
            descuento = new DescuentoFijo();
            descuento.cargar_valor("Valor a descontar: ");
        } else if (tipo.equals("P")) {
            descuento = new DescuentoPorcentaje();
            descuento.cargar_valor("Porcentaje a descontar: ");
        } else {
            descuento = new DescuentoPorcentajeTope();
            descuento.cargar_valor_tope(tope);
        }
        return descuento;
    }

}
