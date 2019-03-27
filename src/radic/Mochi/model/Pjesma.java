/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    
    @OneToMany (mappedBy = "pjesma")
    private List<Izvodac_pjesma> izvodac_pjesma=new ArrayList<>();

    @OneToMany (mappedBy = "pjesma")
    private List<Lista_pov> lista_pov=new ArrayList<>();

    public List<Lista_pov> getLista_pov() {
        return lista_pov;
    }

    public void setLista_pov(List<Lista_pov> lista_pov) {
        this.lista_pov = lista_pov;
    }
    
    
    
    public List<Izvodac_pjesma> getIzvodac_pjesma() {
        return izvodac_pjesma;
    }

    public void setIzvodac_pjesma(List<Izvodac_pjesma> izvodac_pjesma) {
        this.izvodac_pjesma = izvodac_pjesma;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(Date godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
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
    
    
    
    private String naziv;
    
     @Temporal(TemporalType.DATE)
    private Date godinaIzdanja;
    
    private String info;
    
    @ManyToOne
    private Zanr zanr;
    
}
