package Bter_Klep_Dber;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.awt.event.MouseEvent;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zirend
 */
public class Terrain extends javax.swing.JFrame {

    /**
     * Creates new form Field
     */
    public Terrain() {
        initComponents();
        this.setResizable(false);
        nomDuJeu.setHorizontalAlignment(JTextField.CENTER);
        nomDuJeu.setFont(new Font("Gras", Font.BOLD, 20));
        nomDuJeu.requestFocusInWindow();
        nomDuJeu.setBackground(new Color(0, 0, 0, 0));
        nomDuJeu.setBorder(null);
        nomDuJeu.setOpaque(false);
    }
    
    public Etat etat = Etat.INIT;
    // Fond terrain affiché
    private boolean fondActif = true;
    int x, y;
    // Liste des joueurs
    ArrayList<Joueur> joueurs = new ArrayList<>();
    // Pas de joueur en train de se faire déplacer
    Joueur enDeplacement = null;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        boutonJoueur = new javax.swing.JButton();
        boutonRoute = new javax.swing.JButton();
        boutonFond = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        terrainVide = new javax.swing.JLayeredPane();
        nomDuJeu = new javax.swing.JTextField();
        terrain = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutonJoueur.setText("Joueur");
        boutonJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonJoueurActionPerformed(evt);
            }
        });

        boutonRoute.setText("Route");
        boutonRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonRouteActionPerformed(evt);
            }
        });

        boutonFond.setText("Fond");
        boutonFond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonFondActionPerformed(evt);
            }
        });

        jLabel2.setText("CoordX:");

        jLabel3.setText("X");

        jLabel4.setText("CoordY:");

        jLabel5.setText("Y");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boutonFond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(boutonRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(boutonJoueur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boutonJoueur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRoute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonFond)
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLayeredPane4MouseReleased(evt);
            }
        });
        jLayeredPane4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLayeredPane4MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLayeredPane4MouseMoved(evt);
            }
        });

        nomDuJeu.setText("Nom Du Jeu");
        nomDuJeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomDuJeuMouseClicked(evt);
            }
        });
        nomDuJeu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomDuJeuKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout terrainVideLayout = new javax.swing.GroupLayout(terrainVide);
        terrainVide.setLayout(terrainVideLayout);
        terrainVideLayout.setHorizontalGroup(
            terrainVideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrainVideLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(nomDuJeu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        terrainVideLayout.setVerticalGroup(
            terrainVideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrainVideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomDuJeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        terrainVide.setLayer(nomDuJeu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AFField.jpg"))); // NOI18N

        javax.swing.GroupLayout terrainLayout = new javax.swing.GroupLayout(terrain);
        terrain.setLayout(terrainLayout);
        terrainLayout.setHorizontalGroup(
            terrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        terrainLayout.setVerticalGroup(
            terrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        terrain.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(terrainVide))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addComponent(terrainVide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane4.setLayer(terrainVide, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(terrain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonRouteActionPerformed
        switch(etat){
            case INIT:
                etat = Etat.ROUTE;
                activerRoute();
            break;
            case JOUEUR:
                etat = Etat.ROUTE;
                activerRoute();
            break;
            case ROUTE:
            //Interdit
            break;
            case DRAG:
            //Interdit
            break;
        }
    }//GEN-LAST:event_boutonRouteActionPerformed

    private void boutonJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonJoueurActionPerformed
        switch(etat){
            case INIT:
                etat = Etat.JOUEUR;
                activerJoueur();
            break;
            case JOUEUR:
            //interdit
            break;
            case ROUTE:
                etat = Etat.JOUEUR;
                activerJoueur();
            break;
            case DRAG:
            //Interdit
            break;
        }
    }//GEN-LAST:event_boutonJoueurActionPerformed

    private void jLayeredPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane4MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            // Clic gauche
            switch(etat){
                case INIT:
                //Interdit
                break;
                case JOUEUR:
                    // Création du nouveau joueur, ajout dans la liste et dessiné
                    Joueur joueur = new Joueur(evt.getX(),evt.getY());
                    System.out.println("X = " + evt.getX() + ", Y = " + evt.getY());
                    joueurs.add(joueur);
                    paintPlayers();
                break;
                case ROUTE:
                    //Il se passe quelque chose
                break;
                case DRAG:
                //Interdit
                break;
            }
        }
        else if (evt.getButton() == MouseEvent.BUTTON3) {
            // clic droit
            switch(etat){
                case INIT:
                //Interdit
                break;
                case JOUEUR:
                    // Le joueur le proche proche du clic droit est sélectionné
                    System.out.println("X = " + evt.getX() + ", Y = " + evt.getY());
                    joueurProche(evt.getX(),evt.getY());
                break;
                case ROUTE:
                //Il se passe quelque chose
                break;
                case DRAG:
                //Interdit
                break;
            }
        }
    }//GEN-LAST:event_jLayeredPane4MouseClicked

    private void boutonFondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonFondActionPerformed
        switch(etat){
            // Dans tous les cas :
            // Si le fond est actif, on le desactive, et on le rend invisible
            // L'inverse sinon
            case INIT:
                if (fondActif){
                    fondActif = false;
                    terrain.setVisible(fondActif);
                    paintPlayers();
                }
                else{
                    fondActif = true;
                    terrain.setVisible(fondActif);
                    paintPlayers();
                }
                break;
            case JOUEUR:
                if (fondActif){
                    fondActif = false;
                    terrain.setVisible(fondActif);
                    paintPlayers();
                }
                else{
                    fondActif = true;
                    terrain.setVisible(fondActif);
                    paintPlayers();
                }
                break;
            case ROUTE:
                if (fondActif){
                    fondActif = false;
                    terrain.setVisible(fondActif);
                    paintPlayers();
                }
                else{
                    fondActif = true;
                    terrain.setVisible(fondActif);
                    paintPlayers();
                }
                break;
            case DRAG:
                //Impossible
                break;
        }
    }//GEN-LAST:event_boutonFondActionPerformed

    private void jLayeredPane4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane4MouseMoved
        jLayeredPane4MouseDragged(evt);
    }//GEN-LAST:event_jLayeredPane4MouseMoved

    private void jLayeredPane4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane4MouseReleased
        switch(etat){
            case INIT:
                etat = Etat.INIT;
                break;
            case JOUEUR:
                etat = Etat.JOUEUR;
                break;
            case ROUTE:
                etat = Etat.ROUTE;
                break;
            case DRAG:
                // En relachant, on change les coordonnées du joueurs
                // On le déselectionne
                // On repeint
                enDeplacement.setCoord(evt.getX(),evt.getY());
                enDeplacement.selected = false;
                enDeplacement = null;
                paintPlayers();
                etat = Etat.JOUEUR;
                break;
        }
    }//GEN-LAST:event_jLayeredPane4MouseReleased

    private void jLayeredPane4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane4MouseDragged
        switch(etat){
            // Pour tous : on affiche les coordonnées du curseurs
            case INIT:
                etat = Etat.INIT;
                jLabel3.setText("" + evt.getX());
                jLabel5.setText("" + evt.getY());
                break;
            case JOUEUR:
                etat = Etat.JOUEUR;
                jLabel3.setText("" + evt.getX());
                jLabel5.setText("" + evt.getY());
                break;
            case ROUTE:
                etat = Etat.ROUTE;
                jLabel3.setText("" + evt.getX());
                jLabel5.setText("" + evt.getY());
                break;
            case DRAG:
                jLabel3.setText("" + evt.getX());
                jLabel5.setText("" + evt.getY());
                // On dessine les joueurs à chaque nouveau déplacement
                repaint();
                etat = Etat.DRAG;
                enDeplacement.setCoord(evt.getX(),evt.getY());
                paintPlayers();
                break;
        }
    }//GEN-LAST:event_jLayeredPane4MouseDragged

    private void nomDuJeuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomDuJeuKeyPressed
        if(evt.getKeyCode() == VK_ENTER) {
            nomDuJeu.setFocusable(false);
        }
    }//GEN-LAST:event_nomDuJeuKeyPressed

    private void nomDuJeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomDuJeuMouseClicked
        nomDuJeu.setFocusable(true);
        //Accorde le Focus dans la fenêtre:
        nomDuJeu.requestFocusInWindow();
    }//GEN-LAST:event_nomDuJeuMouseClicked

    
    void activerJoueur(){
        boutonJoueur.setEnabled(false);
        boutonRoute.setEnabled(true);
    }
    
    void activerRoute(){
        boutonJoueur.setEnabled(true);
        boutonRoute.setEnabled(false);
    }
    
    void paintPlayers(){
        // Pour chaque joueur, on dit qu'ils ne sont pas sélectionnés
        // et on les peint avec paintComponent
        for (Joueur joueur : joueurs) {
            joueur.repaint();
            joueur.selected = false;
            joueur.paintComponent(getGraphics());
        }
    }
    
    Joueur joueurProche(int x, int y){
        // Par défaut, la distance est 15 (histoire de ne pas attraper un joueur de trop loin)
        double dist = 15;
        // Par défaut, on renvoie un joueur = null, on n'en trouve pas d'assez près
        Joueur proche = null;
        Graphics g = getGraphics();
        // Pour chaque joueur, on les déselectionne, on les repeint
        for (Joueur joueur : joueurs) {
            joueur.selected = false;
            joueur.paintComponent(g);
            // On fait la distance euclidienne
            double distTmp = sqrt((joueur.x-x)*(joueur.x-x)+((joueur.y-y)*(joueur.y-y)));
            // Si cette distance euclidienne est plus petite que la distance la plus petite précédente :
            if (distTmp < dist){
                // On conserve la distance et le joueur associé
                dist = distTmp;
                proche = joueur;
            }
        }
        // On affiche qu'aucun joueur n'a été sélectionné si on n'en a pas eu
        if (proche == null){
            System.out.println("Pas de joueur proche du clic");
        }
        // On a trouvé un joueur :
        // On dit qu'il est sélectionné, et on le repeint
        else {
            proche.selected = true;
            proche.paintComponent(g);
        }
        // On retourne le joueur
        return proche;
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
            java.util.logging.Logger.getLogger(Terrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonFond;
    private javax.swing.JButton boutonJoueur;
    private javax.swing.JButton boutonRoute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nomDuJeu;
    private javax.swing.JLayeredPane terrain;
    private javax.swing.JLayeredPane terrainVide;
    // End of variables declaration//GEN-END:variables

    public Etat getEtat() {
        return etat;
    }

    public boolean isFondActif() {
        return fondActif;
    }

    public JButton getjButton1() {
        return boutonJoueur;
    }

    public JButton getjButton2() {
        return boutonRoute;
    }

    public JButton getjButton3() {
        return boutonFond;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLayeredPane getjLayeredPane1() {
        return terrainVide;
    }

    public JLayeredPane getjLayeredPane4() {
        return jLayeredPane4;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public JLayeredPane getTerrain() {
        return terrain;
    }    
}
