/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malovani;
/**
 *
 * @author x
 */
import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    private int x,y;
    private int x2,y2;
    private Color color;
    
    public Shape(int x, int y, int x2, int y2, Color c){
        this.x=x;
        this.y=y;
        this.x2=x2;
        this.y2=y2;
        this.color = c;
    }
    
    public abstract void render(Graphics g);
    
    public int calcWidth(){
           return x2 - x;      
    }
    public int calcHeigth(){
           return y2 - y;  
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;  
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;  
    }
    public int getX2(){
        return x2;
    }
    public void setX2(int x2){
        this.x2=x2;  
    }
    public int getY2(){
        return y2;
    }
    public void setY2(int y2){
        this.y2=y2;  
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color=color;  
    }
}
