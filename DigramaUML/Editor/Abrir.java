import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Write a description of class Abrir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abrir extends Actor
{
    private String nombrearchivo; 
    private MClase m;
    public void act()  
    {
        MClase mc =(MClase)getWorld();
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println(mc.regresaarr());
            nombrearchivo=JOptionPane.showInputDialog("Nombre del archivo: ");
            mc.leeArchivo(nombrearchivo+".dat");
            System.out.println("Se presiono abrir con el nombre de archivo "+nombrearchivo);
        } 
    }    
    
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("abrir2.jpg"));
        }
        else if(Greenfoot.mouseMoved(m))
        {
            this.setImage(new GreenfootImage("abrir.jpg"));
        }
    }
}
