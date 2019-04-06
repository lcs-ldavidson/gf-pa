import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mountains here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mountains extends Effects
{
    int transparency;

    public Mountains() {
        transparency = 0;
    }

    public void act() 
    {
        getImage().setTransparency(transparency);
        if (transparency < 254) {
            transparency += 2;
        }

        if (getX() < 490) {
            setLocation(getX() + 1, getY());
        }
    }    
}
