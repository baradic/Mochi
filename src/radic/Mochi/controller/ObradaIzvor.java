/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.controller;

import java.util.List;
import radic.Mochi.model.Izvor;
import radic.Mochi.pomocno.HibernateUtil;
import radic.Mochi.pomocno.MochiException;
import radic.Mochi.pomocno.ObradaSucelje;

/**
 *
 * @author baradic
 */
public class ObradaIzvor extends Obrada<Izvor> implements ObradaSucelje<Izvor>{

    public ObradaIzvor(){
    super();
    }
    
    @Override
    public List<Izvor> getLista() {
       return HibernateUtil.getSession().createQuery("from Izvor").list();
    }

    @Override
    public void kontrola(Izvor t) throws MochiException {
       if (t.getNaziv()==null) {
        throw new MochiException("Naziv zanra nije definiran"); 
        }
        if (t.getNaziv().trim().isEmpty()) {
        throw new MochiException("Naziv izvora nije unesen");
        }   
    }

    @Override
    public Izvor spremi(Izvor t) throws MochiException {
        kontrola(t);
        return dao.save(t);
    }

    @Override
    public void obrisi(Izvor t) throws MochiException {
        if (!t.getLista_pov().isEmpty()) {
        throw new MochiException("Ne mozete obrisati izvor jer se koriste njegovi podaci");
        }
        dao.delete(t);
    }
    
}
