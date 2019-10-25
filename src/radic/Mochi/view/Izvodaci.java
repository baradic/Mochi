/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import radic.Mochi.controller.ObradaIzvodac;
import radic.Mochi.controller.ObradaPjesma;
import radic.Mochi.model.Izvodac;
import radic.Mochi.model.Pjesma;
import radic.Mochi.pomocno.MochiException;

/**
 *
 * @author Hrvoje-PC
 */
public class Izvodaci extends javax.swing.JFrame {

    private ObradaIzvodac obradaEntitet;
    private ObradaPjesma obradaPjesma;

    /**
     * Creates new form Izvodaci
     */
    public Izvodaci() {
        initComponents();
        obradaEntitet = new ObradaIzvodac();
        ucitajEntitete();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPjesme = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnOcistiPolja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jScrollPane2.setViewportView(lstPjesme);

        jLabel1.setText("Naziv izvođača");

        jLabel2.setText("Izvođači");

        jLabel3.setText("Pjesme");

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

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnOcistiPolja.setText("Očisti polja");
        btnOcistiPolja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPoljaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDodaj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnOcistiPolja))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNaziv)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPromjeni)
                                            .addComponent(btnObrisi)
                                            .addComponent(jLabel4))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDodaj)
                                    .addComponent(btnOcistiPolja))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPromjeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Izvodac dog = lstEntiteti.getSelectedValue();

        try {
            obradaEntitet.obrisi(dog);
            

        } catch (MochiException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        txtInfo.setText("");
        txtNaziv.setText("");
        ucitajEntitete();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        try {
             ucitajPjesme();
        txtNaziv.setText(lstEntiteti.getSelectedValue().getIme());
        txtInfo.setText(lstEntiteti.getSelectedValue().getInfo());
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Izvodac dog = new Izvodac();
        preuzmiVrijednosti(dog);

        try {
            obradaEntitet.spremi(dog);
        } catch (MochiException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();
        txtInfo.setText("");
        txtNaziv.setText("");

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        Izvodac dog = lstEntiteti.getSelectedValue();

        if (dog == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite Izvođača");
        }

        if (lstEntiteti.getSelectedValue().getSifra() == -2) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite Izvođača");
            return;
        }

        preuzmiVrijednosti(dog);

        try {
            obradaEntitet.spremi(dog);
        } catch (MochiException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistiPolja();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnOcistiPoljaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPoljaActionPerformed
        txtInfo.setText("");
        txtNaziv.setText("");
    }//GEN-LAST:event_btnOcistiPoljaActionPerformed

    private void ucitajEntitete() {

        DefaultListModel<Izvodac> m = new DefaultListModel<>();
        for (Izvodac s : obradaEntitet.getLista()) {
            m.addElement(s);

            lstEntiteti.setModel(m);

        }
    }

    private void ucitajPjesme() {
        DefaultListModel<Pjesma> op = new DefaultListModel<>();
        ObradaPjesma obrp = new ObradaPjesma();
        for (Pjesma pj : obrp.getLista()){
        if ( lstEntiteti.getSelectedValue().getSifra()==pj.getIzvodac().getSifra() ) {
                       
                op.addElement(pj);

                            }
        lstPjesme.setModel(op);
        }
        if(op.isEmpty()){
            Pjesma mu = new Pjesma();
            mu.setNaziv("Izvođač nema pjesama");
            op.addElement(mu);
            lstPjesme.setModel(op);
        }
        
    }

    private void preuzmiVrijednosti(Izvodac izv) {

        izv.setIme(txtNaziv.getText());
        izv.setInfo(txtInfo.getText());
    }

    private void ocistiPolja() {
        txtInfo.setText("");
        txtNaziv.setText("");
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOcistiPolja;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Izvodac> lstEntiteti;
    private javax.swing.JList<Pjesma> lstPjesme;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}
