/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipiloto.edu.co.estructuras;

/**
 *
 * @author Usuario
 */
public class Factura 
{
    private int id_factura;
    private int id_producto;
    private int id_cliente;
    private int cantidad_producto;
    private int valor_a_pagar;

    public Factura(int id_factura, int id_producto, int id_cliente, int cantidad_producto, int valor_a_pagar) {
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.id_cliente = id_cliente;
        this.cantidad_producto = cantidad_producto;
        this.valor_a_pagar = valor_a_pagar;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public int getValor_a_pagar() {
        return valor_a_pagar;
    }

    public void setValor_a_pagar(int valor_a_pagar) {
        this.valor_a_pagar = valor_a_pagar;
    }
    
    
    
}
