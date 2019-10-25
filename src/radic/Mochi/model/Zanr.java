/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author baradic
 */

@Entity
@Table
public class Zanr extends Entitet implements Serializable {
    
    private String vrsta;

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    
    @Override
    public String toString() {
       return getVrsta();
    }
    
    
}
