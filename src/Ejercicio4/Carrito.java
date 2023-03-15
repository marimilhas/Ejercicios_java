package Ejercicio4;
import java.time.LocalDateTime;

public class Carrito {
    public Persona cliente;
    public Producto[] productos;
    public LocalDateTime fechacompra;

    public Carrito(Persona clientecar, Producto[] productoscar){
        this.cliente = clientecar;
        this.productos = productoscar;
    }
    public float obtenerprecio(){
        float acumulador = 0;
        for (int i = 0; i < 3; i ++){
            acumulador += productos[i].precio;
        }
        return acumulador;
    }
}