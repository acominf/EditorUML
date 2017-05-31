import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtAtras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtAtras extends Actor
{
    /**
     * Act - do whatever the BtAtras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
      */
     
    MClase mc = (MClase) getWorld();
    public void act() 
    {
        World mundo = this.getWorld(); 
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Principal());
        }
    }     
}
