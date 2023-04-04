package Ejercicio7;
import java.util.List;
import java.time.LocalDateTime;

public class Carrito {
    private Persona cliente;
    private List<Producto> productos;
    private LocalDateTime fechacompra;
    private Descuento descuento;

    public Carrito(){}
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public void setFechacompra(LocalDateTime fechacompra) {
        this.fechacompra = fechacompra;
    }
    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
    public float obtenerprecio(){
        float precio = 0;
        for (Producto prod : productos){
            precio += prod.getPrecio();
        }
        return precio;
    }
    public float obtenerpreciofinal(float precio) throws ExcepcionPrecioCero, ExcepcionPrecioNegativo {
        if (precio == 0f){
            throw new ExcepcionPrecioCero();
        }
        float precio_final = descuento.obtener_valor_compra_final(precio);
        if (precio_final < 0f){
            throw new ExcepcionPrecioNegativo();
        }
        return precio_final;
    }
}