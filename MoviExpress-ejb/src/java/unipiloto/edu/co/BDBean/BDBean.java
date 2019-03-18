/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipiloto.edu.co.BDBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ejb.Stateless;
import unipiloto.edu.co.conexionSQL.ConexionSQLite;
import unipiloto.edu.co.conexionSQL.Utilidades;

/**
 *
 * @author Usuario
 */
@Stateless
public class BDBean implements BDBeanLocal 
{

    private ConexionSQLite con = new ConexionSQLite();
    @Override
    public void setCrearbd() 
    {
        try 
        {
         
            con.getConexion();
            //con.setCrearBD();
            //setInsertar();
            //System.out.println("Hola");
            setConsulta();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void setInsertar() 
    {
        Statement enunciado;
		try 
		{
			enunciado = con.getConexion().createStatement();
			enunciado.execute("INSERT INTO "+Utilidades.TABLA_ENVIO+" (id_envio, id_factura_envio, id_socio_envio) values (25, 21, 30)");
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void setConsulta() 
    {
        Statement enunciado;
		try
		{
			enunciado = con.getConexion().createStatement();
			// CONSULTA DATOS
			   ResultSet resultados;
			   resultados = enunciado.executeQuery("SELECT * FROM "+Utilidades.TABLA_ENVIO);

			   // PROCESAR EL RESULTADO
			   while (resultados.next()) {
			    System.out.println("id envio: " + resultados.getInt(1)
			      + ": id_factura: " + resultados.getInt(2)+" id_socio: "+resultados.getInt(3));
			   }

			   // CERRAR
			   resultados.close();
			   enunciado.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
        
    }
    
    
    
    
}
