import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Muestra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muestra2 extends Actor
{
    /**
     * Act - do whatever the Muestra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this))
        {
            MObjeto mc =(MObjeto) getWorld();
            mc.muestraObjetos();
            mc.muestraLinea();
            /*
            ArrayList<Class> object = mc.regresaarr();
            System.out.println(object);
            System.out.println(object.size());
            */
        }
    }    
}
