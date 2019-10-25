/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.controller;

import java.util.List;
import org.hibernate.Query;
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
    
     public List<Pjesma> getLista(String uvjet,boolean isSelected){
         
         Query query = HibernateUtil.getSession().createQuery("from Pjesma a "
                 + " where concat(a.naziv) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(50);
         }
         
         return query.list();
     }

    @Override
    public void kontrola(Pjesma t) throws MochiException {
              
       if (t.getNaziv()==null) {
       throw new MochiException("Naziv nije definiran"); 
       }
       if (t.getNaziv().trim().isEmpty()) {
       throw new MochiException("Naziv nije unesen");
       }
       if (t.getDatumIzdanja()==null) {
       throw new MochiException("Datum izdanja nije definiran"); 
       }
       if (t.getIzvodac()==null) {
       throw new MochiException("Izvođač nije definiran"); 
       }
       if (t.getZanr().getVrsta().equals("Odaberite žanr")) {
       throw new MochiException("Žanr nije definiran"); 
       }
       if (t.getIzvor().getNaziv().equals("Odaberite izvor")) {
       throw new MochiException("Izvor nije definiran"); 
       }
       
       
       
       
    }

    @Override
    public Pjesma spremi(Pjesma t) throws MochiException {
        kontrola(t);
        return dao.save(t);
    }

    @Override
    public void obrisi(Pjesma t) throws MochiException {

        dao.delete(t);
    }
    
    
    
}
