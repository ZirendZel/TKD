/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

import javax.swing.JLabel;

/**
 *
 * @author Boris
 */
public class Frame1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
        this.setResizable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneau = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Frame1");

        javax.swing.GroupLayout PanneauLayout = new javax.swing.GroupLayout(Panneau);
        Panneau.setLayout(PanneauLayout);
        PanneauLayout.setHorizontalGroup(
            PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanneauLayout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanneauLayout.setVerticalGroup(
            PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
            .addGroup(PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanneauLayout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panneau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panneau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panneau;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel1() {
        return jLabel1;
    }
}
