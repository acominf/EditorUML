import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtAyu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtAyu extends Actor
{
    private GreenfootImage AyuMouse;
    private GreenfootImage AyuSinMouse;
    private Seleccion s;
    
    public BtAyu()
    {
        AyuMouse = new GreenfootImage("btAyu2.jpg");
        AyuSinMouse = new GreenfootImage("btAyu.jpg");
        setImage(AyuSinMouse);
    }
    public void act() 
    {
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new Ayuda());  
    }    
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage(AyuMouse);
        }
        else if(Greenfoot.mouseMoved(s))
        {
            setImage(AyuSinMouse);
        }
    }
}
