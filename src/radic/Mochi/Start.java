package radic.Mochi;

// domaća zadaća:

import java.util.logging.Level;
import java.util.logging.Logger;
import radic.Mochi.controller.ObradaIzvor;
import radic.Mochi.controller.ObradaKorisnik;
import radic.Mochi.controller.ObradaPjesma;
import radic.Mochi.controller.ObradaZanr;
import radic.Mochi.model.Izvor;
import radic.Mochi.model.Korisnik;
import radic.Mochi.model.Pjesma;
import radic.Mochi.model.Zanr;
import radic.Mochi.pomocno.BCrypt;
import radic.Mochi.pomocno.HibernateUtil;
import radic.Mochi.pomocno.MochiException;
import radic.Mochi.view.Login;
import radic.Mochi.view.SplashScreen;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        new SplashScreen().setVisible(true);
//        HibernateUtil.getSession();



//        Pjesma pjesma = new Pjesma();
//        pjesma.setNaziv("Makro");
//        ObradaPjesma op = new ObradaPjesma();
//        try {
//            op.spremi(pjesma);
//             } catch (MochiException ex) {
//            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//            
//
//        Zanr z = new Zanr();
//        z.setVrsta("Nije navedeno");
//        ObradaZanr oz = new ObradaZanr();
//      
//        try {
//            oz.spremi(z);
//        } catch (MochiException ex) {
//           ex.printStackTrace();
//        }
//
//
  
//        Izvor iz = new Izvor();
//        iz.setNaziv("Lokalna memorija");
//        ObradaIzvor ozz = new ObradaIzvor();
//        try {
//            ozz.spremi(iz);
//        } catch (MochiException ex) {
//           ex.printStackTrace();
//        }
//        
//          Korisnik o = new Korisnik();
//      o.setEmail("barbararadic@gmail.com");
//      o.setLozinka(BCrypt.hashpw("b", BCrypt.gensalt()));
//        System.out.println(o.getLozinka());
//      o.setIme("Barbara");
//      o.setPrezime("Radic");
//      
//        ObradaKorisnik oo = new ObradaKorisnik();
//        try {
//            oo.spremi(o);
//        } catch (MochiException ex) {
//           ex.printStackTrace();
//        }
////       
//       
       
        
        
        
                
    

}}

