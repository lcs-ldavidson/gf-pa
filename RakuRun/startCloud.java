import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startCloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startCloud extends Effects
{

    int moveX;
    int moveY;
    int rotationSpeed;

    public startCloud() {

        moveX = Greenfoot.getRandomNumber(40) - 20;
        moveY = Greenfoot.getRandomNumber(40) - 20;
        rotationSpeed = Greenfoot.getRandomNumber(10) - 5;

        setImage("darkCloud.png");
        getImage().scale(400, 400);

    }

    public void act() 
    {
        turn(rotationSpeed);
        setLocation(getX() + moveX, getY() + moveY);

        
        
        moveY += 1;
        
        
        if (isAtEdge()) {
            getWorld().removeObject(this);   
        }
    }    
}
