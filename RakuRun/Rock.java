import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    public int size;
    
    public Rock() {
        size = 50;
    }
    
    public void act() 
    {
        getImage().scale(size, size);
        setLocation(getX(), getY() + 5);
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
    
    public int getSize() {
        return size;
    }
}
