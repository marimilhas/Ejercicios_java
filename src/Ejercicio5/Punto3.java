package Ejercicio5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Punto3 {

    private static int validar_mayor(int menor, String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        int num = entrada.nextInt();
        while (num <= menor){
            System.out.println("ERROR! El valor ingresado debe ser mayor a " + menor + ", ingrese nuevamente:");
            num = entrada.nextInt();
        }
        return num;
    }
    private static String validar_letra(String letra1, String letra2, String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        String letra = entrada.nextLine();
        while (!letra.equals(letra1) && !letra.equals(letra2)){
            System.out.println("ERROR! El caracter ingresado debe ser " + letra1 + " o " + letra2 +
                    ", ingrese nuevamente:");
            letra = entrada.nextLine();
        }
        return letra;
    }
    private static Path validar_archivo(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        String ruta = entrada.nextLine();
        Path archivo = Paths.get(ruta);

        while (!Files.exists(archivo)){
            System.out.println("ERROR! El archivo no existe, ingrese nuevamente:");
            ruta = entrada.nextLine();
            archivo = Paths.get(ruta);
        }
        return archivo;
    }
    private static void escribir_archivo(String nombre){

    }
    private static void codificar(Path archivo_entrada, Path archivo_salida, int desplazo) throws IOException {
        for (String str : Files.readAllLines(archivo_entrada)){
            String codigo_cesar = "";
            for (int i = 0; i < str.length(); i++){
                int num_ascii = str.charAt(i);
                char caracter_ascii = (char) (num_ascii + desplazo);
                codigo_cesar += caracter_ascii;
            }
            Files.writeString(archivo_salida, codigo_cesar + "\r\n");
        }
    }
    private static void decodificar(Path archivo_entrada, Path archivo_salida, int desplazo) throws IOException {
        for (String str : Files.readAllLines(archivo_entrada)){
            String codigo_cesar = "";
            for (int i = 0; i < str.length(); i++){
                int num_ascii = str.charAt(i);
                char caracter_ascii = (char) (num_ascii - desplazo);
                codigo_cesar += caracter_ascii;
            }
            Files.writeString(archivo_salida, codigo_cesar + "\r\n");
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese los siguientes datos:");

        String operacion = validar_letra("C", "D", "Operación deseada (C - D):");
        int desplazo = validar_mayor(0, "Valor del desplazo (mayor a 0):");
        Path archivo_entrada = validar_archivo("Ruta de su archivo de entrada:");
        Path archivo_salida = validar_archivo("Ruta de su archivo de salida:");

        if (operacion.equals("C")){
            codificar(archivo_entrada, archivo_salida, desplazo);
            System.out.println("La codificación terminó correctamente!");
        } else{
            decodificar(archivo_entrada, archivo_salida, desplazo);
            System.out.println("La decodificación terminó correctamente!");
        }
    }
}