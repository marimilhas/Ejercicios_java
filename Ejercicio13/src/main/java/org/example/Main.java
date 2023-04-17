package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Presione ENTER para iniciar!");
        entrada.nextLine();

        Conexion conector = new Conexion();

        System.out.println("\nInsertando empleados nuevos...");
        conector.insertar_empleados();

        System.out.println("\nModificando nacionalidad de empleado...");
        conector.cambiar_nacionalidad();

        System.out.println("\nEliminando departamento...");
        conector.eliminar_departamento();

        System.out.println("\nCargando empleados del departamento \"logística\"...");
        conector.conocer_empleados_logistica();

        System.out.println("\nCargando departamentos ordenados alfabéticamente...");
        conector.mostrar_departamentos_alfabeticamente();
    }
}