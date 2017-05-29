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
    public EliminaClase()
    {
       
    }
    
    public void act() 
    {
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Elimina");
            super.modificaBandera(true);
            System.out.println(super.accedeBandera());
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
    
    
    
}
 