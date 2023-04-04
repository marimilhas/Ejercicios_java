package Ejercicio7;

public class ExcepcionPrecioNegativo extends Exception{
    public ExcepcionPrecioNegativo(){
        super("El monto con el descuento es negativo...");
    }
}
