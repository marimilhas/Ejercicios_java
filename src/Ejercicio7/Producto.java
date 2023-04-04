package Ejercicio7;


public class Producto {
    private String nombre;
    private String codigo;
    private float precio;

    public Producto(String nombreprod,String codigoprod, float precioprod){
        this.nombre = nombreprod;
        this.precio = precioprod;
        this.codigo = codigoprod;
    }
    public float getPrecio() {
        return precio;
    }
}
