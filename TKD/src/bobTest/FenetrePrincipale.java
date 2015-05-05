/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bobTest;

import Bter_Klep_Dber.Terrain;
import MyFrames.Frame1;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Boris
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    Terrain t = new Terrain();  
    Frame1 f = new Frame1();

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
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

        jDesktop = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        MenuFrame = new javax.swing.JMenu();
        Frame1 = new javax.swing.JMenuItem();
        terrain = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        File.setText("File");

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        MenuBar.add(File);

        MenuFrame.setText("Frame");

        Frame1.setText("Frame1");
        Frame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Frame1ActionPerformed(evt);
            }
        });
        MenuFrame.add(Frame1);

        terrain.setText("Terrain");
        terrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terrainActionPerformed(evt);
            }
        });
        MenuFrame.add(terrain);

        MenuBar.add(MenuFrame);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
            try {
                
                Rectangle rect = new Rectangle(t.getX(),t.getY(),t.getWidth(),t.getHeight());
                //t.getX(), t.getY(), t.getWidth(), t.getHeight()
                BufferedImage capture = new Robot().createScreenCapture(rect.getBounds());
                ImageIcon icon = new ImageIcon(capture);//this.getImage(t.getTerrain())
                f.getjLabel1().setIcon(icon);
                ImageIO.write(capture, "png", new File("C:\\Users\\Boris\\Documents\\NetBeansProjects\\TKD\\TKD\\src\\Images\\"+t.getNomDuJeu()+".png"));
            } catch(HeadlessException | AWTException | IOException e) {
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_SaveActionPerformed

    private void Frame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Frame1ActionPerformed
        jDesktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_Frame1ActionPerformed

    private void terrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terrainActionPerformed
        t.setEnabled(true);
        t.setVisible(true);
    }//GEN-LAST:event_terrainActionPerformed

    
    public Image getImage(Component component){
        if(component==null){return null;}
        int width = component.getWidth();
        int height = component.getHeight();
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        component.paintAll(g);
        g.dispose();
        return image;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem Frame1;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuFrame;
    private javax.swing.JMenuItem Save;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenuItem terrain;
    // End of variables declaration//GEN-END:variables
}
