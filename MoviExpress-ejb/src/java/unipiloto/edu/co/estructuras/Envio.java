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
public class Envio 
{
    private int id_envio;
    private int id_factita;
    private int id_socio;

    public Envio(int id_envio, int id_factita, int id_socio) {
        this.id_envio = id_envio;
        this.id_factita = id_factita;
        this.id_socio = id_socio;
    }

    public int getId_envio() {
        return id_envio;
    }

    public void setId_envio(int id_envio) {
        this.id_envio = id_envio;
    }

    public int getId_factita() {
        return id_factita;
    }

    public void setId_factita(int id_factita) {
        this.id_factita = id_factita;
    }

    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }
    
    
    
}
