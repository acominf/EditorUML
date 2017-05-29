import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.Serializable;

public class Cuadro extends Actor implements Serializable
{
    World mundo = this.getWorld(); 
    GreenfootImage g; 
    private int x1,y1; 
    public Cuadro(int x1,int y1)
    {
        this.x1=x1;
        this.y1=y1;
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
    
}
