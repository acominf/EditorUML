import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Limpia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Limpia extends Actor
{
    /**
     * Act - do whatever the Limpia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this))
        {
           ((MClase)getWorld()).limpia = true;
        }
    }    
}
