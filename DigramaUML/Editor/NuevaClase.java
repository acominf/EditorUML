import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NuevaClase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NuevaClase extends BClass 
{
    private MClase m;
    MClase mc =(MClase)getWorld();
    public void act() 
    {
        funcionMouse();
        World mundo = this.getWorld(); 
        //MClase mc = new MClase();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
            MClase mc =(MClase)getWorld();
            mc.modificaBa(); 
          // ((MClase)getWorld()).ba = true;
           // mc.aumentaN();
        }
    }  
    
    public void funcionMouse()
    {
        if(Greenfoot.mouseMoved(this))
        {
            this.setImage(new GreenfootImage("inserta2.jpg"));
        }
        else if(Greenfoot.mouseMoved(m))
        {
            this.setImage(new GreenfootImage("bot1.jpg"));
        }
    }
}
  