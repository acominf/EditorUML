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
public class Guardar extends Actor
{
    private String nombrearchivo;
    private MClase m;
    public void act() 
    {
        MClase mc = (MClase) getWorld();
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
            this.setImage(new GreenfootImage("guardar2.jpg"));
        }
        else if(Greenfoot.mouseMoved(m))
        {
            this.setImage(new GreenfootImage("guardar.jpg"));
        }
    }
}
