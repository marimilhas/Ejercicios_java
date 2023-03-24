package org.example;
import lombok.Getter;
import lombok.Setter;

public class Persona {
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String apellido;
    @Setter @Getter
    private String fecha_nac;
}
