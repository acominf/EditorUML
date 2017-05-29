import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Write a description of class Abrir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbrirO extends Actor
{
    private String nombrearchivo; 
    private MObjeto m;
    public void act()  
    {
        MObjeto mo =(MObjeto)getWorld();
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println(mo.regresaarr());
            nombrearchivo=JOptionPane.showInputDialog("Nombre del archivo: ");
            mo.leeArchivo(nombrearchivo+".dat");
            System.out.println("Se presiono abrir con el nombre de archivo "+nombrearchivo);
        } 
    }    
    
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("abrirO2.jpg"));
        }
        else if(Greenfoot.mouseMoved(m))
        {
            this.setImage(new GreenfootImage("abrirO.jpg"));
        }
    }
}

