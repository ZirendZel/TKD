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
        this.x = x - 3;
        this.y = y + 14;
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
            //Le centre sous cercle soit sous le curseur.
            g.fillOval(x, y, this.getWidth(), this.getHeight());
        }
        else {
            g.setColor(Color.BLUE);
            g.fillOval(x, y, this.getWidth(), this.getHeight());
        }
    }
    
    public void setCoord(int x, int y){
        this.x = x - 4;
        this.y = y + 15;
    }
    
    @Override
    public int getX(){
        return x;
    }
    @Override
    public int getY() {
        return y;
    }
        
}
