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
 * @author Hrvoje-PC
 */
@Entity
@Table
public class Povijest extends Entitet implements Serializable {

    
    private String vrijemePreslusavanja;
    @ManyToOne
    private Pjesma pjesma;

    public String getVrijemePreslusavanja() {
        return vrijemePreslusavanja;
    }

    public void setVrijemePreslusavanja(String vrijemePreslusavanja) {
        this.vrijemePreslusavanja = vrijemePreslusavanja;
    }

    
    

    public Pjesma getPjesma() {
        return pjesma;
    }

    public void setPjesma(Pjesma pjesma) {
        this.pjesma = pjesma;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
   
    @ManyToOne
     private Korisnik korisnik;
    
    @Override
    public String toString() {
       return getPjesma().getNaziv();
    }
}

 