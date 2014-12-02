/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malovani;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author x
 */
public class Pencil extends Shape{

    public Pencil(int x, int y, int x2, int y2, Color c) {
        super(x, y, x2, y2, c);
    }
    
    @Override
    public void render(Graphics g) {
        
       g.setColor(getColor());
       g.setFont(new Font("Ariel",Font.PLAIN, 20));
       g.drawString("Tuzka", getX()-20, getY()-20);
       //g.fillRect(getX(), getY(), calcWidth(), calcHeigth());   
    }
    
}
