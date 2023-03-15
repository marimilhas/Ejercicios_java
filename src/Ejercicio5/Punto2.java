package Ejercicio5;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Punto2 {
    private static int operar_archivo(Path archivo, String operacion) throws IOException {
        int resultado = 0;
        if (operacion.equals("S")){
            for (String linea : Files.readAllLines(archivo)){
                resultado += Integer.parseInt(linea);
            }
        } else{
            resultado = 1;
            for (String linea : Files.readAllLines(archivo)){
                resultado *= Integer.parseInt(linea);
            }
        }
        return resultado;
    }
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la ruta de su archivo:");
        String ruta = entrada.nextLine();
        Path archivo = Paths.get(ruta);

        if (Files.exists(archivo)){
            System.out.println("Ingrese la operación deseada (S - M):");
            String operacion = entrada.nextLine();

            if (operacion.equals("S") | operacion.equals("M")){
                int resultado = operar_archivo(archivo, operacion);
                if (operacion.equals("S")){
                    System.out.println("La suma es igual a " + resultado);
                } else{
                    System.out.println("La multiplicación es igual a " + resultado);
                }
            } else{
                System.out.println("La operación ingresada es incorrecta.");
            }

        } else {
            System.out.println("El archivo no existe.");
        }
    }
}