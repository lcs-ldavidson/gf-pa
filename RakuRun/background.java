import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends Effects
{

    int transparency;

    public background() {
        transparency = 0;
    }

    public void act() 
    {
        getImage().setTransparency(transparency);
        if (transparency < 254) {
            transparency += 2;
        }
    }    
}
