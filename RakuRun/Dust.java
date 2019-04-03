import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dust here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dust extends Effects
{
    int size;
    int velocity;
    int spread;
    int rotation;
    int transparency;
    
    public Dust() {
        size = Greenfoot.getRandomNumber(100) + 100;
        spread = Greenfoot.getRandomNumber(8) - 4;
        rotation = Greenfoot.getRandomNumber(10) - 5;
        velocity = -10;
        transparency = 240;
    }
    
    public void act() 
    {
        getImage().setTransparency(transparency);
        getImage().scale(size, size);
        setLocation(getX() + spread, getY() + velocity);
        turn(rotation);
        velocity += 1;
        transparency -= 3;
        
        if (isAtEdge() || transparency <= 4) {
            getWorld().removeObject(this);
        }
    }    
}
