import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beam extends Effects
{
    int transparency;
    int transparencyIncrease;
    int turnSpeed;
    
    public Beam() {
        setRotation(Greenfoot.getRandomNumber(360));
        transparency = 0;
        transparencyIncrease = Greenfoot.getRandomNumber(5);
        
        
    }
    public void act() 
    {
        
        setLocation(((Paluno)getWorld()).skollack1.getX(), ((Paluno)getWorld()).skollack1.getY());
        turn(transparencyIncrease);
        transparency += transparencyIncrease;
        if (transparency >= 255) {
            transparency = 255;
        }
        getImage().setTransparency(transparency);
    }    
}
