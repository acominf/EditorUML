import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.ArrayList;
import java.io.Serializable;
/**
 * Write a description of class Class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Class extends BClass implements Serializable
{
    private String nombre;
    private ArrayList <String> atributo;
    private ArrayList <String> metodo;
   
    public int x,y;
    private int num;
    
    MClase mc =(MClase)getWorld();
    public Class()
    {
        metodo = new ArrayList<String>();
        atributo = new ArrayList <String>();
        nombre = "";
        //num=mc.accedeN();
    }
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        World mundo = this.getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            boolean aux = super.accedeBandera();
            System.out.println(aux);
            if(super.accedeBandera()==true)
            {
                super.modificaBandera(false);
                System.out.println("Entro");
                mundo.removeObject(this);
            }
            else if(mouse.getClickCount()==2)
            {
               String seleccion;
               seleccion = (String)JOptionPane.showInputDialog(
               null,
               "Seleccione una opcion",
               "Selector de opciones",
               JOptionPane.QUESTION_MESSAGE,
               null,
               new Object[] {"Cambia nombre", "Agrega atributo", "Agrega metodo" , 
                   "Muestra propiedades"},
               "Opcion");
               
               switch(seleccion)
               {
                   case "Cambia nombre" : cambiaNombre();
                                          muestraNombre();
                        break;
                   case "Agrega atributo" : agregaAtributo();
                        break;
                   case "Agrega metodo" : agregaMetodo();
                        break;
                   case "Muestra propiedades" : muestraPropiedades(); 
                        break;
               }
            }
            else if(mouse.getButton()==3 )
            {
                mundo.removeObject(this);
               // mc.modificaClases(num);
            }
            
       }
    }   
    
    @Override
     public void agregaAtributo()
    {
        String elemento;
        elemento=JOptionPane.showInputDialog("Atributo: ");
        atributo.add(elemento);
    }
    
    @Override
    public void agregaMetodo()
    {
        String elemento;
        elemento=JOptionPane.showInputDialog("Metodo: ");
        metodo.add(elemento);
    }
     
    @Override
    public void cambiaNombre()
    {
        nombre=JOptionPane.showInputDialog("Nombre de la clase: ");
    }
    
    @Override
    public void muestraPropiedades()
    {
         String mensaje = "Nombre:\n" 
         + nombre + "\n" 
         + "Atributos:\n" 
         + atributo.toString() + "\n"
         + "Metodos:\n"
         + metodo.toString() + "\n";
         JOptionPane.showMessageDialog(null, mensaje,"Propiedades", JOptionPane.INFORMATION_MESSAGE);
              
    }
    
    @Override
    public void muestraNombre()
    {
        World mundo = this.getWorld();
        /*GreenfootImage g = mundo.getBackground();
        Color i = new Color (0,0,0);
        g.setColor(i);
        g.drawString(this.nombre,this.getX()-35,this.getY()-20);
        System.out.println("Nombre");*/
        mundo.showText(this.nombre,this.getX(),this.getY()-20);
        
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
    
}
