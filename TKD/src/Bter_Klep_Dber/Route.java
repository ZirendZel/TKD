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

/**
 *
 * @author kevin
 */
public class Route {
    String type;
    Color couleur;
    ArrayList<Point> routePoints = new ArrayList<>();
    
    public Route(int x, int y) {
        type = "";
        routePoints.add(new Point(x, y));
    }
    
    public void ajouterPoint(Graphics g, int x, int y) {
        routePoints.add(new Point(x, y));
        dessinerTrait(g);
    }
    
    public void retirerPoint(Graphics g) {
        routePoints.remove(routePoints.size() - 1);
        dessinerTrait(g);
    }
    
    // Cette fonction dessine un trait entre le point
    // en paramètre et le dernier point de routePoints
    public void dessinerTrait(Graphics g) {
        // Dessin du trait entre les traits déjà dessiné et le point en argument
        for (int p=0;p<routePoints.size() - 1;p++) {
            g.drawLine(
                (int)routePoints.get(p).getX(), 
                (int)routePoints.get(p).getY(),
                (int)routePoints.get(p+1).getX(),
                (int)routePoints.get(p+1).getY() );
        }
                
        
    }
    
    public void paintComponent(Graphics g){
        // TO DO : Selon le type de route, on changera la couleur où le type de trait dessiner
        g.setColor(Color.RED);
        for (int p=0;p<routePoints.size() - 1;p++) {
            g.drawLine(
                (int)routePoints.get(p).getX(), 
                (int)routePoints.get(p).getY(),
                (int)routePoints.get(p+1).getX(),
                (int)routePoints.get(p+1).getY() );
        }
        
    }
    
    public void setType(String t) {
        type = t;
    }
    
    
}
