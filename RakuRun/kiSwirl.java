import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kiSwirl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kiSwirl extends Actor
{
    
    int transparency;
    
    public void act() 
    {
        transparency = ((Paluno)getWorld()).raku1.currentTP();
        
        
        
        setImage("kiSwirl.png");
        getImage().setTransparency(transparency / 2);
        getImage().scale(transparency / 4 + 10, transparency / 4 + 10);
        turn(transparency / 40);
    }    
}
