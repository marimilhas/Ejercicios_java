package Ejercicio5;

import java.util.Scanner;

public class Funciones_pt1 {

    public static void ordenar_array_string(String[] array){
        for (int i = 1; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                int num1 = Integer.parseInt(array[i]);
                int num2 = Integer.parseInt(array[j]);
                if (array[0].equals("A")){
                    if (num1 > num2){
                        array[i] = String.valueOf(num2);
                        array[j] = String.valueOf(num1);
                    }
                } else if (array[0].equals("D")) {
                    if (num1 < num2){
                        array[i] = String.valueOf(num2);
                        array[j] = String.valueOf(num1);
                    }
                }
            }
        }
    }
    public static void ordenar_array_int(int[] array, String orden){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (orden.equals("A")){
                    if (array[i] > array[j]){
                        int temporal = array[i];
                        array[i] = array[j];
                        array[j] = temporal;
                    }
                } else if (orden.equals("D")) {
                    if (array[i] < array[j]){
                        int temporal = array[i];
                        array[i] = array[j];
                        array[j] = temporal;
                    }
                }
            }
        }
    }
    public static void mostrar_cartel(String orden){
        if (orden.equals("A")){
            System.out.print("Números ordenados en forma ascendente --> ");
        } else{
            System.out.print("Números ordenados en forma descendente --> ");
        }
    }
    public static int[] crear_array_numeros(int cantidad){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Número Nº" + (i + 1) + ":");
            int num = entrada.nextInt();
            numeros[i] = num;
        }
        return numeros;
    }
    public static void mostrar_array_string(String[] array){
        for (int i = 1; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void mostrar_array_int(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
