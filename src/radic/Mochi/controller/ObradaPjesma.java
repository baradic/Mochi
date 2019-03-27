/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.controller;

import java.util.List;
import radic.Mochi.model.Izvodac;
import radic.Mochi.model.Pjesma;
import radic.Mochi.pomocno.HibernateUtil;
import radic.Mochi.pomocno.MochiException;
import radic.Mochi.pomocno.ObradaSucelje;

/**
 *
 * @author baradic
 */
public class ObradaPjesma extends Obrada<Pjesma> implements ObradaSucelje<Pjesma>{
    
    public ObradaPjesma(){
    super();
    }

    @Override
    public List<Pjesma> getLista() {
        return HibernateUtil.getSession().createQuery("from Pjesma").list();
    }

    @Override
    public void kontrola(Pjesma t) throws MochiException {
       if (t.getInfo()==null) {
       throw new MochiException("Info nije definiran");
       }
       if (t.getInfo().trim().isEmpty()) {
       throw new MochiException("Info nije unesen");
       }
        
       if (t.getNaziv()==null) {
       throw new MochiException("Naziv nije definiran"); 
       }
       if (t.getNaziv().trim().isEmpty()) {
       throw new MochiException("Naziv nije unesen");
       }
       
    }

    @Override
    public Pjesma spremi(Pjesma t) throws MochiException {
        kontrola(t);
        return dao.save(t);
    }

    @Override
    public void obrisi(Pjesma t) throws MochiException {
        if (!t.getIzvodac_pjesma().isEmpty()) {
        throw new MochiException("Ne mozete obrisati pjesmu jer se koriste njezini podaci");
        }
        dao.delete(t);
    }
    
    
    
}
