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
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;



public class PanelListener implements MouseListener,MouseMotionListener{
    
    private Panel panel;
    //private boolean drag = false;
    private Shape drawShape;
    
    public PanelListener(Panel p){
        panel = p;  
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        /*if(!drag){
            drag = true;
        }*/
        
        //System.out.println("Pressed: " + e.getX() + " - " + e.getY());
        
        drawShape = getTmpShape(e.getX(),e.getY(),1,1);//Square(e.getX(),e.getY(),e.getX()+1,e.getY()+1,StaticVars.shapeColor);
        panel.setTmpShape(drawShape);
        //panel.repaint();
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        drawShape.setX2(e.getX());
        drawShape.setY2(e.getY());
        
        List<Shape> shapes = panel.getShapes();
        shapes.add(drawShape);
        panel.setTmpShape(null);
        panel.setShapes(shapes);
        drawShape = null;
        //panel.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(drawShape instanceof Pencil){
        ((Pencil) drawShape).addPoint(new Point(e.getX(), e.getY()));
        
        }
        else{
        drawShape.setX2(e.getX());
        drawShape.setY2(e.getY());
        }
        panel.setTmpShape(drawShape);
        panel.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    private Shape getTmpShape(int x, int y, int x2, int y2){
        switch(StaticVars.shapeType){
            case "Obdelnik":
                return new Square( x, y, x2, y2, StaticVars.shapeColor);
            case "Oval":
                return new Oval( x, y, x2, y2, StaticVars.shapeColor);
            case "Tuzka":
                return new Pencil( x, y, x2, y2, StaticVars.shapeColor);
            case "Usecka":
                return new Line( x, y, x2, y2, StaticVars.shapeColor);    
            default:
                return new Square( x, y, x2, y2, StaticVars.shapeColor);
        }
        
    }

   

    
    
}
