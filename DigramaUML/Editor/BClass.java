import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BClass extends Diagrama
{
    private Seleccion s;
    private boolean bandera;
    
    public BClass()
    {
        bandera = false;
    }
    
    public void act() 
    {
        funcionMouse();
        if(Greenfoot.mouseClicked(this))
        {
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
    
    public void modificaBandera(boolean b)
    {
        this.bandera=b;
    }
    
    public boolean accedeBandera()
    {
        return bandera;
    }
    
    public void muestraNombre()
    {
    }
}
