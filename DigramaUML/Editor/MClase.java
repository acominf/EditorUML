import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.*;
import java.util.Iterator;

public class MClase extends Seleccion implements Serializable
{
    private  static ArrayList<Class> clases;
    private   ArrayList<Linea> lineas;
    private  static ArrayList<Herencia> herencias;
    private  static ArrayList<Dependencia> dependencias;
    private  int a;
    private  int b;
    private  int t;
    private  int p;
    
    
    GreenfootImage g;
    
    
    //private EliminaClase ec;
    private NuevaClase bt;
    private BtAtras bas;
    private Guardar guard;
    public boolean here;
    public boolean depe;
    //public boolean hereA;
    private Abrir abr;
    private Herencia hereB;
    private Dependencia depeB;
    public boolean ba;
    public boolean limpia;
    private Muestra m;
    private Limpia lim;
   // private HerenciaA ha;
    public MClase()
    {  
        super.clean();
        ba=false;
        //clases = new ArrayList<Class>();
        bt = new NuevaClase();
        bas = new BtAtras();
        guard = new Guardar();
        abr = new Abrir();
        m = new Muestra();
        hereB = new Herencia();
        depeB = new Dependencia();
        lim = new Limpia();
        
        
        clases= new ArrayList<Class>();
        lineas= new ArrayList<Linea>();
         herencias= new ArrayList<Herencia>();
         dependencias = new ArrayList<Dependencia>();
        
        //addObject(ec,100,500);
        addObject(bas, super.getWidth()/2, super.getHeight()/8*7);
        addObject(bt,100,100);
        addObject(guard,300,100);
        addObject(abr,500,100);
        addObject(hereB,700,100);
        addObject(depeB,750,100);
        addObject(m,700,150);
        addObject(lim,700,200);
        showText("Borrar con boton derecho",super.getWidth()/4*3, super.getHeight()/8*7);
        
        
    }
    
    @Override
    public void act()
    {
       g=this.getBackground();
       Color c= new Color (0,0,0);
       g.setColor(c);
        MouseInfo raton=Greenfoot.getMouseInfo();
        
        
       MouseInfo mouse = Greenfoot.getMouseInfo();
       GreenfootImage image = new GreenfootImage(800, 600);
       if(Greenfoot.mouseClicked(this))
       {
            
           if(ba==true)
           {              
               Class clase = new Class();
               clase.x=mouse.getX();
               clase.y=mouse.getY();
               this.addObject(clase,mouse.getX(),mouse.getY());
               clases.add(clase);
               System.out.println("Coordenada x: "+clase.dameX());
               ba=false;
            }
       
        }
        
          if(here)
          {
             
           if(Greenfoot.mousePressed(this)){
            t=raton.getX();
            p=raton.getY();
            System.out.println(t +","+p);
           }
           if(Greenfoot.mouseDragged(this)){
                           
                           
                    }
           if(Greenfoot.mouseDragEnded(this)){
                            a=raton.getX();
                            b=raton.getY();
                            
                            
                            Linea linea= new Linea(t,p,a,b);
                            g.drawLine(t,p,a,b);
                            lineas.add(linea);
                            
                            Herencia h = new Herencia();
                            h.x=mouse.getX();
                            h.y=mouse.getY();
                            herencias.add(h);
                            addObject(h,a,b);
                            here=false;
                            
                            System.out.println(herencias);
                            System.out.println(herencias.size());
                            //linea.dibujaLinea();
                        }
        }
        if(depe)
          {
           if(Greenfoot.mousePressed(this)){
            t=raton.getX();
            p=raton.getY();
           }
           if(Greenfoot.mouseDragged(this)){
                           
                           
                    }
           if(Greenfoot.mouseDragEnded(this)){
                            a=raton.getX();
                            b=raton.getY();
                            
                            
                            Linea linea= new Linea(t,p,a,b);
                            g.drawLine(t,p,a,b);
                            lineas.add(linea);
                            
                            Dependencia d = new Dependencia();
                            d.x=mouse.getX();
                            d.y=mouse.getY();
                            dependencias.add(d);
                            addObject(d,a,b);
                            depe=false;
                            System.out.println(dependencias);
                            System.out.println(dependencias.size());
                            //linea.dibujaLinea();
                        }
        }
        else if(limpia == true)
        {
            System.out.println("Limpia es igual a "+limpia);
             borraListas();
             limpia=false;
        } 
    }
    
    public void escribeArchivo(String nomArchivo)
    {
        File archivo = new File(nomArchivo);
        
        try{
            FileOutputStream flujoSalida = new FileOutputStream(archivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(flujoSalida);
            /*if(archivo != null)
            {
                archivo.delete();
                objetoSalida.writeObject(clases);
                objetoSalida.writeObject(herencias);
                objetoSalida.writeObject(dependencias);
                objetoSalida.writeObject(lineas);
                System.out.println(lineas);
            }
            else*/
            
                objetoSalida.writeObject(clases);
                objetoSalida.writeObject(herencias);
                objetoSalida.writeObject(dependencias);
                objetoSalida.writeObject(lineas);
                System.out.println(lineas);
            
            
            objetoSalida.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al escribir el archivo");
        }
    }
    
    public void leeArchivo(String nomArchivo)
    {
           //File archivo = new File(nomArchivo);
            g=this.getBackground();
            Color c= new Color (0,0,0);
            g.setColor(c);
            removeObjects(clases);
            removeObjects(lineas);
            removeObjects(herencias);
            removeObjects(dependencias);
            
            try{
               FileInputStream flujoEntrada = new FileInputStream(nomArchivo);
               ObjectInputStream objetoEntrada = new ObjectInputStream(flujoEntrada);
               ArrayList<Class> aux = (ArrayList<Class>)objetoEntrada.readObject();
               //ArrayList<Herencia> auxh
               herencias= (ArrayList<Herencia>)objetoEntrada.readObject();
               //ArrayList<Dependencia> auxp 
               dependencias= (ArrayList<Dependencia>)objetoEntrada.readObject();
               //ArrayList<Linea> auxl 
               lineas = (ArrayList<Linea>)objetoEntrada.readObject();
               for(int i = 0 ; i<aux.size();i++)
               {
                   Class aux2 = aux.get(i);
                   clases.add(aux2);
                   addObject(aux2,aux2.dameX(),aux2.dameY());
                   showText(aux2.dameN(),aux2.getX(),aux2.getY()-20);
                   
               }       
               for(int i = 0 ; i<herencias.size();i++)
               {
                   Herencia aux3 = herencias.get(i);
                   addObject(aux3,aux3.dameX(),aux3.dameY());
               }
               for(int i = 0 ; i<dependencias.size();i++)
               {
                   Dependencia aux4 = dependencias.get(i);
                   addObject(aux4,aux4.dameX(),aux4.dameY());
               }
               
               for(int i = 0 ; i<lineas.size();i++)
               {
                   Linea aux5 = lineas.get(i);
                   System.out.println(aux5.dameX1()+ "," +aux5.dameY1());
                   g.drawLine(aux5.dameX1(),aux5.dameY1(),aux5.dameX2(),aux5.dameY2());
                   muestraLinea();
               }
               
               objetoEntrada.close();
            }
           
            catch(IOException ex )
            {
                System.out.println(ex.getMessage());
            }
            catch (ClassNotFoundException ex) 
            {
                System.out.println(ex.getMessage());
            } 
            
            
        }
        
        
    public ArrayList regresaarr()
    {
        return lineas;
    }
    
    public void muestraClases()
    {
        for(Class c : clases)
        {
            addObject(c,c.dameX(),c.dameY());
            //g.drawString(aux2.dameN(),aux2.dameX()-35,aux2.dameY()-20);
        }
    }
    
    public void muestraLinea()
    {
        for(Linea l : lineas)
        {
            g.drawLine(l.dameX1(),l.dameY1(),l.dameX2(),l.dameY2());
        }
    } 
    
    public void borraListas()
    {
        clases.clear();
        lineas.clear();
        herencias.clear();
        dependencias.clear();
    }
}