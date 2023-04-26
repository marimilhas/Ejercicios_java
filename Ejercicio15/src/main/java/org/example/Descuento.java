package org.example;

public class Descuento {
    private String tipo;
    private float cantidad;
    private int tope;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCantidad() {
        return cantidad;
    }
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getTope() {
        return tope;
    }
    public void setTope(int tope) {
        this.tope = tope;
    }
}
