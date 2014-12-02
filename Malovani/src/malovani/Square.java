/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malovani;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

    public Square(int x, int y, int x2, int y2, Color c) {
        super(x, y, x2, y2, c);
    }

    @Override
    public void render(Graphics g) {
       g.setColor(getColor());
       g.fillRect(getX(), getY(), calcWidth(), calcHeigth());
    }
    
}
