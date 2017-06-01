import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.*;

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
    private NuevaClase bt;
    private BtAtras bas;
    private Guardar guard;
    private NuevoCl n;
    //
    private boolean here;
    //
    private boolean depe;
    private Abrir abr;
    private Herencia hereB;
    private Dependencia depeB;
    //
    private boolean ba;
    //
    private boolean limpia;
    
    
    private static int num=0;
    public MClase()
    {  
        super.clean();
        ba=false;
        bt = new NuevaClase();
        bas = new BtAtras();
        guard = new Guardar();
        abr = new Abrir();
        hereB = new Herencia();
        depeB = new Dependencia();
        clases= new ArrayList<Class>();
        lineas= new ArrayList<Linea>();
        herencias= new ArrayList<Herencia>();
        dependencias = new ArrayList<Dependencia>();
        n= new NuevoCl();
        addObject(bas, super.getWidth()/2, super.getHeight()/8*7);
        addObject(bt,100,100);
        addObject(guard,300,100);
        addObject(abr,500,100);
        addObject(hereB,700,100);
        addObject(depeB,750,100);
        addObject(n,750,150);
        showText("Nuevo",750,150);
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
               if(clases.isEmpty()){
                   num=0;
               }
               Class clase = new Class(); 
               clase.modificaX(mouse.getX());
               clase.modificaY(mouse.getY());
               this.addObject(clase,mouse.getX(),mouse.getY());
               clases.add(clase);
               System.out.println("Coordenada x: "+clase.dameX());
               clase.asignaN(num);
               System.out.println(num);
               num++;
               
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
                            h.modificaX(mouse.getX());
                            h.modificaY(mouse.getY());
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
                            d.modificaX(mouse.getX());
                            d.modificaY(mouse.getY());
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
               herencias= (ArrayList<Herencia>)objetoEntrada.readObject();
               dependencias= (ArrayList<Dependencia>)objetoEntrada.readObject();
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
        return clases;
    }
    
    public void muestraClases()
    {
        for(Class c : clases)
        {
            addObject(c,c.dameX(),c.dameY());
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
    
    public void modificaClases(int n)
    {
        clases.remove(n);
    }
    
    public void modificaNum()
    {
        num--;
    }
    
    public void modificaHere()
    {
        here=true;
    }
    
    public void modificaBa()
    {
        ba=true;
    }
    
    public void modificaDepe()
    {
        depe=true;
    }
    
    public void modificaLimpia()
    {
        limpia=true;
    }
}
