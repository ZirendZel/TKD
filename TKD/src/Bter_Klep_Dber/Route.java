/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bter_Klep_Dber;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JLayeredPane;

/**
 *
 * @author kevin
 */
public class Route extends JLayeredPane {
    String type;
    Color couleur;
    ArrayList<Point> routePoints = new ArrayList<>();
    public Point ghost;
    
    public Route(int x, int y) {
        type = "";
        routePoints.add(new Point(x-4, y+15));
    }
    
    public void ajouterPoint(Graphics g, int x, int y) {
        routePoints.add(new Point(x-4, y+15));
        dessinerTrait(g);
    }
    
    public void retirerPoint(Graphics g) {
        if (routePoints.size() > 0) {
            routePoints.remove(routePoints.size() - 1);
            dessinerTrait(g);
        }
    }
    
    public void dessinerTrait(Graphics g) {
        // Dessin du trait entre les traits déjà dessiné et le point en argument
        for (int p=0; p < routePoints.size() - 1; p++) {
            g.drawLine(
                (int)routePoints.get(p).getX(), 
                (int)routePoints.get(p).getY(),
                (int)routePoints.get(p+1).getX(),
                (int)routePoints.get(p+1).getY() );
        }
    }
    
    public void dessinerGhost(Graphics g, int x, int y) {
        ghost = new Point(x+4, y+10);
        super.repaint();
        this.paintComponent(g);


    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

                
        // TO DO : Selon le type de route, on changera la couleur où le type de trait dessiner
        //g.setColor(Color.RED);
        
        for (int p=0;p<routePoints.size() - 1;p++) {
            g.drawLine(
                (int)routePoints.get(p).getX(), 
                (int)routePoints.get(p).getY(),
                (int)routePoints.get(p+1).getX(),
                (int)routePoints.get(p+1).getY() );
        } 
        if (ghost != null) {
            Point point = routePoints.get(routePoints.size() - 1);
            g.drawLine(
                    (int)point.getX(), 
                    (int)point.getY(),
                    (int)ghost.getX()-4,
                    (int)ghost.getY()+14 );            
        }
            
    }
    
    public void setType(String t) {
        type = t;
    }
    
    
}
