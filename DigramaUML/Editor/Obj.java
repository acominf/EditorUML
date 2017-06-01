import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.ArrayList;
import java.io.Serializable;
/**
 * Write a description of class Obj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obj extends BObj implements Serializable
{
    private String nombre;
    private ArrayList <String> atributobj;
    private ArrayList <String> metodobj;
    private int x,y;
    private int num;
    public Obj()
    {
        metodobj = new ArrayList<String>();
        atributobj = new ArrayList <String>();
    }
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        World mundo = this.getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            if(mouse.getClickCount()==2)
            {
               String seleccion;
               seleccion = (String)JOptionPane.showInputDialog(
               null,
               "Seleccione una opcion",
               "Selector de opciones",
               JOptionPane.QUESTION_MESSAGE,
               null,
               new Object[] {"Cambia nombre", "Agrega atributo", "Muestra propiedades"},
               "Opcion");
               
               switch(seleccion)
               {
                   case "Cambia nombre" : cambiaNombre();
                                          muestraNombre();
                        break;
                   case "Agrega atributo" : agregaAtributo();
                        break;
                   case "Muestra propiedades" : muestraPropiedades(); 
                        break;
               }
            }
            else if(mouse.getButton()==3 )
            {
                MObjeto mc =(MObjeto)getWorld();
                ArrayList<Obj> lista;
                lista=mc.regresaarr();
                lista.remove(this.num);  
                if(this.num < lista.size())
                {
                    for(int i=0; i<lista.size();i++)
                    {
                        Obj auxc;
                        auxc=lista.get(i);
                        auxc.asignaN(i);
                    }
                }
                mc.modificaNum();
                mundo.removeObject(this);
            }
       }
    }    
    
    @Override
     public void agregaAtributo()
    {
        String elemento;
        elemento=JOptionPane.showInputDialog("Atributo: ");
        atributobj.add(elemento);
    }
    
    @Override
    public void cambiaNombre()
    {
        nombre=JOptionPane.showInputDialog("Nombre del objeto: ");
    }
    
    @Override
    public void muestraPropiedades()
    {
         String mensaje = "Nombre:\n" 
         + nombre + "\n" 
         + "Atributos:\n" 
         + atributobj.toString() + "\n";
         JOptionPane.showMessageDialog(null, mensaje,"Propiedades", JOptionPane.INFORMATION_MESSAGE);
              
    }
    
    @Override
    public void muestraNombre()
    {
        World mundo = this.getWorld();
        mundo.showText(this.nombre,this.getX(),this.getY()-25);
        
    }
    
    public void asignaN(int n)
    {
        this.num=n;   
    }
    
     public int dameX()
    {
        return x;
    }
    
    public int dameY()
    {
       return y;
    }
    
    public String dameN()
    {
       return nombre;
    }
    public void modificaX(int x)
    {
        this.x=x;
    }
    
    public void modificaY(int y)
    {
        this.y=y;
    }
    
}
