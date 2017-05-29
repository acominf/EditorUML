import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.ArrayList;
/**
 * Write a description of class Class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Class extends BClass
{
    private String nombre;
    private ArrayList <String> atributo;
    private ArrayList <String> metodo;
    private EliminaClase ec;
    
    public boolean bandera;
    public Class()
    {
        metodo = new ArrayList<String>();
        atributo = new ArrayList <String>();
        
    }
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        //eliminaClase();
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
               new Object[] {"Cambia nombre", "Agrega atributo", "Agrega metodo" , 
                   "Muestra propiedades"},
               "Opcion");
               
               switch(seleccion)
               {
                   case "Cambia nombre" : cambiaNombre();
                        break;
                   case "Agrega atributo" : agregaAtributo();
                        break;
                   case "Agrega metodo" : agregaMetodo();
                        break;
                   case "Muestra propiedades" : muestraPropiedades(); 
                        break;
               }
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
    
    public void eliminaClase()
    {
        World mundo = this.getWorld();
        if(Greenfoot.mouseClicked(this) && ec.accedeBandera())
        {
            mundo.removeObject(this);
            ec.modificaBandera(false);
        }
    }
}
