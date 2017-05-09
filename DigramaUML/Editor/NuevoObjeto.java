import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NuevoObjeto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NuevoObjeto extends BObj
{
    private MClase m;
    public void act() 
    {
        funcionMouse();
    }    
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("insertaOb2.jpg"));
        }
        else if(Greenfoot.mouseMoved(m))
        {
            this.setImage(new GreenfootImage("bot2.jpg"));
        }
    }
}
