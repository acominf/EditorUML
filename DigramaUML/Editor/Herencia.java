import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.Serializable;

public class Herencia extends Actor implements Serializable
{
    private int x,y;
    public void act() 
    {
        World mundo = this.getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
            
            MClase mc =(MClase)getWorld();
             //((MClase)getWorld()).here = true;
            mc.modificaHere();
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
     public void modificaX(int x)
    {
        this.x=x;
    }
    
    public void modificaY(int Y)
    {
        this.y=y;
    }
}
