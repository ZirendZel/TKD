/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package bobTest;

import Bter_Klep_Dber.Terrain;
import MyFrames.Popup;
import MyFrames.ResultFrame;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Boris
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    
    //-----------------------------------//
    //-------- Variables Globales -------//
    //-----------------------------------//
    
    protected final Terrain t;
    protected final ResultFrame f;
    private Popup p;
    
    //-----------------------------------//
    //-------- GETTERS & SETTERS --------//
    //-----------------------------------//
    
    /**
     * 
     * @return un terrain.
     */
    public Terrain getT() {
        return t;
    }

    /**
     * 
     * @return une Frame Resultat
     */
    public ResultFrame getF() {
        return f;
    }
    
    //-----------------------------------//
    //----------- CONSTRUCTEUR ----------//
    //-----------------------------------//
    
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        this.setResizable(true);
        t = new Terrain();
        f = new ResultFrame();
        //p = new Popup(t,f);
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
        terrain = new javax.swing.JMenuItem();
        openProject = new javax.swing.JMenuItem();
        saveProject = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exportAsImage = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        MenuFrame = new javax.swing.JMenu();
        resultFrame = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );

        File.setText("File");

        terrain.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        terrain.setText("New game");
        terrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terrainActionPerformed(evt);
            }
        });
        File.add(terrain);

        openProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openProject.setText("Open game...");
        openProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectActionPerformed(evt);
            }
        });
        File.add(openProject);

        saveProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveProject.setText("Save game...");
        saveProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProjectActionPerformed(evt);
            }
        });
        File.add(saveProject);
        File.add(jSeparator1);

        exportAsImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exportAsImage.setText("Export as image...");
        exportAsImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportAsImageActionPerformed(evt);
            }
        });
        File.add(exportAsImage);
        File.add(jSeparator2);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        File.add(exit);

        MenuBar.add(File);

        MenuFrame.setText("Result");

        resultFrame.setText("Show Result");
        resultFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFrameActionPerformed(evt);
            }
        });
        MenuFrame.add(resultFrame);

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

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void exportAsImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportAsImageActionPerformed
        p = new Popup(this);
        jDesktop.add(p);
        p.show();
        p.toFront();   
    }//GEN-LAST:event_exportAsImageActionPerformed

    private void resultFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFrameActionPerformed
        jDesktop.add(f);
        f.show();
    }//GEN-LAST:event_resultFrameActionPerformed

    private void terrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terrainActionPerformed
        jDesktop.add(t);
        t.setEnabled(true);
        t.setVisible(true);
    }//GEN-LAST:event_terrainActionPerformed

    private void saveProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveProjectActionPerformed

    private void openProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openProjectActionPerformed
    
    
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
    private javax.swing.JMenu File;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuFrame;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem exportAsImage;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem openProject;
    private javax.swing.JMenuItem resultFrame;
    private javax.swing.JMenuItem saveProject;
    private javax.swing.JMenuItem terrain;
    // End of variables declaration//GEN-END:variables
}
