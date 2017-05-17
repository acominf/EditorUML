import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.awt.Graphics;
/**
 * Write a description of class MClase here.
 * 
 * @author (your name)  
 * @version (a version number or a date)
 */
public class MClase extends Seleccion
{

    private ArrayList<Class> clases;
    //Graphics g;
    
    private EliminaClase ec;
    private NuevaClase bt;
    private BtAtras bas;
    
    public boolean ba;
    public boolean bab;
    public MClase()
    {  
        super.clean();
        
        ba=false;
        bab=false;
        
        clases = new ArrayList<Class>();
        
        ec = new EliminaClase();
        bt = new NuevaClase();
        bas = new BtAtras();
        
        addObject(ec,100,500);
        addObject(bas, super.getWidth()/2, super.getHeight()/8*7);
        addObject(bt,100,100);
        
        
        
    }
    
    @Override
    public void act()
    {
       MouseInfo mouse = Greenfoot.getMouseInfo();
       if(Greenfoot.mouseClicked(this))
       {
           if(ba==true)
           {
               Class clase;
               clase = new Class();
               clases.add(clase);
               this.addObject(clase,mouse.getX(),mouse.getY());
               ba=false;
           }
          else if(bab==true && Greenfoot.mouseClicked(Class.class))
           {
               //removeObject(clase);
           }
        }
    }
    
    public void cambiaBa(boolean b)
    {
        ba=b;
    }
    
}
    
  
    
    

