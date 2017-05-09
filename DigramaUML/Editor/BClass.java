import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BClass extends Diagrama
{
   /* private GreenfootImage DC;
    private GreenfootImage DCSM;*/
    private Seleccion s;
   
    public void act() 
    {
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Auch");
            Greenfoot.setWorld(new MClase());
        }
    } 
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("btCl2.jpg"));
        }
        else if(Greenfoot.mouseMoved(s))
        {
            this.setImage(new GreenfootImage("btCl.jpg"));
        }
    }
}
