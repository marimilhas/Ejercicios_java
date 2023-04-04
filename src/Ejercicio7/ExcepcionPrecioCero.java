package Ejercicio7;

public class ExcepcionPrecioCero extends Exception{
    public ExcepcionPrecioCero(){
        super("\nNo se puede aplicar descuentos a carritos de valor nulo...");
    }
}
