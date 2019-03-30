import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endSkollack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endSkollack extends Effects
{
    int timeElapsed;
    int transparency;
    
    public endSkollack() {
        timeElapsed = 0;
        transparency = 0;
    }
    
    public void act() 
    {
        if (getY() >= 625) {
            setLocation(getX(), getY() - 3);
        }
        
        if (transparency <= 253) {
            transparency += 2;
        }
        
        getImage().setTransparency(transparency);
    }
}
