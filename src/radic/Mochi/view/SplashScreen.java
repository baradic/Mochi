/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.view;

import radic.Mochi.controller.ObradaKorisnik;

/**
 *
 * @author Profesor
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();

        ProvjeriSpajanjeNaBazu p = new ProvjeriSpajanjeNaBazu();
        p.start();
        
        

    }

    private class ProvjeriSpajanjeNaBazu extends Thread {

       
        

        @Override
        public void run() {

            lblPoruka.setText("Inicijaliziram....");
            for (int i = 1; i < 33; i++) {
                jProgressBar1.setValue(i);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                }
            }
            
            lblPoruka.setText("Spajam se na bazu...");
            for (int i = 34; i < 67; i++) {
                jProgressBar1.setValue(i);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                }
            }

            
            if (new ObradaKorisnik().getLista().size() > 0) {
                lblPoruka.setText("Pokrećem program..");
                for (int i = 67; i <= 100; i++) {
                    jProgressBar1.setValue(i);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                    }
                }
                //idi dalje
                new Login().setVisible(true);
                dispose();
            } else {
                //javi da nešto ne valja
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lblPoruka = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mochi");
        setType(java.awt.Window.Type.POPUP);

        lblPoruka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoruka.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radic/Mochi/view/slika_splash_screen.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblPoruka;
    // End of variables declaration//GEN-END:variables
}
