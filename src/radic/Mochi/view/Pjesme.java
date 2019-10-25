/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import radic.Mochi.controller.ObradaIzvodac;
import radic.Mochi.controller.ObradaIzvor;
import radic.Mochi.controller.ObradaPjesma;
import radic.Mochi.controller.ObradaPovijest;
import radic.Mochi.controller.ObradaZanr;
import radic.Mochi.model.Izvodac;
import radic.Mochi.model.Izvor;
import radic.Mochi.model.Korisnik;
import radic.Mochi.model.Pjesma;
import radic.Mochi.model.Zanr;
import radic.Mochi.pomocno.MochiException;

/**
 *
 * @author Hrvoje-PC
 */
public class Pjesme extends javax.swing.JFrame {
    
    ObradaIzvodac obradaIzvodac;
    ObradaPjesma obradaEntitet;
     private Korisnik operater;
    private static DefaultComboBoxModel<Zanr> modelZanr;
    private static DefaultComboBoxModel<Izvor> modelIzvor;
    private static DefaultListModel<Izvodac> modelIzvodac;
    

    /**
     * Creates new form Pjesme
     */
    public Pjesme(Korisnik operater) {
        initComponents();
        this.operater = operater;
        System.out.println(operater);
        
        
         
        
        
        DefaultComboBoxModel<Zanr> ms = new DefaultComboBoxModel<>();
        Zanr vd = new Zanr();
        vd.setSifra(-1);
        vd.setVrsta("Odaberite žanr");
        ms.addElement(vd);
        new ObradaZanr().getLista().forEach((s) -> {
            ms.addElement(s);
        });
        cmbZanr.setModel(ms);
        
        DefaultComboBoxModel<Izvor> iz = new DefaultComboBoxModel<>();
        Izvor izv = new Izvor();
        izv.setSifra(-2);
        izv.setNaziv("Odaberite izvor");
        iz.addElement(izv);
        new ObradaIzvor().getLista().forEach((s) -> {
            iz.addElement(s);
        });
        cmbIzvor.setModel(iz);
        
        DefaultListModel<Izvodac> pp = new DefaultListModel<>();
        Izvodac pje = new Izvodac();
//        pje.setSifra(-3);
//        pje.setIme("Odaberite Izvođača");
//        pp.addElement(pje);
        new ObradaIzvodac().getLista().forEach((s) -> {
            pp.addElement(s);
        });
        lstIzvodaci.setModel(pp);
        
       
        
        
        dpVrijemeizdavanja.setLocale(new Locale("hr", "HR"));
        dpVrijemeizdavanja.getSettings().setTranslationToday("Danas");
        dpVrijemeizdavanja.getSettings().setTranslationClear("Poništi");
        dpVrijemeizdavanja.getSettings().setFormatForDatesCommonEra("dd. MMMM yyyy.");
        dpVrijemeizdavanja.getSettings().setFormatForDatesBeforeCommonEra("dd. MMMM uuuu.");
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnObrisi = new javax.swing.JButton();
        btnOcistiPolja = new javax.swing.JButton();
        txtNaziv = new javax.swing.JTextField();
        cmbZanr = new javax.swing.JComboBox<>();
        cmbIzvor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dpVrijemeizdavanja = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstIzvodaci = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btnPoslušaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel2.setText("Pjesme");

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });

        chbLimitator.setText("prikaži 50");

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane3.setViewportView(txtInfo);

        jLabel4.setText("Više informacija:");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        jLabel3.setText("Naziv pjesme");

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnOcistiPolja.setText("Očisti polja");

        jLabel1.setText("Žanr");

        jLabel5.setText("Izvor");

        lstIzvodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstIzvodaci);

        jLabel6.setText("Izvođači");

        btnPoslušaj.setText("Poslušaj pjesmu");
        btnPoslušaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoslušajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbLimitator)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPoslušaj)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOcistiPolja)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(cmbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(dpVrijemeizdavanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbIzvor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnObrisi)
                                .addComponent(btnPromjeni)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnDodaj)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7)
                                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chbLimitator))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cmbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(cmbIzvor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnDodaj)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnPromjeni)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnObrisi)))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(dpVrijemeizdavanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnOcistiPolja)
                                        .addGap(5, 5, 5)
                                        .addComponent(btnPoslušaj, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
       ucitajEntitete();
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
         Pjesma entitet = lstEntiteti.getSelectedValue();
         ObradaPjesma op = new ObradaPjesma();

        if (entitet == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite pjesmu");
        }

        try {
            op.obrisi(entitet);
            ucitajEntitete();
            
        } catch (MochiException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
         if (evt.getValueIsAdjusting()) {
            return;
        }

        Pjesma entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }
        
        
        
         modelZanr = (DefaultComboBoxModel<Zanr>) cmbZanr.getModel();
            for (int i = 0; i < modelZanr.getSize(); i++) {
                if (modelZanr.getElementAt(i).getSifra()
                        == lstEntiteti.getSelectedValue().getZanr().getSifra()) {
                    cmbZanr.setSelectedIndex(i);
                    break;
                }
            }
            
            modelIzvor = (DefaultComboBoxModel<Izvor>) cmbIzvor.getModel();
            for (int i = 0; i < modelIzvor.getSize(); i++) {
                if (modelIzvor.getElementAt(i).getSifra()
                        == lstEntiteti.getSelectedValue().getIzvor().getSifra()) {
                    cmbIzvor.setSelectedIndex(i);
                    break;
                }
            }
            
            modelIzvodac =  (DefaultListModel<Izvodac>) lstIzvodaci.getModel();
            for (int i = 0; i < modelIzvodac.getSize(); i++) {
                if (modelIzvodac.getElementAt(i).getSifra()
                        == lstEntiteti.getSelectedValue().getIzvodac().getSifra()) {
                    lstIzvodaci.setSelectedIndex(i);
                    break;
                }
            }
            
            Date input = new Date();
        input.setTime(entitet.getDatumIzdanja().getTime());
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

      
        dpVrijemeizdavanja.setDate(date);
        
       
        

        
        
        
        

                
        txtNaziv.setText(entitet.getNaziv());
        txtInfo.setText(entitet.getInfo());                                             
       
               
        

    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
          Pjesma pjesma = new Pjesma();
          ObradaPjesma op = new ObradaPjesma();
        preuzmiVrijednosti(pjesma);
        try {

        op.spremi(pjesma);
        } catch (MochiException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }
        ucitajEntitete();
        txtInfo.setText("");
        txtNaziv.setText("");

        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        Pjesma entitet = lstEntiteti.getSelectedValue();
        ObradaPjesma op = new ObradaPjesma();

        if (entitet == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite pjesmu");
        }

        preuzmiVrijednosti(entitet);

        try {
            op.spremi(entitet);
        } catch (MochiException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnPoslušajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoslušajActionPerformed
         radic.Mochi.model.Povijest pov = new radic.Mochi.model.Povijest();
         ObradaPovijest opov = new ObradaPovijest();
         
         pov.setKorisnik(operater);
         
         pov.setPjesma(lstEntiteti.getSelectedValue());
         Date date = new Date(System.currentTimeMillis());
         String timeStamp = new SimpleDateFormat("dd.MM.yyyy._HH:mm").format(Calendar.getInstance().getTime());
         
         pov.setVrijemePreslusavanja(timeStamp);
        try {
            opov.spremi(pov);
        } catch (MochiException ex) {
            Logger.getLogger(Pjesme.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
    }//GEN-LAST:event_btnPoslušajActionPerformed

    private void ucitajEntitete() {
        ObradaPjesma opp = new ObradaPjesma();
            DefaultListModel<Pjesma> mp = new DefaultListModel<>();
            for (Pjesma g : opp.getLista()) {
                mp.addElement(g);
            }
            lstEntiteti.setModel(mp);
            
    if (chbLimitator.isSelected()) {
        ObradaPjesma op = new ObradaPjesma();
            DefaultListModel<Pjesma> m = new DefaultListModel<>();
            for (Pjesma s : op.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                m.addElement(s);
            }
            lstEntiteti.setModel(m);
        } else {
            DefaultListModel<Pjesma> m = new DefaultListModel<>();
            Pjesma p = new Pjesma();
            p.setNaziv("Molim pričekati");
            m.addElement(p);
            lstEntiteti.setModel(m);
           DuzeUcitanjePolaznika d = new DuzeUcitanjePolaznika();
            d.start();
        }
    }

    private class DuzeUcitanjePolaznika extends Thread {

        @Override
        public void run() {
            DefaultListModel<Pjesma> m = new DefaultListModel<>();
            ObradaPjesma opp = new ObradaPjesma();
            for (Pjesma s : opp.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                m.addElement(s);
            }
            lstEntiteti.setModel(m);
        }

    }
//     private void ucitajEntitete() {
//         ObradaPjesma op =new ObradaPjesma();
//        DefaultListModel<Pjesma> m = new DefaultListModel<>();
//        for (Pjesma n : op.getLista()) {
//            m.addElement(n);
//
//            lstEntiteti.setModel(m);
//
//        }
//     }
     
     private void ucitajIzvodace() {

        DefaultListModel<Izvodac> m = new DefaultListModel<>();
        for (Izvodac s : obradaIzvodac.getLista()) {
            m.addElement(s);

            lstIzvodaci.setModel(m);

        }

    }
     
//     private class DuzeUcitanjeEntiteta extends Thread {
//
//        @Override
//        public void run() {
//            ObradaPjesma op =new ObradaPjesma();
//            DefaultListModel<Pjesma> m = new DefaultListModel<>();
//            for (Pjesma s : op.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
//                m.addElement(s);
//            }
//            lstEntiteti.setModel(m);
//        }
//
//    }
//     
     private void preuzmiVrijednosti(Pjesma entitet) {

        try {
            Date date = Date.from(dpVrijemeizdavanja.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            entitet.setDatumIzdanja(date);
        } catch (Exception e) {
            entitet.setDatumIzdanja(null);
        }

        entitet.setNaziv(txtNaziv.getText());
        entitet.setInfo(txtInfo.getText());
        entitet.setZanr((Zanr) cmbZanr.getSelectedItem());
         System.out.println(cmbZanr.getSelectedItem());
        entitet.setIzvodac(lstIzvodaci.getSelectedValue());
        entitet.setIzvor((Izvor) cmbIzvor.getSelectedItem());
                

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOcistiPolja;
    private javax.swing.JButton btnPoslušaj;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JCheckBox chbLimitator;
    private javax.swing.JComboBox<Izvor> cmbIzvor;
    private javax.swing.JComboBox<Zanr> cmbZanr;
    private com.github.lgooddatepicker.components.DatePicker dpVrijemeizdavanja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Pjesma> lstEntiteti;
    private javax.swing.JList<Izvodac> lstIzvodaci;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
