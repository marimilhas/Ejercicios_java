package org.example;
import java.sql.*;

public class Conexion {
    private void cargar_clase() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    public void insertar_empleados(){
        Statement sentencia = null;

        try {
            cargar_clase();
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net/primerprueba0704",
                    "marimilhas", "dbcursojava2023");
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(
                    "INSERT INTO empleado(dni, nombre, apellido, nacionalidad, departamento) VALUES \n" +
                    "(41567890, 'malena', 'ferreyra', 'chile', 'logística'),\n" +
                    "(28430654, 'natalia', 'gonzález', 'méxico', 'compras');");

        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }
    public void cambiar_nacionalidad(){
        Statement sentencia = null;

        try{
            cargar_clase();
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net/primerprueba0704",
                    "marimilhas", "dbcursojava2023");
            sentencia = conexion.createStatement();
            sentencia.executeUpdate("UPDATE empleado SET nacionalidad = 'bolivia' WHERE nombre = 'ignacio'");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }
    public void eliminar_departamento(){
        Statement sentencia = null;

        try{
            cargar_clase();
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net/primerprueba0704",
                    "marimilhas", "dbcursojava2023");
            sentencia = conexion.createStatement();
            sentencia.executeUpdate("DELETE FROM departamento WHERE nombre = 'ventas'");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }
    public void conocer_empleados_logistica(){
        Statement sentencia = null;
        ResultSet resultado = null;

        try{
            cargar_clase();
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net/primerprueba0704",
                    "marimilhas", "dbcursojava2023");
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM empleado WHERE departamento = 'logística'");

            while (resultado.next()){
                for (int i = 1; i <= resultado.getMetaData().getColumnCount(); i++){
                    System.out.print(resultado.getString(i) + "\t");
                }
                System.out.print("\n");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            if (resultado != null) {
                try {
                    resultado.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }
    public void mostrar_departamentos_alfabeticamente(){
        Statement sentencia = null;
        ResultSet resultado = null;

        try{
            cargar_clase();
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net/primerprueba0704",
                    "marimilhas", "dbcursojava2023");
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM departamento ORDER BY nombre");

            while (resultado.next()){
                for (int i = 1; i <= resultado.getMetaData().getColumnCount(); i++){
                    System.out.print(resultado.getString(i) + "\t");
                }
                System.out.print("\n");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            if (resultado != null) {
                try {
                    resultado.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }
}