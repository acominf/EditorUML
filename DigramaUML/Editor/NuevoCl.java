import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Writ e a description of class NuevoCl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NuevoCl extends Actor
{
    /**
     * Act - do whatever the NuevoCl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.setWorld(new MClase());
        }
    }    
}
