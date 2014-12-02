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
public class Line extends Shape{

    public Line(int x, int y, int x2, int y2, Color c) {
        super(x, y, x2, y2, c);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getX(), getY(), getX2(), getY2());
    }
    
}
