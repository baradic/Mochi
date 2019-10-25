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
    
    private String ime;
    
    private String info;
    
    @OneToMany(mappedBy = "izvodac")
    private List<Pjesma> pjesme=new ArrayList<>();

    public List<Pjesma> getPjesme() {
        return pjesme;
    }

    public void setPjesme(List<Pjesma> pjesme) {
        this.pjesme = pjesme;
    }

    

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
    
     @Override
    public String toString() {
       return getIme();
    }
    
    
    
}
