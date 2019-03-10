import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AtmosphereClouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AtmosphereClouds extends Actor
{
    int speed;
    int wiggle;

    public AtmosphereClouds()
    {
        speed = Greenfoot.getRandomNumber(4) + 8;
        wiggle = Greenfoot.getRandomNumber(8) + 2;
        getImage().setTransparency(100);
        getImage().scale(100, 100);
    }

    public void act() 
    {
        setLocation(getX() + Greenfoot.getRandomNumber(wiggle) - (wiggle / 2), getY() + speed); 

        if (getY() == 799)
        {
            getWorld().removeObject(this);   
        }

    }    
    
}
