package radic.Mochi;

// domaća zadaća:

import radic.Mochi.controller.ObradaIzvodac;
import radic.Mochi.model.Izvodac;
import radic.Mochi.pomocno.HibernateUtil;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        
       HibernateUtil.getSession();
       
       Izvodac iz = new Izvodac();
       
       iz.setIme("Barbara");
       iz.setInfo("Dobra je pjesma");
       
        ObradaIzvodac oi = new ObradaIzvodac();
        try {
            oi.spremi(iz);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
                
    
}
}

