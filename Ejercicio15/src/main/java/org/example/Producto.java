package org.example;

public class Producto {
    private String nombre;
    private Object[] peso;
    private float precio;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getPeso() {
        return peso;
    }
    public void setPeso(Object[] peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
