/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package MyFrames;

import Bter_Klep_Dber.Terrain;
import bobTest.FenetrePrincipale;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * L'Utilité de cette Popup est peut être à remettre en cause :
 * (+) On peut changer le nom s'il ne nous convient pas directement,
 *     sans avoir à devoir aller dans le dossier Images.
 * (-) Perte de temps dans la reproduction de la tâche.
 * @author Boris
 */
public class Popup extends javax.swing.JInternalFrame {
    
    private String nomDuJeu = null;
    FenetrePrincipale mainWindow;
    
    public String getNomDuJeu() {
        return nomDuJeu;
    }
    
    /**
     * Creates new form Popup
     * @param parentWindow.
     */
    public Popup(FenetrePrincipale parentWindow) {
        this.mainWindow = parentWindow;
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        
        // Initialisation du nom de l'image :
        // - par défaut, c'est celle du terrain,
        // - possibilité de changer avec la popup, après "OK".
        
        // PAR DEFAUT - Nom de l'image sur le terrain :
        nomDuJeuSaisi.setText(mainWindow.getT().getNomDuJeu().getText());
        System.out.println("nomImage : " + mainWindow.getT().getNomDuJeu().getText());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        nomDuJeuSaisi = new javax.swing.JTextField();
        annuler = new javax.swing.JButton();
        ok = new javax.swing.JButton();

        setClosable(true);

        labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelName.setText("Name");
        labelName.setToolTipText("");

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
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
                        .addComponent(annuler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomDuJeuSaisi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(nomDuJeuSaisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(annuler))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        // Fermer la fenêtre
        this.dispose();
    }//GEN-LAST:event_annulerActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        // Screenshot :
        try {
            // 1. Nom Final 
            nomDuJeu = nomDuJeuSaisi.getText();
            System.out.println("nomImage : " + nomDuJeuSaisi.getText());
            
            // 2. Création d'une icone de la même taille que le terrain
            BufferedImage capture = new Robot()
                    .createScreenCapture(mainWindow.getT().getBounds());
            ImageIcon icon = new ImageIcon(capture);
            
            // 3. Enregistrement dans le dossier 'Images'
            /*ImageIO.write(capture, "png",
                    new File("C:\\Users\\Boris\\Documents"
                            + "\\NetBeansProjects"
                            + "\\TKD\\TKD\\src\\Images\\"
                            + nomDuJeu + ".png"));*/
            ImageIO.write(capture, "png",
                    new File("C:\\Users\\Zirend\\Documents"
                            + "\\NetBeansProjects"
                            + "\\TKD\\TKD\\src\\Images\\"
                            + nomDuJeu + ".png"));
            
            // 4. Affichage de l'image dans la 'ResultFrame',
            //pour voir ce que ça donne et éviter de devoir
            //retourner dans le dossier Images juste pour ça.
            //[ EXCLUSIVELY FOR DEVELOPERS ] (EFD) Boris ^^
            mainWindow.getF().getAfficheImage().setIcon(icon);
            
            
        } catch(HeadlessException | AWTException e) {
            JOptionPane.showMessageDialog(this, e);
        } catch (IOException ex) {
            Logger.getLogger(Popup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Fermer la fenêtre
        this.dispose();
    }//GEN-LAST:event_okActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField nomDuJeuSaisi;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getNomDuJeuSaisi() {
        return nomDuJeuSaisi;
    }
}
