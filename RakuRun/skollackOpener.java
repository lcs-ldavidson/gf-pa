import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skollackOpener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skollackOpener extends Effects
{
    int transparency;
    int timeElapsed;

    public skollackOpener() {
        transparency = 255;
    }

    public void act() 
    {

        timeElapsed += 1;

        if (timeElapsed >= 1) {
            transparency -= 5;
        }

        getImage().setTransparency(transparency);

        setLocation(getX(), getY() - 2);

        if (transparency <= 5) {
            getWorld().removeObject(this);
        }

    }    
}
