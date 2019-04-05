import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hit extends Effects
{
    int timeElapsed;
    int size;
    
    public hit() {
        size = 40;
    }
    
    public void act() 
    {
        if (timeElapsed == 1) {
            setRotation(Greenfoot.getRandomNumber(360));
            move(30);
        }
        timeElapsed += 1;
        size += 10;
        getImage().scale(size, size);
        getImage().setTransparency(150);
        if (timeElapsed >= 7) {
            getWorld().removeObject(this);
        }
    }    
}
