import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndPose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndPose extends Effects
{
    int transparency;

    public EndPose() {
        transparency = 0;
    }

    public void act() 
    {
        getImage().setTransparency(transparency);
        if (transparency < 254) {
            transparency += 2;
        }

        if (getX() < 650) {
            setLocation(getX() + 2, getY());
        }
    }    
}
