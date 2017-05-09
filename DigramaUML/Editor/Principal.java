import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal extends World
{
    private ArrayList <Diagrama> conjunto;
    
    public Principal()
    {     
        super(800, 600, 1);
        BtDia dia = new BtDia(); 
        BtAyu ayu = new BtAyu();
        BtCre cre = new BtCre();
        Logo l = new Logo();
        
        addObject(dia,super.getWidth()/2,super.getHeight()/4*2);
        addObject(ayu,super.getWidth()/2,super.getHeight()/2+super.getHeight()/4-50);
        addObject(cre,super.getWidth()/2,super.getHeight()-100);
        addObject(l,super.getWidth()/2,super.getHeight()/4);
    }
   
}
