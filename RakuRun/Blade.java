import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blade extends Actor
{
    int timeElapsed;
    int movement;
    int turnSpeed;
    int sizeW;
    int sizeH;

    public Blade() {
        turnSpeed = -17;
        movement = 25;
        sizeW = 380;
        sizeH = 31;
    }

    public void act() 
    {
        if (((Paluno)getWorld()).raku1.getImage() != ((Paluno)getWorld()).raku1.corpse) {

            if (timeElapsed >= 20) {
                setLocation(getX(), getY() - movement);
                turn(turnSpeed);
                movement -= 1;

            }

            timeElapsed += 1;

            if (getY() >= 760) {
                setLocation(getX(), 760);   
                setRotation(0);
            }

        }

        if (((Paluno)getWorld()).endTimer >= 100 && getY() >= 400) {
            setLocation(getX(), getY() - 10);
            turn(-20);
            
            if (getY() == 390) {
             setRotation(0);   
            }

        }

    }    
}    

