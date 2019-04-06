 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PixelCloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PixelCloud extends Effects
{
    int transparency;
    int speed;
    int timeElapsed;

    public PixelCloud() {
        transparency = 0;
        speed = Greenfoot.getRandomNumber(10) - 5;
    }

    public void act() 
    {
        if (speed == 0) {
            speed = 1;
        }
        
        getImage().setTransparency(transparency);
        if (transparency < 200) {
            transparency += 2;
        }
        timeElapsed += 1;
        if (timeElapsed >= 30) {
            setLocation(getX() + speed, getY());
        }
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        
    }    
}
