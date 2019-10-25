/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.controller;

import java.util.List;
import radic.Mochi.model.Izvodac;
import radic.Mochi.model.Povijest;
import radic.Mochi.pomocno.HibernateUtil;
import radic.Mochi.pomocno.MochiException;
import radic.Mochi.pomocno.ObradaSucelje;

/**
 *
 * @author Hrvoje-PC
 */

    public class ObradaPovijest extends Obrada<Povijest> implements ObradaSucelje<Povijest>{

    public ObradaPovijest() {
    super();
    }
            
    @Override
    public List<Povijest> getLista() {
        return HibernateUtil.getSession().createQuery("from Povijest").list();
    }

    @Override
    public void kontrola(Povijest t) throws MochiException {
//        if (t.getIme()==null) {
//        throw new MochiException("Ime nije definirano"); 
//        }
//        if (t.getIme().trim().isEmpty()) {
//        throw new MochiException("Ime nije uneseno");
//        }
//        
//        if (t.getInfo()==null) {
//        throw new MochiException("Info nije definiran"); 
//        }
//        if (t.getInfo().trim().isEmpty()) {
//        throw new MochiException("Info nije unesen");
//        }
     }

    
    @Override
    public Povijest spremi(Povijest t) throws MochiException {
        kontrola(t);
        return dao.save(t);
    }

    @Override
    public void obrisi(Povijest t) throws MochiException {
//        if (!t.getIzvodac_pjesma().isEmpty()) {
//        throw new MochiException("Ne mozete obrisati izvodaca jer se koriste njegovi podaci");
//        }
        dao.delete(t);
    }
    
}
    

