import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class EliminaClase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EliminaClase extends BClass
{
    private MClase m;
    private ArrayList<Class> borra;
    
    public EliminaClase()
    {
        borra = new ArrayList<Class>();
    }
    
    public void act() 
    {
        funcionMouse();
        
        if(Greenfoot.mouseClicked(this))
        {
            ((MClase)getWorld()).bab = true;
        }           
    }    
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("elimcla2.jpg"));
        }
        else if(Greenfoot.mouseMoved(m))
        {
            this.setImage(new GreenfootImage("elimcla.jpg"));
        }
    }
    
    public void remueveObjeto()
    {
       
    }
}
 