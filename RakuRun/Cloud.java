import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Effects
{

    int turnsRight;
    int timeElapsed;

    public Cloud()
    {
        turnsRight = Greenfoot.getRandomNumber(10);
        timeElapsed = 0;
    }

    public void act() 
    {
        if (turnsRight >= 5)
        {
            turn(Greenfoot.getRandomNumber(2));
        } else
        {
            turn(Greenfoot.getRandomNumber(2) - 2);
        }

        setLocation(getX() + Greenfoot.getRandomNumber(5) - 2, getY());
        
        timeElapsed = timeElapsed + 1;
        
    }
}
