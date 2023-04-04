package Ejercicio7;
import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    public String apellido;
    public LocalDateTime fechanac;

    public Persona(){}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechanac(LocalDateTime fechanac) {
        this.fechanac = fechanac;
    }
}