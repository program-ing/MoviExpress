/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipiloto.edu.co.conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Usuario
 */
public class ConexionSQLite 
{
    private Connection conexion;
    public ConexionSQLite()
    {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setCrearBD()
    {
        try
        {
            // CREAR ENUNCIADO
             Statement enunciado;
             enunciado = conexion.createStatement();
             enunciado.execute(Utilidades.CREAR_TABLA_CLIENTE);
             enunciado.execute(Utilidades.CREAR_TABLA_FACTURA);
             enunciado.execute(Utilidades.CREAR_TABLA_PRODUCTO);
             enunciado.execute(Utilidades.CREAR_TABLA_SOCIO);
             enunciado.execute(Utilidades.CREAR_TABLA_ENVIO);
             enunciado.execute(Utilidades.CREAR_TABLA_VEHICULO);
             enunciado.execute(Utilidades.CREAR_TABLA_TIENDA);
             
        }
        catch(Exception e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }
        
    }
    public void setBorrarBD()
    {
        try
        {
            // CREAR ENUNCIADO
            Statement enunciado;
            enunciado = conexion.createStatement();
             // CREAR UNA TABLA NUEVA, LA BORRA SI EXISTE
             enunciado.execute("DROP TABLE IF EXISTS "+Utilidades.TABLA_CLIENTE);
             enunciado.execute("DROP TABLE IF EXISTS "+Utilidades.TABLA_FACTURA);
             enunciado.execute("DROP TABLE IF EXISTS "+Utilidades.TABLA_PRODUCTO);
             enunciado.execute("DROP TABLE IF EXISTS "+Utilidades.TABLA_SOCIO);
             enunciado.execute("DROP TABLE IF EXISTS "+Utilidades.TABLA_ENVIO);
             enunciado.execute("DROP TABLE IF EXISTS "+Utilidades.TABLA_VEHICULO);
             enunciado.execute("DROP TABLE IF EXISTS "+Utilidades.TABLA_TIENDA);
             
        }
        catch(Exception e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    /*public void setConexion() throws ClassNotFoundException
    {

        try 
        {
             // ESTABLECER LA CONEXIÓN
             conexion = DriverManager.getConnection("jdbc:sqlite:"+Utilidades.DATABASE_NAME);

        } catch (Exception e) 
        {
            System.out.println("ERROR: " + e.getMessage());
        }
    }*/
    
    public Connection getConexion() throws ClassNotFoundException
    {

        try 
        {
             // ESTABLECER LA CONEXIÓN
             //conexion = (Connection)DriverManager.getConnection("jdbc:sqlite:"+Utilidades.DATABASE_NAME);
            conexion = (Connection)DriverManager.getConnection("jdbc:sqlite:C:/Users/Hernan Ramirez/Favorites/Documents/NetBeansProjects/MoviExpress/"+Utilidades.DATABASE_NAME);

        } catch (Exception e) 
        {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        return conexion;
    }
}
