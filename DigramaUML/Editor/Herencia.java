import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.Serializable;

public class Herencia extends Actor implements Serializable
{
    public int x,y;
    public void act() 
    {
        World mundo = this.getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
             ((MClase)getWorld()).here = true;
            
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
