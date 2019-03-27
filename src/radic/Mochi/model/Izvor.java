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
public class Izvor extends Entitet implements Serializable {
    
    @OneToMany (mappedBy = "izvor")
    private List<Lista_pov> lista_pov=new ArrayList<>();

    public List<Lista_pov> getLista_pov() {
        return lista_pov;
    }

    public void setLista_pov(List<Lista_pov> lista_pov) {
        this.lista_pov = lista_pov;
    }
    
    
    
    public String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
    
}
