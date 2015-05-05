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
    TypeRoute type;
    Color couleur;
    ArrayList<Point> routePoints = new ArrayList<>();
    public Point ghost;
    
    public Route(int x, int y) {
        type = TypeRoute.NORMALE;
        routePoints.add(new Point(x+3, y+23));
    }
    
    public void ajouterPoint(Graphics g, int x, int y) {
        routePoints.add(new Point(x+3, y+23));
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
        ghost = new Point(x+3, y+23);
        //super.repaint();
        this.paintComponent(g);


    }
    
    @Override
    public void paintComponent(Graphics g){
        
        // Selon le type de la course la couleur des traits change et est spécifique uà un type de course.
        switch (type) {
            case NORMALE:
                g.setColor(Color.YELLOW);
            break;
            case HOT:
                g.setColor(Color.ORANGE);
            break;
            case BLOCK:
                g.setColor(Color.GRAY);
            break;
            case MOTION:
                g.setColor(Color.BLUE);
            break;
        }
        
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
                    (int)ghost.getX(),
                    (int)ghost.getY());
        }
        //super.paintComponent(g);
        this.repaint();
    }
    
    public void setType(TypeRoute t) {
        type = t;
    }
    
    
}
