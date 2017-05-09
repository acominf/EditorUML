import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BObj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BObj extends Diagrama
{
    private Seleccion s;
    public void act() 
    {
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MObjeto());
        }
    }    
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("btOb2.jpg"));
        }
        else if(Greenfoot.mouseMoved(s))
        {
            this.setImage(new GreenfootImage("btOb.jpg"));
        }
    }
}
 