/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malovani;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author x
 */
public class Oval extends Shape{
    
    public Oval(int x, int y, int x2, int y2, Color c){
        super(x,y,x2,y2,c);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(getColor());
        int w = calcWidth();
        int h = calcHeigth();
        
         if((w < 0) && (h < 0)){
             w = Math.abs(w);
             h = Math.abs(h);
             
              g.fillOval(getX2(), getY2(), w, h);
         }
         else if((w < 0) && (h >= 0)){
             w = Math.abs(w);
             h = Math.abs(h);
             
             g.fillOval(getX2(), getY(), w, h);
             
         }else if((w >= 0) && (h < 0)){
             w = Math.abs(w);
             h = Math.abs(h);
             
             g.fillOval(getX(), getY2(), w, h);
             
         }else{
             g.fillOval(getX(), getY(), w, h);
         }
        
        
    }
    
}
