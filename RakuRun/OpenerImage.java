import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpenerImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpenerImage extends Effects
{
    int transparency;
    int timeElapsed;

    public OpenerImage() {
        transparency = 255;
    }

    public void act() 
    {

        timeElapsed += 1;

        if (timeElapsed >= 20) {
            transparency -= 5;
        }

        getImage().setTransparency(transparency);

        setLocation(getX() + 1, getY());

        if (transparency <= 5) {
            getWorld().removeObject(this);
        }
    }    
}
