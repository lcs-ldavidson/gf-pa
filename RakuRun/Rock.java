import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    int size;
    
    public Rock() {
        size = Greenfoot.getRandomNumber(200) + 100;
    }
    
    public void act() 
    {
        getImage().scale(size, size);
        setLocation(getX(), getY() + 5);
    }    
}
