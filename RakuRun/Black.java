import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Black here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Black extends Effects
{
    int timeElapsed;

    public void act() 
    {
        timeElapsed += 1;

        if (timeElapsed == 10) {
            getWorld().removeObject(this);
        }
    }    
}
