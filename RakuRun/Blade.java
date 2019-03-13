import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blade extends Actor
{
    int timeElapsed;
    int movement;
    
    public Blade() {
        
        movement = 25;
    }
    
    public void act() 
    {
        if (timeElapsed >= 20) {
            setLocation(getX(), getY() - movement);
            turn(-16);
            movement -= 1;
        }

        timeElapsed += 1;

        if (getY() >= 760) {
            setLocation(getX(), 760);   
            setRotation(0);
        }
    }    
}    

