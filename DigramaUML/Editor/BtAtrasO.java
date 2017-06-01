import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtAtrasO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtAtrasO extends Actor
{
    /**
     * Act - do whatever the BtAtrasO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        World mundo = this.getWorld(); 
        if(Greenfoot.mouseClicked(this))
        {
            MObjeto mc =(MObjeto)getWorld();
            mc.modificaLimpia();
            Greenfoot.setWorld(new Principal());
           //((MClase)getWorld()).limpia = true;
        }
    }   
}
