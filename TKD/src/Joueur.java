
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zirend
 */
public class Joueur extends JPanel {
    String poste;
    
    public Joueur() {
        this.setSize(25,25);
        poste = "";
    }
    
    @Override
    public void setName(String poste){
        if (poste.length() > 3) {
            System.out.println("Erreur : nom du poste trop long.");
        }
        else {
            this.poste = poste;
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(0, 0, this.getWidth(), this.getHeight());
    }
    
}
