/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.controller;

import java.util.List;
import radic.Mochi.model.Zanr;
import radic.Mochi.pomocno.HibernateUtil;
import radic.Mochi.pomocno.MochiException;
import radic.Mochi.pomocno.ObradaSucelje;

/**
 *
 * @author baradic
 */
public class ObradaZanr extends Obrada<Zanr> implements ObradaSucelje<Zanr>{

    public ObradaZanr(){
    super();
    }
    
    @Override
    public List<Zanr> getLista() {
        return HibernateUtil.getSession().createQuery("from Zanr").list();
    }

    @Override
    public void kontrola(Zanr t) throws MochiException {
        if (t.getVrsta()==null) {
        throw new MochiException("Vrsta zanra nije definirana"); 
        }
        if (t.getVrsta().trim().isEmpty()) {
        throw new MochiException("Vrsta zanra nije unesena");
        }   
    }

    @Override
    public Zanr spremi(Zanr t) throws MochiException {
        kontrola(t);
        return dao.save(t);
    }

    @Override
    public void obrisi(Zanr t) throws MochiException {
       if (!t.getPjesma().isEmpty()) {
        throw new MochiException("Ne mozete obrisati zanr jer se koriste njegovi podaci");
        }
        dao.delete(t);
    }
    
}
