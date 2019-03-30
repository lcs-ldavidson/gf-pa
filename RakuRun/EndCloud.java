import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndCloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndCloud extends Effects
{
    
    int turnSpeed;
    
    public EndCloud() {
        turnSpeed = Greenfoot.getRandomNumber(20) - 10;
    }
    
    public void act() 
    {
        getImage().scale(450, 450);
        turn(turnSpeed);
    }    
}
