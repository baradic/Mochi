/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author baradic
 */

@Entity
@Table
public class Izvodac extends Entitet implements Serializable {
    
    @OneToMany (mappedBy = "izvodac")
    private List<Izvodac_pjesma> izvodac_pjesma=new ArrayList<>();

    public List<Izvodac_pjesma> getIzvodac_pjesma() {
        return izvodac_pjesma;
    }

    public void setIzvodac_pjesma(List<Izvodac_pjesma> izvodac_pjesma) {
        this.izvodac_pjesma = izvodac_pjesma;
    }
    
    
    
    private String ime;
    
    private String info;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
    
}
