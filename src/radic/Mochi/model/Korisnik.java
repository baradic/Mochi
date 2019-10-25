/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
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
public class Korisnik extends Entitet implements Serializable {
    
    private String ime;
    
    private String prezime;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public List<Povijest> getDogadaji() {
        return dogadaji;
    }

    public void setDogadaji(List<Povijest> dogadaji) {
        this.dogadaji = dogadaji;
    }
    
    
     private String email;
    
    @Column(columnDefinition = "char(60)")
    private String lozinka;
    
   
     
     @OneToMany(mappedBy = "korisnik")
    private List<Povijest> dogadaji=new ArrayList<>();

    public List<Povijest> getPovijesti() {
        return dogadaji;
    }

    public void setPovijesti (List<Povijest> dogadaji) {
        this.dogadaji = dogadaji;
    }
     

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

  

   

    
    
    
}
