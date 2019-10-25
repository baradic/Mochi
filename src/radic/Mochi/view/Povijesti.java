/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.view;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import radic.Mochi.controller.ObradaPjesma;
import radic.Mochi.controller.ObradaPovijest;
import radic.Mochi.model.Korisnik;
import radic.Mochi.model.Pjesma;
import radic.Mochi.model.Povijest;
import radic.Mochi.pomocno.MochiException;

/**
 *
 * @author Hrvoje-PC
 */
public class Povijesti extends javax.swing.JFrame {

    private Korisnik operater;

    

    /**
     * Creates new form Korisnici
     */
    public Povijesti(Korisnik operater) {
        initComponents();
        this.operater = operater;
        
        ObradaPovijest op = new ObradaPovijest();
        setTitle("Korisnik - " + operater.getPrezime() + " " + operater.getIme());
        
        DefaultListModel<Povijest> p = new DefaultListModel<>();
        for (Povijest s : op.getLista()) {
            if(operater.getSifra()==s.getKorisnik().getSifra()){
                p.addElement(s);
            
            }

        }
       lstEntiteti.setModel(p);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        lblIzvodac = new javax.swing.JLabel();
        lblVP = new javax.swing.JLabel();
        lblZanr = new javax.swing.JLabel();
        lblIzvor = new javax.swing.JLabel();
        btnOcistiPovijest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Popis pjesma");

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        lblIzvodac.setText("Naziv izvođača :");

        lblVP.setText("Vrijeme preslušavanja:");

        lblZanr.setText("Žanr:");

        lblIzvor.setText("Izvor:");

        btnOcistiPovijest.setText("Očisti povijest");
        btnOcistiPovijest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPovijestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOcistiPovijest)
                            .addComponent(lblIzvodac, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVP)
                            .addComponent(lblZanr)
                            .addComponent(lblIzvor))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIzvodac)
                        .addGap(18, 18, 18)
                        .addComponent(lblZanr)
                        .addGap(18, 18, 18)
                        .addComponent(lblIzvor)
                        .addGap(18, 18, 18)
                        .addComponent(lblVP)
                        .addGap(31, 31, 31)
                        .addComponent(btnOcistiPovijest))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        lblIzvodac.setText("Naziv izvođača : "+lstEntiteti.getSelectedValue().getPjesma().getIzvodac().getIme());
        lblIzvor.setText("Izvor : "+lstEntiteti.getSelectedValue().getPjesma().getIzvor().getNaziv());
        lblZanr.setText("Žanr : "+lstEntiteti.getSelectedValue().getPjesma().getZanr().getVrsta());
        lblVP.setText("Vrijeme preslušavanja: "+lstEntiteti.getSelectedValue().getVrijemePreslusavanja());
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnOcistiPovijestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPovijestActionPerformed
         ObradaPovijest op = new ObradaPovijest();
                for (Povijest s : op.getLista()) {
            if(operater.getSifra()==s.getKorisnik().getSifra()){
                try {
                    op.obrisi(s);
                } catch (MochiException ex) {
                    Logger.getLogger(Povijesti.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
            
                }
                dispose();
                JOptionPane.showMessageDialog(null, "Vaša povjest je obrisana");
                
            
                

        
    }//GEN-LAST:event_btnOcistiPovijestActionPerformed


    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOcistiPovijest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIzvodac;
    private javax.swing.JLabel lblIzvor;
    private javax.swing.JLabel lblVP;
    private javax.swing.JLabel lblZanr;
    private javax.swing.JList<Povijest> lstEntiteti;
    // End of variables declaration//GEN-END:variables
}