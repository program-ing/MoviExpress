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
public class Vehiculo 
{
    private int id_vehiculo;
    private String tipo_vehiculo;
    private String color;

    public Vehiculo(int id_vehiculo, String tipo_vehiculo, String color) {
        this.id_vehiculo = id_vehiculo;
        this.tipo_vehiculo = tipo_vehiculo;
        this.color = color;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
