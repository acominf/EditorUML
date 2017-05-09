import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtCre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtCre extends Actor
{
    /**
     * Act - do whatever the BtCre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage CreMouse;
    private GreenfootImage CreSinMouse;
    private Seleccion s;
    
    public BtCre()
    {
        CreMouse = new GreenfootImage("btCre2.jpg");
        CreSinMouse = new GreenfootImage("btCre.jpg");
        setImage(CreSinMouse);
    }
    
    
    public void act() 
    {
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Creditos());
        }
    }
    
     public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage(CreMouse);
        }
        else if(Greenfoot.mouseMoved(s))
        {
            setImage(CreSinMouse);
        }
    }
}
