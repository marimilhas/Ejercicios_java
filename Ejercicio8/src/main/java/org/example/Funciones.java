package org.example;

import java.util.Scanner;

public class Funciones {
    public static void Cargar_personas(Persona[] personas){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < personas.length; i++){

            Persona una_persona = new Persona();
            System.out.println("\nPersona Nº" + (i + 1) + ": ");
            System.out.println("Nombre: ");
            una_persona.setNombre(entrada.next());
            System.out.println("Apellido: ");
            una_persona.setApellido(entrada.next());
            System.out.println("Fecha de nacimiento: ");
            una_persona.setFecha_nac(entrada.next());

            personas[i] = una_persona;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void Listar_personas(Persona[] personas){
        int contador = 0;
        for (Persona i : personas){
            System.out.println("\nPersona Nº" + (contador += 1) + ":");
            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Apellido: " + i.getApellido());
            System.out.println("Fecha de nacimiento: " + i.getFecha_nac());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
