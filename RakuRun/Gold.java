import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gold extends Actor
{
    
    int size;
    
    /**
     * Act - do whatever the Gold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Gold() {
    
        size = Greenfoot.getRandomNumber(20) + 40;
        getImage().scale(size, size);
        
        
    }
    
    public void act() 
    {
        setLocation(getX(), getY() + 5);
        
        if (getY() >= 799)
        {
            getWorld().removeObject(this);
        }
    }    
}
