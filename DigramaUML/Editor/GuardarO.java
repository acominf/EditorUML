import greenfoot.*; 
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class Guardar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuardarO extends Actor
{
    private String nombrearchivo;
    private MObjeto m;
    public void act() 
    {
        MObjeto mc = (MObjeto) getWorld();
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        { 
            nombrearchivo=JOptionPane.showInputDialog("Nombre del archivo: ");
            mc.escribeArchivo(nombrearchivo +".dat");
            System.out.println("Se presiono guardar");
        } 
    }  
    
    
    
   public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("guardarO.jpg"));
        }
        else if(Greenfoot.mouseMoved(m))
        {
            this.setImage(new GreenfootImage("guardarO2.jpg"));
        }
    }
}
