import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.Serializable;

/**
 * Write a description of class Dependencia here.
 * 
 * @author (your name)  
 * @version (a version number or a date)
 */
public class Dependencia extends Actor implements Serializable
{
    private int x,y;
    GreenfootImage g;
    public void act() 
    {
        World mundo = this.getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
            MClase mc =(MClase)getWorld();
            g=mundo.getBackground();
            Color c= new Color(255,255,255);
            g.setColor(c);
            mc.modificaBa();
            //((MClase)getWorld()).depe = true;
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
