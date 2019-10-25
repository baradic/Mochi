/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author baradic
 */
@Entity
@Table
public class Pjesma extends Entitet implements Serializable {
    
    private String naziv;
   
    private String info;
    
     @Temporal(TemporalType.DATE)
    private Date datumIzdanja;
     
     

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    public Izvodac getIzvodac() {
        return izvodac;
    }

    public void setIzvodac(Izvodac izvodac) {
        this.izvodac = izvodac;
    }
    
  
    
    @ManyToOne
    private Zanr zanr;
    
    @ManyToOne
    private Izvodac izvodac;
    
     @ManyToOne
    private Izvor izvor;

    public Izvor getIzvor() {
        return izvor;
    }

    public void setIzvor(Izvor izvor) {
        this.izvor = izvor;
    }
     @Override
    public String toString() {
       return getNaziv();
    }
}
