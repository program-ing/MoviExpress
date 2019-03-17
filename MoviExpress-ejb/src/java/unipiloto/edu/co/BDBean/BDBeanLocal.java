/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipiloto.edu.co.BDBean;

import com.sun.org.apache.xpath.internal.operations.String;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface BDBeanLocal {

    void setCrearbd();

    void setInsertar();

    void setConsulta();

    
}
