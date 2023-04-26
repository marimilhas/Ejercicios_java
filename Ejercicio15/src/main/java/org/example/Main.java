package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static Path validar_archivo(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        Path archivo = Paths.get(entrada.next());

        while (!Files.exists(archivo)){
            System.out.print("ERROR! El archivo no existe, ingrese nuevamente: ");
            archivo = Paths.get(entrada.next());
        }

        return archivo;
    }
    public static String validar_salida(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        String salida = entrada.next().toUpperCase();

        while (!salida.equals("JSON") && !salida.equals("XML")){
            System.out.print("ERROR! La opción es incorrecta, ingrese nuevamente: ");
            salida = entrada.next();
        }

        return salida;
    }
    public static Oferta obtener_oferta(String linea){
        String[] oferta = linea.split(";");
        String[] prod = oferta[0].split(",");
        String[] peso = prod[1].split("\\.");
        String[] desc = oferta[1].split(",");

        Producto producto = new Producto();
        producto.setNombre(prod[0]);
        producto.setPeso(new Object[]{Integer.parseInt(peso[0]), peso[1]});
        producto.setPrecio(Float.parseFloat(prod[2]));

        Descuento descuento = new Descuento();
        descuento.setTipo(desc[0]);
        descuento.setCantidad(Float.parseFloat(desc[1]));
        descuento.setTope(Integer.parseInt(desc[2]));

        return new Oferta(producto, descuento, oferta[2], oferta[3]);
    }
    public static void main(String[] args) throws IOException, JAXBException {
        Path archivo_ofertas = validar_archivo("Ruta del archivo con ofertas: "); //Sería --> .\\Ofertas.csv
        String salida = validar_salida("Tipo de salida (JSON - XML): ");
        ObjectMapper mapper = new ObjectMapper();

        if (salida.equals("JSON")){
            for (String linea : Files.readAllLines(archivo_ofertas)){
                Oferta oferta = obtener_oferta(linea);
                String  stringJson =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(oferta);
                System.out.println(stringJson);
            }
        } else {
            for (String linea : Files.readAllLines(archivo_ofertas)){
                Oferta oferta = obtener_oferta(linea);
                JAXBContext context = JAXBContext.newInstance(Oferta.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(oferta, System.out);
            }
        }
    }
}