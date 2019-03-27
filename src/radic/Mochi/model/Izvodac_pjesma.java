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
@Entity
@Table
public class Izvodac_pjesma extends Entitet implements Serializable {
    
    @ManyToOne
    private Izvodac izvodac;
    
    @ManyToOne
    private Pjesma pjesma;

    public Izvodac getIzvodac() {
        return izvodac;
    }

    public void setIzvodac(Izvodac izvodac) {
        this.izvodac = izvodac;
    }

    public Pjesma getPjesma() {
        return pjesma;
    }

    public void setPjesma(Pjesma pjesma) {
        this.pjesma = pjesma;
    }
    
    
}
