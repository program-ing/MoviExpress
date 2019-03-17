/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipiloto.edu.co.conexionSQL;

/**
 *
 * @author Usuario
 */
public class Utilidades 
{
    //CONSTANTES BASE DE DATOS
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "bdMoviExpress.db";
    
    //Constantes tabla Cliente
    public static final String TABLA_CLIENTE="cliente";
    public static final String CAMPO_ID_CLIENTE="id_cliente";
    public static final String CAMPO_NOMBRE_CLIENTE="nombre_cliente";
    public static final String CAMPO_APELLIDO_CLIENTE="apellido_cliente";
    public static final String CAMPO_DIRECCION_CLIENTE="direccion_cliente";
    public static final String CAMPO_TELEFONO_CLIENTE="telefono_cliente";
    public static final String CAMPO_EMAIL_CLIENTE="email_cliente";
    public static final String CREAR_TABLA_CLIENTE=
            "CREATE TABLE "+TABLA_CLIENTE+" ("+CAMPO_ID_CLIENTE+" INTEGER, "+CAMPO_NOMBRE_CLIENTE
            +" VARCHAR(50), "+CAMPO_APELLIDO_CLIENTE+" VARCHAR(50),"+CAMPO_DIRECCION_CLIENTE+" VARCHAR(100), "
            +CAMPO_TELEFONO_CLIENTE+" VARCHAR(10), "+CAMPO_EMAIL_CLIENTE+" VARCHAR(100))";
    
    
    //Constantes tabla factura
    public static final String TABLA_FACTURA="factura";
    public static final String CAMPO_ID_FACTURA="id_factura";
    public static final String CAMPO_ID_PRODUCTO_FACTURA="id_producto";
    public static final String CAMPO_ID_CLIENTE_FACTURA="id_cliente";
    public static final String CAMPO_CANTIDAD_PRODUCTO="cantidad_producto";
    public static final String CAMPO_VALOR_A_PAGAR="valor_a_pagar";
    public static final String CREAR_TABLA_FACTURA=
            "CREATE TABLE "+TABLA_FACTURA+" ("+CAMPO_ID_FACTURA+" INTEGER, "+CAMPO_ID_PRODUCTO_FACTURA
            +" INTEGER, "+CAMPO_ID_CLIENTE_FACTURA+" INTEGER,"+CAMPO_CANTIDAD_PRODUCTO+" INTEGER, "
            +CAMPO_VALOR_A_PAGAR+" INTEGER)";
    
    
    //Constantes tabla producto
    public static final String TABLA_PRODUCTO="producto";
    public static final String CAMPO_ID_PRODUCTO="id_producto";
    public static final String CAMPO_MARCA="marca";
    public static final String CAMPO_TIPO_DE_PRODUCTO="tipo_de_producto";
    public static final String CAMPO_VALOR_DE_PRODUCTO="valor_de_producto";
    public static final String CAMPO_ID_TIENDA_PRODUCTO="id_tienda_producto";
    public static final String CAMPO_DETALLE_PRODUCTO="detalla_producto";
    public static final String CREAR_TABLA_PRODUCTO=
            "CREATE TABLE "+TABLA_PRODUCTO+" ("+CAMPO_ID_PRODUCTO+" INTEGER, "+CAMPO_MARCA
            +" VARCHAR(100), "+CAMPO_TIPO_DE_PRODUCTO+" VARCHAR(100),"+CAMPO_VALOR_DE_PRODUCTO+" INTEGER, "
            +CAMPO_ID_TIENDA_PRODUCTO+" INTEGER, "+CAMPO_DETALLE_PRODUCTO+" VARCHAR(300))";
    
    
    //Constantes tabla Socio
    public static final String TABLA_SOCIO="socio";
    public static final String CAMPO_ID_SOCIO="id_socio";
    public static final String CAMPO_NOMBRE_SOCIO="nombre_socio";
    public static final String CAMPO_APELLIDO_SOCIO="apellido_socio";
    public static final String CAMPO_TELEFONO_SOCIO="telefono_socio";
    public static final String CAMPO_EMAIL_SOCIO="email_socio";
    public static final String CAMPO_ID_VEHICULO_SOCIO="id_vehiculo";
    public static final String CAMPO_NUMERO_DE_CUENTA="numero_de_cuenta";
    public static final String CAMPO_IDENTIFICACION="identificacion";
    public static final String CREAR_TABLA_SOCIO=
            "CREATE TABLE "+TABLA_SOCIO+" ("+CAMPO_ID_SOCIO+" INTEGER, "+CAMPO_NOMBRE_SOCIO
            +" VARCHAR(50), "+CAMPO_APELLIDO_SOCIO+" VARCHAR(50),"+CAMPO_TELEFONO_SOCIO+" VARCHAR(10), "
            +CAMPO_EMAIL_SOCIO+" VARCHAR(100), "+CAMPO_ID_VEHICULO_SOCIO+" INTEGER, "+CAMPO_NUMERO_DE_CUENTA+" VARCHAR(50), "
            +CAMPO_IDENTIFICACION+" VARCHAR(50))";
    
    
    
    //Constantes tabla Envio
    public static final String TABLA_ENVIO="envio";
    public static final String CAMPO_ID_ENVIO="id_envio";
    public static final String CAMPO_ID_FACTURA_ENVIO="id_factura_envio";
    public static final String CAMPO_ID_SOCIO_ENVIO="id_socio_envio";
    public static final String CREAR_TABLA_ENVIO=
            "CREATE TABLE "+TABLA_ENVIO+" ("+CAMPO_ID_ENVIO+" INTEGER, "+CAMPO_ID_FACTURA_ENVIO
            +" INTEGER, "+CAMPO_ID_SOCIO_ENVIO+" INTEGER)";
    
    
    
    //Constantes tabla Vehiculo
    public static final String TABLA_VEHICULO="vehiculo";
    public static final String CAMPO_ID_VEHICULO="id_vehiculo";
    public static final String CAMPO_TIPO_DE_VEHICULO="tipo_de_vehiculo";
    public static final String CAMPO_COLOR_VEHICULO="color_vehiculo";
    public static final String CREAR_TABLA_VEHICULO=
            "CREATE TABLE "+TABLA_VEHICULO+" ("+CAMPO_ID_VEHICULO+" INTEGER, "+CAMPO_TIPO_DE_VEHICULO
            +" VARCHAR(50), "+CAMPO_COLOR_VEHICULO+" VARCHAR(50))";
    
    
    
    
    //Constantes tabla Tienda
    public static final String TABLA_TIENDA="tienda";
    public static final String CAMPO_ID_TIENDA="id_tienda";
    public static final String CAMPO_NOMBRE_TIENDA="nombre_tienda";
    public static final String CAMPO_DIRECCION_TIENDA="direccion_tienda";
    public static final String CAMPO_TELEFONO_TIENDA="telefono_tienda";
    public static final String CAMPO_EMAIL_TIENDA="email_tienda";
    public static final String CREAR_TABLA_TIENDA=
            "CREATE TABLE "+TABLA_TIENDA+" ("+CAMPO_ID_TIENDA+" INTEGER, "+CAMPO_NOMBRE_TIENDA
            +" VARCHAR(80), "+CAMPO_DIRECCION_TIENDA+" VARCHAR(100),"+CAMPO_TELEFONO_TIENDA+" VARCHAR(10), "
            +CAMPO_EMAIL_TIENDA+" VARCHAR(100))";
    
}


