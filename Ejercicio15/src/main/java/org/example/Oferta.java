package org.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Oferta {
    private Producto producto;
    private Descuento descuento;
    private String fechaDesde;
    private String fechaHasta;

    public Oferta(Producto prod, Descuento desc, String fechainicial, String fechafin){
        this.producto = prod;
        this.descuento = desc;
        this.fechaDesde = fechainicial;
        this.fechaHasta = fechafin;
    }

    public Oferta() {
    }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Descuento getDescuento() {
        return descuento;
    }
    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }
    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }
    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
}
