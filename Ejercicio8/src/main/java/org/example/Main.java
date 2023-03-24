package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas a cargar: ");
        int cantidad = entrada.nextInt();

        Persona[] personas = new Persona[cantidad];
        Funciones.Cargar_personas(personas);

        System.out.println("\nListo! Desea listar a las personas? (S - N)");
        String respuesta = entrada.next();
        if (respuesta.equals("S")){
            Funciones.Listar_personas(personas);
        }

        System.out.println("\nGracias por usar nuestro servicio!");
    }
}