/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.model;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author baradic
 */

@Entity
@Table
public class Zanr extends Entitet implements Serializable {
    
    @OneToMany (mappedBy = "zanr")
    private List<Pjesma> pjesma=new ArrayList<>();

    public List<Pjesma> getPjesma() {
        return pjesma;
    }

    public void setPjesma(List<Pjesma> pjesma) {
        this.pjesma = pjesma;
    }
    
    
    
    private String vrsta;

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    
    
    
}
