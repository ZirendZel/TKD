package Bter_Klep_Dber;


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
    int x, y;
    boolean selected;
    
    public Joueur(int x, int y) {
        this.x = x;
        this.y = y;
        selected = false;
        this.setSize(16,16);
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
        if (!selected){
            g.setColor(Color.RED);
            g.fillOval(x-4, y+15, this.getWidth(), this.getHeight());
        }
        else {
            g.setColor(Color.BLUE);
            g.fillOval(x-4, y+15, this.getWidth(), this.getHeight());
        }
    }
        
}
