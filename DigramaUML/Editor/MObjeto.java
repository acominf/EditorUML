import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class MObjeto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MObjeto extends Seleccion
{
    private static ArrayList<Obj> objetos;
    private static ArrayList<Linea> lineas;
    private static ArrayList<DepeObj> dependencias;
    GreenfootImage g;
    private  int a;
    private  int b;
    private  int t;
    private  int p;
    private GuardarO guard;
    private AbrirO abr;
    public boolean depe;
    public boolean limpia;
    private DepeObj depeB;
    public boolean br;
    private static int num=0;
    public MObjeto()
    {
        super.clean(); 
        
        br=false;
        objetos = new ArrayList<Obj>();
        lineas =new ArrayList<Linea>();
        dependencias = new ArrayList<DepeObj>();
        
        NuevoObjeto bt = new NuevoObjeto();
        BtAtrasO ba = new BtAtrasO();
        guard = new GuardarO();
        abr = new AbrirO();
        
        depeB=new DepeObj();
        
        
        addObject(ba, super.getWidth()/2, super.getHeight()/8*7);
        addObject(bt,100,100);
        addObject(guard,300,100);
        addObject(abr,500,100);
       addObject(depeB,750,100);
       
        showText("Borrar con boton derecho",super.getWidth()/4*3, super.getHeight()/8*7);
    }
      
    
    
    
    @Override
    public void act()
    {
        GreenfootImage g= this.getBackground();
        Color c= new Color (0,0,0);
        g.setColor(c);
       MouseInfo raton = Greenfoot.getMouseInfo();
       if(Greenfoot.mouseClicked(this))
       {
           if(br==true)
           {
               if(objetos.isEmpty()){
                   num=0;
               }
               Obj objeto;
               objeto = new Obj();
               objeto.x=raton.getX();
               objeto.y=raton.getY();
               objetos.add(objeto);
               this.addObject(objeto,raton.getX(),raton.getY());
               objeto.asignaN(num);
               System.out.println(num);
               num++;
               br=false;
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
                            
                            DepeObj d = new DepeObj();
                            d.x=raton.getX();
                            d.y=raton.getY();
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
            
            objetoSalida.writeObject(objetos);
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
            g=this.getBackground();
            Color c= new Color (0,0,0);
            g.setColor(c);
            removeObjects(objetos);
            removeObjects(lineas);
            removeObjects(dependencias);
            try{
               FileInputStream flujoEntrada = new FileInputStream(nomArchivo);
               ObjectInputStream objetoEntrada = new ObjectInputStream(flujoEntrada);
                
               ArrayList<Obj> aux = (ArrayList<Obj>)objetoEntrada.readObject();
               ArrayList<DepeObj> auxp = (ArrayList<DepeObj>)objetoEntrada.readObject();
               ArrayList<Linea> auxl = (ArrayList<Linea>)objetoEntrada.readObject();
               for(int i = 0 ; i<aux.size();i++)
               {
                   Obj aux2 = aux.get(i);
                   addObject(aux2,aux2.dameX(),aux2.dameY());
                   showText(aux2.dameN(),aux2.getX(),aux2.getY()-25);
               }
      
               for(int i = 0 ; i<auxp.size();i++)
               {
                   DepeObj aux2 = auxp.get(i);
                   addObject(aux2,aux2.dameX(),aux2.dameY());
               }
               
               for(int i = 0 ; i<auxl.size();i++)
               {
                   Linea aux2 = auxl.get(i);
                   System.out.println(aux2.dameX1()+ "," +aux2.dameY1());
                   g.drawLine(aux2.dameX1(),aux2.dameY1(),aux2.dameX2(),aux2.dameY2());
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
        return objetos;
    }
    
    public Obj regre(int n)
    {
        return objetos.get(n);
    }
    
    public void muestraObjetos()
    {
        for(Obj c : objetos)
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
        objetos.clear();
        lineas.clear();
        dependencias.clear();
    }
}
