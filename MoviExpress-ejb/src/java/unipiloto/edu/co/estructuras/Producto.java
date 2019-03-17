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
public class Producto 
{
    private int id_producto;
    private String marca;
    private String tipo_de_producto;
    private int valor_producto;
    private int id_tienda;
    private String detalle_producto;

    public Producto(int id_producto, String marca, String tipo_de_producto, int valor_producto, int id_tienda, String detalle_producto) {
        this.id_producto = id_producto;
        this.marca = marca;
        this.tipo_de_producto = tipo_de_producto;
        this.valor_producto = valor_producto;
        this.id_tienda = id_tienda;
        this.detalle_producto = detalle_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_de_producto() {
        return tipo_de_producto;
    }

    public void setTipo_de_producto(String tipo_de_producto) {
        this.tipo_de_producto = tipo_de_producto;
    }

    public int getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(int valor_producto) {
        this.valor_producto = valor_producto;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getDetalle_producto() {
        return detalle_producto;
    }

    public void setDetalle_producto(String detalle_producto) {
        this.detalle_producto = detalle_producto;
    }
    
    
    
}
