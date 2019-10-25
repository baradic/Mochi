/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.controller;

import radic.Mochi.model.Korisnik;
import radic.Mochi.pomocno.BCrypt;
import radic.Mochi.pomocno.MochiException;
import radic.Mochi.pomocno.HibernateUtil;
import radic.Mochi.pomocno.ObradaSucelje;
import java.util.List;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author Profesor
 */
public class ObradaKorisnik extends Obrada<Korisnik> implements ObradaSucelje<Korisnik>{

    
    /**
     * 
     * 
     * Ako treba gledati vrijednosti parametara koji idu u bazu tada u my.ini (C:\xampp\mysql\bin)
     * u dijelu [mysqld] dodati (ili osloboditi - maknuti #)
     * #general_log_file = f:\mysqllog.log
     * #general_log      = 1
     * f:\mysqllog.log je datoteka gdje želite da piše - pripaziti ima li mysql ovlasti nad tom datotekom
     */
    
    
    public Korisnik autoriziraj(String email, String lozinka){
        Korisnik k = (Korisnik) HibernateUtil.getSession().createQuery(" from Korisnik a "
                + " where a.email=:email ")
                .setString("email", email)
                .uniqueResult();
        if(k==null){
            return null;
        }
        
        if(BCrypt.checkpw(lozinka, k.getLozinka())){
            //o.setLozinka(null); - riješiti
            return k;
        }
        
        return null;
    }
    
    @Override
    public List<Korisnik> getLista() {
        return HibernateUtil.getSession().createQuery("from Korisnik").list();
    }

    @Override
    public void kontrola(Korisnik t) throws MochiException{
        if(t.getIme()==null){
            throw new MochiException("Ime nije definirano");
        }
        if(t.getIme().trim().isEmpty()){
            throw new MochiException("Ime nije Uneseno");
        }
        
        if(t.getPrezime()==null){
            throw new MochiException("Prezime nije definirano");
        }
        if(t.getPrezime().trim().isEmpty()){
            throw new MochiException("Prezime nije uneseno");
        }

         if(t.getEmail()==null){
            throw new MochiException("Email nije definiran");
        }
        if(t.getEmail().trim().isEmpty()){
            throw new MochiException("Email nije unesen");
        }
        if(t.getLozinka()==null){
            throw new MochiException("Lozinke se ne podudaraju ili nisu unesene");
        }
        
        
    }

    @Override
    public Korisnik spremi(Korisnik t) throws MochiException {
        kontrola(t);
        return dao.save(t);
    }

    @Override
    public void obrisi(Korisnik t) throws MochiException {
        
    }
    
}
