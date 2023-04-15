import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Ejercicio14 {
    public static Pattern[] cargar_expresiones_regulares(Path archivo) throws IOException {
        Pattern[] er = new Pattern[3];
        int i = 0;
        for (String linea : Files.readAllLines(archivo)){
            er[i] = Pattern.compile(linea);
            i += 1;
        }
        return er;
    }
    public static void validar_linea(String linea, Pattern[] er){
        System.out.println(linea);
        System.out.print("Cumple con las expresiones regulares: ");
        String[] linea_array = linea.split(";");
        boolean no_cumple_ninguna = true;
        for (int i = 0; i < linea_array.length; i++){
            if (er[i].matcher(linea_array[i]).matches()){
                System.out.print((i + 1) + " ");
                no_cumple_ninguna = false;
            }
        }
        if (no_cumple_ninguna){
            System.out.print("ninguna");
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("VALIDACIÓN DE DATOS DE ESTUDIANTES DE LA UTN FRC\n");

        Path archivo_er = Paths.get(".\\Expresiones_Regulares.txt");
        Path archivo_cad = Paths.get(".\\Cadenas_de_texto.txt");
        Pattern[] expresiones_regulares = cargar_expresiones_regulares(archivo_er);

        for (String linea : Files.readAllLines(archivo_cad)){
            validar_linea(linea, expresiones_regulares);
            System.out.println("\n");
        }
    }
}
