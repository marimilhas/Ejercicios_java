package Ejercicio5;
import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {

        //Punto a
        System.out.println("Punto a");
        if (args[0].equals("A") | args[0].equals("D")){
            Funciones_pt1.mostrar_cartel(args[0]);
            Funciones_pt1.ordenar_array_string(args);
            Funciones_pt1.mostrar_array_string(args);
        } else{
            System.out.println("El orden ingresado es incorrecto.");
        }

        //Punto b
        System.out.println("\n\nPunto b");
        System.out.println("Ingrese los siguientes datos!");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Orden (A-D):");
        String orden = entrada.next();

        if (orden.equals("A") | orden.equals("D")){
            int[] numeros_b = Funciones_pt1.crear_array_numeros(3);
            Funciones_pt1.mostrar_cartel(orden);
            Funciones_pt1.ordenar_array_int(numeros_b, orden);
            Funciones_pt1.mostrar_array_int(numeros_b);
        } else{
            System.out.println("El orden ingresado es incorrecto.");
        }

        //Punto c
        System.out.println("\n\nPunto c");

        if (args.length > 0){
            if (args[0].equals("A") | args[0].equals("D")){
                if (args.length > 1){
                    Funciones_pt1.mostrar_cartel(args[0]);
                    Funciones_pt1.ordenar_array_string(args);
                    Funciones_pt1.mostrar_array_string(args);
                } else{
                    int[] numeros_c = Funciones_pt1.crear_array_numeros(3);
                    Funciones_pt1.mostrar_cartel(orden);
                    Funciones_pt1.ordenar_array_int(numeros_c, orden);
                    Funciones_pt1.mostrar_array_int(numeros_c);
                }
            } else{
                System.out.println("El orden ingresado es incorrecto.");
            }
        } else{
            System.out.println("No ingresó ningún dato.");
        }
    }}