import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MObjeto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MObjeto extends Seleccion
{
    private ArrayList<Obj> objetos;
    public boolean b;
    public MObjeto()
    {
        super.clean(); 
        
        b=false;
        objetos = new ArrayList<Obj>();
        
        NuevoObjeto bt = new NuevoObjeto();
        BtAtras ba = new BtAtras();
        
        addObject(ba, super.getWidth()/2, super.getHeight()/8*7);
        addObject(bt,100,100);
    }
    
    @Override
    public void act()
    {
       MouseInfo mouse = Greenfoot.getMouseInfo();
       if(Greenfoot.mouseClicked(this))
       {
           if(b==true)
           {
               Obj objeto;
               objeto = new Obj();
               objetos.add(objeto);
               this.addObject(objeto,mouse.getX(),mouse.getY());
               b=false;
           }
          else if(b==true && Greenfoot.mouseClicked(Class.class))
           {
               //removeObject(clase);
           }
        }
    }
}
