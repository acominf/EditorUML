import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seleccion here.
 *  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seleccion extends World
{

    public boolean mousePresionado;
    public BClass boton1 = new BClass();
    public BObj boton2 = new BObj();
    public BtAtras bt = new BtAtras();
    public Seleccion()
    {
        super(800, 600, 1); 
        
        addObject(bt,super.getWidth()/2, super.getHeight()/8*7);
        addObject(boton1,super.getWidth()/2,super.getHeight()/3-100);
        addObject(boton2,super.getWidth()/2,super.getHeight()/2);
        
    }
    
    public void clean()
    {
        removeObject(bt);
        removeObject(boton1);
        removeObject(boton2);
    }
}
