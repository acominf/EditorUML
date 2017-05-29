import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.Serializable;

public class Linea extends Actor implements Serializable
{
    World mundo = this.getWorld(); 
    GreenfootImage g; 
    private int x1,y1,x2,y2; 
    public Linea(int x1,int y1,int x2,int y2)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2; 
        this.y2=y2;
        Color c= new Color (0,0,0);
        //g.setColor(c); 
    }
    
    public void act()
    {
        
    }
  
    public int dameX1()
    {
        return x1;
    }
    
    public int dameY1()
    {
        return y1;
    }
    
    public int dameX2()
    {
        return x2;
    }
    
    public int dameY2()
    {
        return y2;
    }
}
