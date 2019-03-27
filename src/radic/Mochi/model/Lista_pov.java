/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author baradic
 */
@Table
@Entity
public class Lista_pov extends Entitet implements Serializable {
    
    @ManyToOne
    private Izvor izvor;
    
    @ManyToOne
    private Pjesma pjesma;

    public Izvor getIzvor() {
        return izvor;
    }

    public void setIzvor(Izvor izvor) {
        this.izvor = izvor;
    }

    public Pjesma getPjesma() {
        return pjesma;
    }

    public void setPjesma(Pjesma pjesma) {
        this.pjesma = pjesma;
    }
    
    
    
    
}
