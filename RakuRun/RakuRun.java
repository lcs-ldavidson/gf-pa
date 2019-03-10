import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RakuRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RakuRun extends Actor
{
    int timeElapsed;
    int movement;

    public RakuRun() {
        setImage(new GreenfootImage("Shadow Run", 100, Color.RED, new Color(0, 0, 0, 0), Color.BLACK));
        movement = 10;
    }

    public void act() 
    {

        if (timeElapsed >= 20) {
            setLocation(getX(), getY() - movement);
            
            movement -= 1;
        }

        timeElapsed += 1;
        
        
        if (isAtEdge()) {
         getWorld().removeObject(this);   
        }
    }    
}
