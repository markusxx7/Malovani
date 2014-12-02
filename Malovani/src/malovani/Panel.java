/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malovani;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import malovani.PanelListener;
/**
 *
 * @author x
 */
public class Panel extends javax.swing.JPanel{
    
    private PanelListener pl;
    private List<Shape> shapes = new ArrayList<>();
    private Shape tmpShape;
    
     public Panel(){
         setOpaque(true);
         setBackground(Color.WHITE);
         
         pl = new PanelListener(this);
         addMouseListener(pl);
         addMouseMotionListener(pl);
     }
    
     
    @Override
     public void paintComponent(Graphics g){
           
             super.paintComponent(g);
           
             /*if(tmpShape != null){
                 tmpShape.render(g); 
             }*/
             for(Shape s : shapes){
                  if(s != null){
                  s.render(g);
                  }
             }
             
             if(tmpShape != null){
                 tmpShape.render(g);
             }
        
        }
     
     public void setShapes(List<Shape> shapes){
        this.shapes=shapes;
    }
    
    public List<Shape> getShapes(){
       return shapes;
    }
    public void setTmpShape(Shape tmpShape){
        this.tmpShape=tmpShape;
    }
    
    public Shape getTmpShape(){
       return tmpShape;
    }
    
}
