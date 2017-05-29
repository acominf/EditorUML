import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.Serializable;

/**
 * Write a description of class Dependencia here.
 * 
 * @author (your name)  
 * @version (a version number or a date)
 */
public class DepeObj extends Actor implements Serializable
{
    public int x,y;
    public void act() 
    {
        World mundo = this.getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
             ((MObjeto)getWorld()).depe = true;
             if(mouse.getButton()==3 )
            {
                mundo.removeObject(this);
            }
        }
        
    }    
    
    public int dameX()
    {
        return x;
    }
    
    public int dameY()
    {
       return y;
    }
}
