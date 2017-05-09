import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MObjeto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MObjeto extends Seleccion
{

    /**
     * Constructor for objects of class MObjeto.
     * 
     */ 
    public MObjeto()
    {
        super.clean(); 
        
        NuevoObjeto bt = new NuevoObjeto();
        BtAtras ba = new BtAtras();
        
        addObject(ba, super.getWidth()/2, super.getHeight()/8*7);
        addObject(bt,100,100);
    }
}
