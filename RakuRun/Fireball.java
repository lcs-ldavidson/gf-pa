import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{

    GreenfootImage fire1;
    GreenfootImage fire2;
    int timeElapsed;

    public Fireball(int direction) {
        setRotation(direction);

        fire1 = new GreenfootImage("fireball1.PNG");
        fire2 = new GreenfootImage("fireball2.PNG");

        timeElapsed = 0;
        setImage(fire1);

    }

    public void act() 
    {
        move(13);

        if (timeElapsed % 3 == 0) {

            if (getImage() == fire1) {
                setImage(fire2);
            } else {
                setImage(fire1);   
            }
        }

        if (isAtEdge()) {
            getWorld().removeObject(this);
        }

        timeElapsed += 1;
    }    
}
