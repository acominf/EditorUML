import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtDia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtDia extends Actor
{
    private GreenfootImage DiaMouse;
    private GreenfootImage DiaSinMouse;
    private Seleccion s;
    public BtDia()
    {
        DiaMouse = new GreenfootImage("btDia2.jpg");
        DiaSinMouse = new GreenfootImage("btDia.jpg");
        setImage(DiaSinMouse);
    }
    
    public void act() 
    {
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Seleccion());
        }
        
    } 
    
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage(DiaMouse);
        }
        else if(Greenfoot.mouseMoved(s))
        {
            setImage(DiaSinMouse);
        }
        
    }
} 
