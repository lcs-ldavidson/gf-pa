import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Particle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Particle extends Effects
{

    int speed;
    int wiggle;

    public Particle()
    {
        speed = Greenfoot.getRandomNumber(4) + 8;
        wiggle = Greenfoot.getRandomNumber(8) + 2;
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
