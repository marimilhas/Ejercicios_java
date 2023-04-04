package Ejercicio7;

public abstract class Descuento {
    private float valor_descuento;

    public float getValor_descuento() {
        return valor_descuento;
    }
    public void setValor_descuento(float valor_descuento) {
        this.valor_descuento = valor_descuento;
    }

    public abstract float obtener_valor_descuento(float valor_compra);
    public abstract float obtener_valor_compra_final(float valor_compra) throws ExcepcionPrecioCero;
}
