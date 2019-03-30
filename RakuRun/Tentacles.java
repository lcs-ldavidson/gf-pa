import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tentacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tentacles extends Actor
{
    /**
     * Act - do whatever the Tentacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(((Paluno)getWorld()).skollack1.getX() - 5, ((Paluno)getWorld()).skollack1.getY() + 5);
        turn(-3);
        getImage().scale(200, 200);
        
        getImage().setTransparency(Greenfoot.getRandomNumber(180) + 75);
    }    
}
